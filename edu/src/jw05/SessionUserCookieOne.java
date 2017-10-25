package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionUserCookieOne
 */
//@WebServlet("/SessionUserCookieOne")
public class SessionUserCookieOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession session = req.getSession(true);
		
		if(session.isNew()) {
			session.setAttribute("name", "홍길동");
		}
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		out.println("<html><body>");
		System.out.println("UNIQUE한 JSESSIONID는 : "+session.getId());
		
		if(session.isNew()) {
			out.println("세션이 새로 생성됨 <br>");
		} else {
			out.println("UNIQUE한 JSESSIONID는 : "+session.getId()+" 사용중");
		}
		out.println("<a href='/edu/SessionUserCookieTwo'>링크</a>");
		out.println("</body></html");
	}

}
