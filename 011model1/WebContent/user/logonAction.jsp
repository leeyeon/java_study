<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="spring.model1.service.user.vo.UserVO" %>
<%@ page import="spring.model1.service.user.dao.UserDao" %>
<%
	UserVO userVO = (UserVO)session.getAttribute("userVO");
	if(userVO == null) {
		userVO = new UserVO();
	}
%>
<html>
<head></head>
<body>

<!-- �α����� ȸ�� -->
<% if(userVO.isActive()) { %>
	<jsp:forward page="home.jsp"/>
<% } %>

<!-- �� �α����� ȸ�� -->
<%
	request.setCharacterEncoding("EUC_KR");
	
	String userId = request.getParameter("userId");
	String userPasswd = request.getParameter("userPasswd");
	
	String targetAction = "logon.jsp";
	
	userVO.setUserId(userId);
	userVO.setUserPasswd(userPasswd);
	
	UserDao userDAO = new UserDao();
	userDAO.getUser(userVO);
	
	if(userVO.isActive()) {
		session.setAttribute("userVO", userVO);
		targetAction = "home.jsp";
	}
%>

<!-- Navigation -->
<jsp:forward page='<%= targetAction %>'/>
</body>
</html>