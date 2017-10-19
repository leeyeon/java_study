package jw02;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetDataKrATagServletMapping extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{

		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();

		String clientNameKo = convertKo(req.getParameter("name"));
		String clientAddrKo = convertKo(req.getParameter("addr"));

		System.out.println(clientNameKo+" : "+clientAddrKo);

		out.println("<html>");
		out.println("<head><title>GetdataKr.java</title></head>");
		out.println("<body>");
		out.println("<h2>Get Test</h2>");
		out.println("<li> 이름: " + clientNameKo);
		out.println("<li> 주소: " + clientAddrKo);
		out.println("<p><p><a href='getDataKrATagServletMapping.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");

		out.println("<p><a href='GetDataKrATagServletMapping?name=홍길동&addr=서울'>"
						+ "자기자신</a>");

		out.flush();
		out.close();

	}

	private String convertKo(String paramValue) {
		String convertParamValue = null;

		try {
			byte[] b = paramValue.getBytes("8859_1");
			convertParamValue = new String(b, "EUC_KR");
		}
		catch (UnsupportedEncodingException uee) {
			System.out.println("한글 변환중 Exception 발생");
			uee.printStackTrace();
		}
		
		return convertParamValue;
	}

}//end of class