<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="service.user.vo.UserVO" %>
<%@ page import="service.user.dao.UserDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%	
	request.setCharacterEncoding("EUC_KR");
	UserVO userVO = null;
	
	String name = request.getParameter("name");
	out.println(name);
	String gender = request.getParameter("gender");
	String year = request.getParameter("year");
	String month = request.getParameter("month");
	String day = request.getParameter("day");
	String calendar = request.getParameter("calendar");
	String education = request.getParameter("education");
	String job = request.getParameter("job");
	String position = "";
	if(!"jobless".equals(job)) {
		 position = request.getParameter("position");
	}
	String married = "미혼";
	if(Boolean.parseBoolean(request.getParameter("married")))
		married = "기혼";
	String children = "";
	if("기혼".equals(married)) {
		children = request.getParameter("children");
	}
	String telFirst = request.getParameter("tel_first");
	String telSecond = request.getParameter("tel_second");
	String telThird = request.getParameter("tel_third");
	String telCheck = request.getParameter("tel_check");
	String mobileFirst = request.getParameter("mobile_first");
	String mobileSecond = request.getParameter("mobile_second");
	String mobileThird = request.getParameter("mobile_third");
	String mobileCheck= request.getParameter("mobile_check");
	String address = request.getParameter("address");
	String country = request.getParameter("country");
	
	
	/* session setting */
	
	if( !(name == null || name.equals(""))) {
		
		userVO = new UserVO(name, gender, year, month, day, calendar, education,
				job, position, married, children, telFirst, telSecond,
				telThird, telCheck, mobileFirst, mobileSecond, mobileThird,
				mobileCheck, country, address);
	
		UserDao userDao = new UserDao();
		userDao.updateUser(userVO);
		
		request.getSession(true).setAttribute("user", userVO);
	}


%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>수정 완료</title>
</head>
<body>
	수정이 완료되었습니다.
</body>
</html>