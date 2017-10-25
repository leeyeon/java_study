<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="user.UserVO" %>
<%@ page import="user.UserDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	request.setCharacterEncoding("EUC_KR");

	String paramName = request.getParameter("name");
	UserDao userDao = new UserDao();
	UserVO userVO = null;
	
	// findUser.html ���� session ���� ����.
	if( !(paramName == null || paramName.equals(""))) {
		userVO = userDao.findUser(paramName);
	} else {
		userVO = (UserVO)(request.getSession(true).getAttribute("user"));
	}
%>


<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h2>findUser Check</h2>
	<%if(userVO != null) { %>
	�̸�: <%= userVO.getName() %><br>
	����: <%= userVO.getGender() %><br>
	
	�������: ( <%=userVO.getCalendar()%> ) <%=userVO.getYear() %> �� <%=userVO.getMonth() %> �� <%=userVO.getDay()%>�� <br>
	
	�����з�: <%= userVO.getEducation()%><br>
	����: <%= userVO.getJob()%><br>
	<%if(!("jobless".equals(userVO.getJob())) || (userVO.getJob().length() != 0)) %>
		�Ҽ�: <%= userVO.getPosition()%> <br>
	
	��ȥ����: <%= userVO.getMarried()%><br>	
	<%if("��ȥ".equals(userVO.getMarried())) %>
		�ڳ��: <%= userVO.getChildren() %> <br>
	
	����ó: ( <%= userVO.getTelCheck()%> ) <%= userVO.getTelFirst()%> - <%= userVO.getTelSecond()%> - <%= userVO.getTelThird()%><br>
	�޴���: ( <%= userVO.getMobileCheck()%> ) <%= userVO.getMobileFirst()%> - <%= userVO.getMobileSecond()%> - <%= userVO.getMobileThird()%><br>
	�ּ�: ( <%= userVO.getCountry()%> ) <%= userVO.getAddress()%><br>

	<%} else { %>
		�̸��� Ȯ�����ּ���. <br>
		�Է��Ͻ� ������ �����ϴ�.
	<%}  %>
		
	<p><p><a href='findUser.html'>�ڷ�</a>

</body>
</html>