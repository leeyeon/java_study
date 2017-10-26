<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "jw.service.user.vo.UserVO" %>
<%@ page import = "jw.service.user.dao.UserDao" %>

<%
	UserVO userVO = (UserVO)session.getAttribute("userVO");
	if(userVO == null) {
		userVO = new UserVO();
	}
	
 	if(!userVO.isActive()) {%>
		<jsp:include page="login.html"/>
		<a href="addUser.html">ȸ������</a>
<% 	} else { %>
	<center><h1>ȸ�������� ��ü ���</h1></center>
		<center>
			<table border='1'>
				<tr>
					<th>��ȣ</th><th>���̵�</th><th>��й�ȣ</th>
				</tr>
			<% UserDao userDao = new UserDao();
			   List<UserVO> arrayList = userDao.getUserList();
			   for(UserVO user : arrayList) { %>
					<tr>
						<td><%= user.getNo() %></td>
						<td><%= user.getId() %></td>
						<td><%= user.getPwd() %></td>
					</tr>
				<% } %>
			</table>
		</center>
<% } %>
