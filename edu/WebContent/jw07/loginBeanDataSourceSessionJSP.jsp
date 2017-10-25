<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%--<%@ page import = "jw04.*" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
	request.setCharacterEncoding("EUC_KR");
	
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	jw04.UserVO userVO = (jw04.UserVO)session.getAttribute("userVO");
	System.out.println("session에 저장된 UserVO 유무 확인 : "+userVO);
	
	
	if( !(id == null || id.equals(""))) {
		userVO = new jw04.UserVO(id,pwd);
		
		jw04.UserDataSourceDao userDataSourceDao = new jw04.UserDataSourceDao();
		userDataSourceDao.getUser(userVO);
	}
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

<p><p><a href='LoginBeanDataSourceSessionJSP.html'>뒤로</a>

</body>
</html>