<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	:: 10ResponseSendredirect.jsp ���� <br/>
	
	<% request.setAttribute("aaa",new String("�����")); %>
	
	<% response.sendRedirect("09JSPActionForward.jsp"); %>
	
	:: 10ResponseSendredirect.jsp �� <br/>
</body>
</html>