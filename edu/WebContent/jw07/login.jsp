<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="jw.service.user.vo.UserVO" %>
<%@ page import="jw.service.user.dao.UserDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- 방어적 코딩 / workFlow control -->
<% if(request.getMethod().equals("GET")) { %>
		<jsp:forward page="login.html"/>
<%
	}

	request.setCharacterEncoding("EUC_KR");
	
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	UserVO userVO = new UserVO(id,pwd);
	
	UserDao userDao = new UserDao();
	userDao.getUser(userVO);
%>
<html>
<head>
<title>Login 화면</title>
</head>
<body>
<h2>Login 화면</h2>

	<% if(userVO != null && userVO.isActive()) {%>
		<%= userVO.getId()%> 님 환영합니다.
		<% session.setAttribute("userVO", userVO); %>
	<% } else { %>
		id,pwd를 확인해주세요.
	<% }%>

<p><p><a href='login.html'>뒤로</a>

</body>
</html>