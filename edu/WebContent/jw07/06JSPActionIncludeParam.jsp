<%@ page contentType="text/html;charset=euc-kr" %>

<html>
<body>

::  06JSPActionIncludeParam.jsp 시작 <br/>

<%
	// Scriptlet tag 변수 선언 :: service() Method  local variable
	String value = "local variable";
	request.setAttribute("value", value);

	// request,session,application  ObjectScope  Data 저장
	request.setAttribute("aaa",new String("request ObjectScope 저장된 문자열"));
	session.setAttribute("bbb",new String("session ObjectScope 저장된 문자열"));
	application.setAttribute("ccc",new String("application ObjectScope 저장된 문자열"));
%>

<jsp:include page="07JSPActionIncludeParam.jsp">
	<jsp:param name="str" value="<%= value %>"/>
</jsp:include>

::  06JSPActionIncludeParam.jsp 끝 <br/>

</body>
</html>