package jw04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class LoginBeanInitParam extends HttpServlet {
	
	private String jdbcDriver;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPasswd;	

	@Override
	public void init(ServletConfig sc) throws ServletException {
		// TODO Auto-generated method stub
		super.init(sc);
		
		jdbcDriver = sc.getInitParameter("jdbcDriver");
		jdbcURL = sc.getInitParameter("jdbcURL");
		jdbcUser = sc.getInitParameter("jdbcUser");
		jdbcPasswd = sc.getInitParameter("jdbcPasswd");
		
		System.out.println("web.xml에 등록된 InitParam값 추출 유무 확인");
		System.out.println("jbdcDriver: " + jdbcDriver);
		System.out.println("jdbcURL: " + jdbcURL);
		System.out.println("jdbcUser: " + jdbcUser);
		System.out.println("jdbcPasswd: " + jdbcPasswd);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		
		/*  JDBC 시작  */
		
		UserVO userVO = new UserVO(id,pwd);
		UserDao userDao = new UserDao();
		
		UserInitParamDao dao = new UserInitParamDao(jdbcDriver, jdbcURL, jdbcUser, jdbcPasswd);
		dao.getUser(userVO);
		
		/*  JDBC 종료  */
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login 화면</h2>");
		
		if(userVO.isActive()) {
			out.println(id+"님 환영합니다.");
		} else {
			out.println("id,pwd를 확인해주세요.");
		}
		
		out.println("<p><p><a href='jw04/loginBeanInitParam.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
