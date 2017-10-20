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
public class LoginBeanDataSource extends HttpServlet {


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		/*  JDBC 시작  */
		
		UserVO userVO = new UserVO(id,pwd);
		
		UserDataSourceDao userDataSourceDao = new UserDataSourceDao();
		userDataSourceDao.getUser(userVO);
		
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
