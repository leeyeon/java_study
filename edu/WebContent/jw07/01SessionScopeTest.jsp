<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	Integer count = (Integer)session.getAttribute("count");
	if(count == null) {
		out.println(" :: Browser �Ѱ� 1��° �湮");
		session.setAttribute("count", new Integer(1));
	} else {
		int changeCount = count.intValue() + 1;
		out.println(" :: Browser �Ѱ� "+changeCount+"��° �湮");
		
		session.setAttribute("count", new Integer(changeCount));
	}

%>