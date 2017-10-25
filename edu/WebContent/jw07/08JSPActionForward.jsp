<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	:: 08JSPActionForward.jsp 시작 <br/>
	
	<% request.setAttribute("aaa",new String("연결됨")); %>
	
	<jsp:forward page="09JSPActionForward.jsp"/>
	
	:: 08JSPActionForward.jsp 끝 <br/>
</body>
</html>