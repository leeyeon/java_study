package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionUserCookieOne
 */
//@WebServlet("/SessionUserCookieOne")
public class SessionUserCookieTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(int i=0; i<cookies.length; i++) {
				System.out.print("\nCookie�� ����� ���� : ");
				System.out.println(cookies[i].getName()+" : " + cookies[i].getValue());
			}
		}
		
		HttpSession session = req.getSession(false);
		
		out.println("<html><body>");
		
		if(session != null) {
			out.println("UNIQUE�� JSESSIONID�� : "+session.getId()+" �����<br>");
			String name = (String)session.getAttribute("name");
			out.println("�̸� : "+name);
		} else {
			out.println("ó���Դϴ�");
		}
		
		out.println("</body></html");
	}

}
