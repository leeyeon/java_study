<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%--<%@ page import = "jw04.*" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
	request.setCharacterEncoding("EUC_KR");
	
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	jw04.UserVO userVO = (jw04.UserVO)session.getAttribute("userVO");
	System.out.println("session�� ����� UserVO ���� Ȯ�� : "+userVO);
	
	
	if( !(id == null || id.equals(""))) {
		userVO = new jw04.UserVO(id,pwd);
		
		jw04.UserDataSourceDao userDataSourceDao = new jw04.UserDataSourceDao();
		userDataSourceDao.getUser(userVO);
	}
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

<p><p><a href='LoginBeanDataSourceSessionJSP.html'>�ڷ�</a>

</body>
</html>