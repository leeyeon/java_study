<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="spring.model2.service.user.vo.UserVO" %>
<% //UserVO userVO = (UserVO)session.getAttribute("userVO"); %>
<html>
<head></head>
<body>
	<% //if(userVO == null || userVO.isActive() != true) { %>
		<!-- <form id="logon" method="post" action="logonAction.jsp">  -->
		<form id="logon" method="post" action="logonAction.do">
		
			아 이 디 : <input id="userId" type="text" name="userId" value=""><br><br>
			패스워드 : <input id="userId" type="text" name="userPasswd" value=""><br><br>
			<input id="submit" type="submit" name="submit" value="Enter"/>
		
		</form>
	<% //} else { %>
	
		<%-- <%= userVO.getUserId()  님은 이미 로그인하셨습니다. --%> 
	
	<% //} %>

</body>
</html>