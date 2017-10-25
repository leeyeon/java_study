package user;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Util.ConvertUtil;

/**
 * Servlet implementation class Information
 */
//@WebServlet("/Information")
public class FindUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=euc_kr");
		PrintWriter out = res.getWriter();
		
		String paramName = req.getParameter("name");
		UserDao userDao = new UserDao();
		UserVO userVO = null;
		
		// findUser.html ���� session ���� ����.
		if( !(paramName == null || paramName.equals(""))) {
			userVO = userDao.findUser(paramName);
		} else {
			userVO = (UserVO)(req.getSession(true).getAttribute("user"));
		}
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>findUser Check</h2>");
		
		if(userVO != null) {
			String name = userVO.getName();
			String gender = userVO.getGender();
			String year = userVO.getYear();
			String month = userVO.getMonth();
			String day = userVO.getDay();
			String calendar = userVO.getCalendar();
			String education = userVO.getEducation();
			String job = userVO.getJob();
			String position = userVO.getPosition();
			String married = userVO.getMarried();
			String children = userVO.getChildren();
			String telFirst = userVO.getTelFirst();
			String telSecond = userVO.getTelSecond();
			String telThird = userVO.getTelThird();
			String telCheck = userVO.getTelCheck();
			String mobileFirst = userVO.getMobileFirst();
			String mobileSecond = userVO.getMobileSecond();
			String mobileThird = userVO.getMobileThird();
			String mobileCheck = userVO.getMobileCheck();
			String country = userVO.getCountry();
			String address = userVO.getAddress();
			
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
			
			out.println("<br>����ó: ( "+telCheck+" ) "+ telFirst + " - " + telSecond + " - "+ telThird);
			
			out.println("<br>�޴���: ( " +mobileCheck+" ) "+ mobileFirst + " - " + mobileSecond + " - " + mobileThird);
			out.println("<br>�ּ�: ( " + country + " ) " + address);
		
		} else {
			out.println("�̸��� Ȯ�����ּ���. <br>�Է��Ͻ� ������ �����ϴ�.");		
		}
		
		out.println("<p><p><a href='findUser.html'>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
