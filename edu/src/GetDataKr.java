import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	�� Servlet Life Cycle  ���� �� Ȯ��
*/
public class GetDataKr extends HttpServlet{

	//Client request �� ���� ȣ��Ǵ� service() method
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
		out.println("<li> �̸�: " + clientNameKo);
		out.println("<li> �ּ�: " + clientAddrKo);
		out.println("<p><p><a href='edu/getData.html'>�ڷ�</a>");
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
			System.out.println("�ѱ� ��ȯ�� Exception �߻�");
			uee.printStackTrace();
		}
		
		return convertParamValue;
	}

}//end of class