<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "Util.DBUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	request.setCharacterEncoding("EUC_KR");
	//request.setContentType("text/html;charset=EUC_KR");
	//PrintWriter out = res.getWriter();
	
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	
	/*  JDBC 시작  */
	
	String fromDbId = null;
	String fromDbPwd = null;
	
	try {
		
		Connection con = DBUtil.connect();
		
		String query = "SELECT id, pwd FROM users WHERE id=?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, id);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			fromDbId = rs.getString("id");
			fromDbPwd = rs.getString("pwd");
			
			System.out.println("db 에서 확인한 id와 pwd"+fromDbId+" : "+fromDbPwd);
		} else {
			System.out.println("db에 client에서 입력한 <"+id+"> 와 <"+pwd+">가 없습니다.");
		}
		
		rs.close();
		pstmt.close();
		con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}

%>

<html>
<head>
<title>Login 화면</title>
</head>
<body>
<center><h2>Login 화면 </h2></center>

	<% if(fromDbId != null && fromDbPwd != null
			&& fromDbId.equals(id) && fromDbPwd.equals(pwd)) {  %>
		<%= id %> 님 환영합니다.
	<%} else {  %>
		id,pwd를 확인해주세요.
	<%}  %>
	
	<p><p><a href='login.html'>뒤로</a>

</body>
</html>