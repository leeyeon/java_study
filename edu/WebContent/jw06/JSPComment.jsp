<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
1. 주석문 연습입니다. <br/>

<%
	String str1 = "주석1";
	String str2 = "주석2";
%>

<!-- 
	<%= str1 %>
	나는 html 주석입니다.
 -->
 
<!-- 
	<%= str2 %>
	나는 html 주석입니다.
 -->
 
 <%--
 	나는 jsp 주석입니다.
  --%>
  
<% 
	//주석처리만 했음.
	//개행처리라 함은
%>

</body>
</html>