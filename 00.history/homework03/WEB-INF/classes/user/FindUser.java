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
		
		// findUser.html 인지 session 인지 구분.
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
			
			out.println("<br>연락처: ( "+telCheck+" ) "+ telFirst + " - " + telSecond + " - "+ telThird);
			
			out.println("<br>휴대폰: ( " +mobileCheck+" ) "+ mobileFirst + " - " + mobileSecond + " - " + mobileThird);
			out.println("<br>주소: ( " + country + " ) " + address);
		
		} else {
			out.println("이름을 확인해주세요. <br>입력하신 정보가 없습니다.");		
		}
		
		out.println("<p><p><a href='findUser.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
