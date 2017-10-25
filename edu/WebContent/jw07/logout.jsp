<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "jw.service.user.vo.UserVO" %>

<%
	UserVO userVO = (UserVO)session.getAttribute("userVO");
	if(userVO == null) {
		userVO = new UserVO();
	}
	
 	if(!userVO.isActive()) {%>
		<jsp:include page="login.html"/>
		<a href="addUser.html">회원가입</a>
<% 	} else { %>
	<%= userVO.getId() %> 님 로그인하셨습니다.
	<form method="post" action="<%= request.getRequestURL() %>" >
		URL : <%= request.getRequestURL() %>
		URI : <%= request.getRequestURI() %>
		<input type="submit" value="logout"/>
	</form>

<% }
	if(request.getMethod().equals("POST")) {
		//session.invalidate();
		//session.removeAttribute("userVO");
		userVO.setActive(false);
		response.sendRedirect("logout.jsp");
	}
%>
