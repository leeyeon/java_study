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
		
			�� �� �� : <input id="userId" type="text" name="userId" value=""><br><br>
			�н����� : <input id="userId" type="text" name="userPasswd" value=""><br><br>
			<input id="submit" type="submit" name="submit" value="Enter"/>
		
		</form>
	<% //} else { %>
	
		<%-- <%= userVO.getUserId()  ���� �̹� �α����ϼ̽��ϴ�. --%> 
	
	<% //} %>

</body>
</html>