<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="jw.service.user.vo.UserVO" %>
<%@ page import="jw.service.user.dao.UserDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- ����� �ڵ� / workFlow control -->
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
<title>Login ȭ��</title>
</head>
<body>
<h2>Login ȭ��</h2>

	<% if(userVO != null && userVO.isActive()) {%>
		<%= userVO.getId()%> �� ȯ���մϴ�.
		<% session.setAttribute("userVO", userVO); %>
	<% } else { %>
		id,pwd�� Ȯ�����ּ���.
	<% }%>

<p><p><a href='login.html'>�ڷ�</a>

</body>
</html>