package jw05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieWriterToClient
 */
//@WebServlet("/CookieWriterToClient")
public class CookieWriterToClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		Cookie cookie = new Cookie("name",URLEncoder.encode("홍길동"));
		
		cookie.setMaxAge(60*60);
		res.addCookie(cookie);
		
		out.println("<html><body>");
		out.println("cookie 저장 완료");
		out.println("</body></html");
		
	}

	
}
