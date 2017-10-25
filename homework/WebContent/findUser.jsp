<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="service.user.vo.UserVO" %>
<%@ page import="service.user.dao.UserDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	request.setCharacterEncoding("EUC_KR");

	String paramName = null;
	
	// 링크로 들어오면 GET 이니까 method로 판단할 수 있음
	if(request.getMethod().equals("GET")) {
		paramName = ((UserVO)session.getAttribute("user")).getName();
	} else {
		paramName = request.getParameter("name");
	}
	
	// update page로 가기 위해서 session 재지정
	UserDao userDao = new UserDao();
	UserVO userVO = userDao.findUser(paramName);
	session.setAttribute("user", userVO);
	
%>


<html>
<head>
<title>findUser</title>
</head>
<body>
<h2>findUser Check</h2>
	<%if(userVO != null) { %>
	이름: <%= userVO.getName() %><br>
	성별: <%= userVO.getGender() %><br>
	
	생년월일: ( <%=userVO.getCalendar()%> ) <%=userVO.getYear() %> 년 <%=userVO.getMonth() %> 월 <%=userVO.getDay()%>일 <br>
	
	최종학력: <%= userVO.getEducation()%><br>
	직업: <%= userVO.getJob()%><br>
	<%if(!("jobless".equals(userVO.getJob())) || (userVO.getJob().length() != 0)) %>
		소속: <%= userVO.getPosition()%> <br>
	
	결혼여부: <%= userVO.getMarried()%><br>	
	<%if("기혼".equals(userVO.getMarried())) %>
		자녀수: <%= userVO.getChildren() %> <br>
	
	연락처: ( <%= userVO.getTelCheck()%> ) <%= userVO.getTelFirst()%> - <%= userVO.getTelSecond()%> - <%= userVO.getTelThird()%><br>
	휴대폰: ( <%= userVO.getMobileCheck()%> ) <%= userVO.getMobileFirst()%> - <%= userVO.getMobileSecond()%> - <%= userVO.getMobileThird()%><br>
	주소: ( <%= userVO.getCountry()%> ) <%= userVO.getAddress()%><br>

	<%} else { %>
		이름을 확인해주세요. <br>
		입력하신 정보가 없습니다.
	<%}  %>
		
	<p><p><a href='findUserView.jsp'>뒤로</a>
	<p><p><a href='updateUserView.jsp'>내 정보 수정</a>

</body>
</html>