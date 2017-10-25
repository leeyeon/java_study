<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="EUC-KR">
<title>내 정보 보기</title>
</head>
<body>
	<center>
	<h2>내 정보 보기</h2>
	<hr width="500px">
	
	<form action="findUser.jsp" method="POST" >
		<br>이름을 입력하세요.<br><br>
		<input type="text" name="name" value=""/>
		<input type="submit" value="검색"/>
	</form>
</body>
</html>