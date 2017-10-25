<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	Integer count = (Integer)application.getAttribute("count");
	if(count == null) {
		out.println(" :: Browser 켜고 1번째 방문");
		application.setAttribute("count", new Integer(1));
	} else {
		int changeCount = count.intValue() + 1;
		out.println(" :: Browser 켜고 "+changeCount+"번째 방문");
		
		application.setAttribute("count", new Integer(changeCount));
	}

%>