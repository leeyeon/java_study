package jw04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class LoginBean extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		
		/*  JDBC ����  */
		
		DbBean dbBean = new DbBean();
		dbBean.setId(id);
		dbBean.setPwd(pwd);
		
		boolean isLogin = dbBean.getUser();
		
		/*  JDBC ����  */
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login ȭ��</h2>");
		
		if(isLogin) {
			out.println(id+"�� ȯ���մϴ�.");
		} else {
			out.println("id,pwd�� Ȯ�����ּ���.");
		}
		
		out.println("<p><p><a href='jw04/loginBean.html'>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
