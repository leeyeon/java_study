package user;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=euc_kr");
		PrintWriter out = res.getWriter();
		
		// Client Form 데이터 처리
		req.getParameterMap();
		UserVO user = new UserVO();
		
		String name = req.getParameter("name");
		String gender = "남자";
		if(Boolean.parseBoolean(req.getParameter("gender")))
			gender = "여자";
		String year = req.getParameter("year");
		String month = req.getParameter("month");
		String day = req.getParameter("day");
		String calendar = req.getParameter("calendar");
		String education = req.getParameter("education");
		String job = req.getParameter("job");
		String position = "";
		if(!"jobless".equals(job)) {
			 position = req.getParameter("position");
		}
		String married = "미혼";
		if(Boolean.parseBoolean(req.getParameter("married")))
			married = "기혼";
		String children = "";
		if("기혼".equals(married)) {
			children = req.getParameter("children");
		}
		String telFirst = req.getParameter("tel_first");
		String telSecond = req.getParameter("tel_second");
		String telThird = req.getParameter("tel_third");
		String telCheck = req.getParameter("tel_check");
		String mobileFirst = req.getParameter("mobile_first");
		String mobileSecond = req.getParameter("mobile_second");
		String mobileThird = req.getParameter("mobile_third");
		String mobileCheck= req.getParameter("mobile_check");
		String address = req.getParameter("address");
		String country = req.getParameter("country");
		

		/* 여기다가 마저 쓰깅 */
		
		UserVO userVO = new UserVO(name, gender, year, month, day, calendar, education,
				job, position, married, children, telFirst, telSecond,
				telThird, telCheck, mobileFirst, mobileSecond, mobileThird,
				mobileCheck, country, address);
		
		UserDao userDao = new UserDao();
		userDao.addUser(userVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>addUser Check</h2>");
		if(userDao.getIsSuccess() == 1) {
			out.println(name+"님 회원가입이 완료되었습니다.");
		} else {
			out.println("회원가입에 실패하였습니다.");
		}
		out.println("<p><p><a href='addUser.html'>뒤로</a>");
		out.println("<p><p><a href='findUser.html'>내 정보 보기</a>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
