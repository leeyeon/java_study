import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	�� Servlet Life Cycle  ���� �� Ȯ��
*/
public class GetData extends HttpServlet{

	//Client request �� ���� ȣ��Ǵ� service() method
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{

		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();

		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");

		System.out.println(clientName+" : "+clientAddr);

		out.println("<html>");
		out.println("<head><title>Getdata.java</title></head>");
		out.println("<body>");
		out.println("<h2>Get Test</h2>");
		out.println("<li> �̸�: " + clientName);
		out.println("<li> �ּ�: " + clientAddr);
		out.println("<p><p><a href='edu/getData.html'>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");

		out.flush();
		out.close();
	}

}//end of class