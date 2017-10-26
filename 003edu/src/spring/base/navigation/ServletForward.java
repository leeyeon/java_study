package spring.base.navigation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.service.domain.User;

public class ServletForward extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("servletForward start");
		
		// request scope
		request.setAttribute("user01", new User("홍길동", "1111"));
		
		// session scope
		HttpSession session = request.getSession();
		session.setAttribute("user02", new User("이순신", "2222"));

		// application scope
		ServletContext application = this.getServletContext();
		application.setAttribute("user03", new User("장보고","3333"));
		
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/02Navigation/view.jsp");
		rd.forward(request, response);
		
		System.out.println("servletForward end");
	}


}
