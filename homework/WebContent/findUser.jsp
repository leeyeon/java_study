<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="service.user.vo.UserVO" %>
<%@ page import="service.user.dao.UserDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	request.setCharacterEncoding("EUC_KR");

	String paramName = null;
	
	// ��ũ�� ������ GET �̴ϱ� method�� �Ǵ��� �� ����
	if(request.getMethod().equals("GET")) {
		paramName = ((UserVO)session.getAttribute("user")).getName();
	} else {
		paramName = request.getParameter("name");
	}
	
	// update page�� ���� ���ؼ� session ������
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
		
	<p><p><a href='findUserView.jsp'>�ڷ�</a>
	<p><p><a href='updateUserView.jsp'>�� ���� ����</a>

</body>
</html>