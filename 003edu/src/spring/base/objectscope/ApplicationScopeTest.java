package spring.base.objectscope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ApplicationScopeTest extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=EUC_KR");
		PrintWriter out = response.getWriter();
		
		ServletContext application = this.getServletContext();
		
		// 1. session Object Scope  "count" 추출.
		Integer count = (Integer)application.getAttribute("count");

		// 2. 없다면..
		//==> name : "count"  value : new Integer(1)  
		if(count == null){
			out.println(" :: Browser 켜고 1 번째 방문 ::");
			application.setAttribute("count",new Integer(1));
		}
		
		// 3. 있다면..
		//==> session ObjectScope  추출한 출력
		//==> count 값을 증가(+1)  다시 session ObjectScope 저장
		else{
			int changeCount = count.intValue()+1;
			out.println(":: Browser 켜고 "+changeCount+" 번째 방문 ::");

			application.setAttribute("count",new Integer(changeCount) );
		}
		
	}

}
