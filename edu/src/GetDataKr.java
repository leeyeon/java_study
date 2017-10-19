import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	ㅇ Servlet Life Cycle  이해 및 확인
*/
public class GetDataKr extends HttpServlet{

	//Client request 시 마다 호출되는 service() method
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
		out.println("<p><p><a href='edu/getData.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");

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