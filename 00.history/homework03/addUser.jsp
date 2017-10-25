<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="user.UserVO" %>
<%@ page import="user.UserDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	request.setCharacterEncoding("EUC_KR");
	UserVO userVO = null;

	String name = request.getParameter("name");
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
		userDao.addUser(userVO);
		
		request.getSession(true).setAttribute("user", userVO);
	}

%>

<html>
<head>
<title>adduser.jsp</title>
</head>
<body>

<h2>addUser Check</h2>

<% if(userVO.isSuccess()) { %>
		<%=name %>님 회원가입이 완료되었습니다.
	<% } else { %>
		회원가입에 실패하였습니다.
<% } %>

<p><p><a href='addUser.html'>뒤로</a>
<p><p><a href='findUser.html'>내 정보 보기</a>
<p><p><a href='FindUser'>내 정보 바로 보기</a>
		

</body>
</html>