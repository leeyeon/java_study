package spring.base.objectscope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionScopeTest extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=EUC_KR");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(true);
		
		// 1. session Object Scope  "count" ����.
		Integer count = (Integer)session.getAttribute("count");

		// 2. ���ٸ�..
		//==> name : "count"  value : new Integer(1)  
		if(count == null){
			out.println(" :: Browser �Ѱ� 1 ��° �湮 ::");
			session.setAttribute("count",new Integer(1));
		}
		
		// 3. �ִٸ�..
		//==> session ObjectScope  ������ ���
		//==> count ���� ����(+1)  �ٽ� session ObjectScope ����
		else{
			int changeCount = count.intValue()+1;
			out.println(":: Browser �Ѱ� "+changeCount+" ��° �湮 ::");

			session.setAttribute("count",new Integer(changeCount) );
		}
	}

}
