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
		UserVO user = userDao.findUser(name);
		
		String gender = user.getGender();
		String year = user.getYear();
		String month = user.getMonth();
		String day = user.getDay();
		String calendar = user.getCalender();
		String education = user.getEducation();
		String job = user.getJob();
		String position = user.getPosition();
		String married = user.getMarried();
		String children = user.getChildren();
		String telFirst = user.getTelFirst();
		String telSecond = user.getTelSecond();
		String telThird = user.getTelThird();
		String telCheck = user.getTelCheck();
		String mobileFirst = user.getMobileFirst();
		String mobileSecond = user.getMobileSecond();
		String mobileThird = user.getMobileThird();
		String mobileCheck = user.getMobileCheck();
		String country = user.getCountry();
		String address = user.getAddress();
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>findUser Check</h2>");
		
		out.println("�̸�: " + name
				+ "<br>����: " + gender);
		out.println("<br>(" + calendar + ") �������: " + year + "�� " + month + "�� " + day + "��");
		out.println("<br>�����з�: " + education
				+ "<br>����: " + job);
		if(!("jobless".equals(job)) || (job.length() != 0))
			out.println("<br>�Ҽ�: " + position);
		
		out.println("<br>��ȥ����: " + married);
		
		if("��ȥ".equals(married))
			out.println("�ڳ��: " + children);
		
		out.println("<br>����ó: ("+telCheck+") "+ telFirst + " - " + telSecond + " - "+ telThird);
		
		out.println("<br>�޴���: ( " +mobileCheck+" ) "+ mobileFirst + " - " + mobileSecond + " - " + mobileThird);
		out.println("<br>�ּ�: (" + country + ") " + address);
		
		out.println("<p><p><a href='/findUser.html'>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
