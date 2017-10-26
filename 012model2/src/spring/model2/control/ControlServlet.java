package spring.model2.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.model2.service.user.dao.UserDao;
import spring.model2.service.user.vo.UserVO;

/**
 * Servlet implementation class ControlServlet
 */
@WebServlet("/ControlServlet")
public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		//==> web.xml 설정 ... load-on-startup 확인하기
		System.out.println("\n\n=================================");
		System.out.println("ControlServlet의 init() Method");
		System.out.println("=================================\n");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("\n[ControlServlet.service() start...]");
		
		// Controller :: Client 요구사항 판단 :: URI
		String actionPage = this.getURI(request.getRequestURI());
		System.out.println("URI ::" + request.getRequestURI());
		System.out.println("Client URI ::" + actionPage);
		
		// Controller :: 선처리와 공통처리
		// 한글처리 / session 관리와 처리 / 선&공통 처리
		request.setCharacterEncoding("EUC-KR");
		HttpSession session = request.getSession(true);
		
		// defalut navigation setting
		String requestPage = "/user/logon.jsp";
		
		// session 없으면 세팅하기
		if(session.isNew() || session.getAttribute("userVO") == null) {
			session.setAttribute("userVO", new UserVO());
		}
		
		// session 있으면 가져오기
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		
		// userVO.isActive() 로 로그인 여부 판단 ...
		if(userVO != null && userVO.isActive()) {
			requestPage = "/user/home.jsp";
			
		// logon.do :: Business logic X
		} else if (actionPage.equals("logon")) {
		
		// loginAction.do :: Client 요구사항 처리 및 Business logic 처리
		} else if (actionPage.equals("logonAction")) {
			
			// client form data 처리
			String userId = request.getParameter("userId");
			String userPasswd = request.getParameter("userPasswd");
			
			// model 과 view 연결 :: binding
			userVO.setUserId(userId);
			userVO.setUserPasswd(userPasswd);
			
			// Business logic 처리
			UserDao userDao = new UserDao();
			userDao.getUser(userVO);
			
			// navigation
			if(userVO.isActive()) {
				requestPage = "/user/home.jsp";
			}
		
		// home.do :: deault request page 로 forward
		} else if (actionPage.equals("home")) {
			
		}
		
		System.out.println("최종 결정된 View page :: [[" + requestPage +"]]");
		
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher(requestPage);
		rd.forward(request, response);
		
		System.out.println("[ControlServlet.service() end...]");
	}
	
	private String getURI(String requestURI) {
		int start = requestURI.lastIndexOf('/')+1;
		int end = requestURI.lastIndexOf(".do");
		String actionPage = requestURI.substring(start, end);
		return actionPage;
	}
}
