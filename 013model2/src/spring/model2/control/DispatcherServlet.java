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
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("\n[DispatcherServlet.service() start...]");
		
		// Controller :: Client 요구사항 판단 :: URI
		String actionPage = this.getURI(req.getRequestURI());
		System.out.println("URI ::" + req.getRequestURI());
		System.out.println("Client URI ::" + actionPage);
		
		// Controller :: 선처리와 공통처리
		// 한글처리 / session 관리와 처리 / 선&공통 처리
		req.setCharacterEncoding("EUC-KR");
		
		// businiess logic을 처리하는 controller 선언
		Controller controller = null;
		
		// client request에 대응하는 Controller instance 생성
		// ControllMapping으로 client Request를 처리하는 Controller instance 생성
		ControllerMapping cf = ControllerMapping.getinstance();
		controller = cf.getController(actionPage);
		controller.execute(req, res);
		
		System.out.println("[DispatcherServlet.service() end...]");
	}
	
	private String getURI(String requestURI) {
		int start = requestURI.lastIndexOf('/')+1;
		int end = requestURI.lastIndexOf(".do");
		String actionPage = requestURI.substring(start, end);
		return actionPage;
	}
}
