package user;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Util.ConvertUtil;

/**
 * Servlet implementation class Information
 */
//@WebServlet("/Information")
public class FindUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=euc_kr");
		PrintWriter out = res.getWriter();
		
		String name = ConvertUtil.convertKo(req.getParameter("name"));
		UserDao userDao = new UserDao();
		userDao.findUser(name);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>findUser Check</h2>");
		
		out.println("이름: " + name
				+ "<br>성별: " + gender);
		out.println("<br>(" + calendar + ") 생년월일: " + year + "년 " + month + "월 " + day + "일");
		out.println("<br>최종학력: " + education
				+ "<br>직업: " + job);
		if(!("jobless".equals(job)) || (job.length() != 0))
			out.println("<br>소속: " + position);
		
		out.println("<br>결혼여부: " + married);
		
		if("기혼".equals(married))
			out.println("자녀수: " + children);
		
		out.println("<br>연락처: ("+telCheck+") "+ telFirst + " - " + telSecond + " - "+ telThird);
		
		out.println("<br>휴대폰: ( " +mobileCheck+" ) "+ mobileFirst + " - " + mobileSecond + " - " + mobileThird);
		out.println("<br>주소: (" + country + ") " + address);
		
		
		out.println("<p><p><a href='/homwork.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
