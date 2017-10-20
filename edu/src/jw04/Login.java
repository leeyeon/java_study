package jw04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Util.DBUtil;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		
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
		
		/*  JDBC 종료  */
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login 화면</h2>");
		
		if(fromDbId != null && fromDbPwd != null
				&& fromDbId.equals(id) && fromDbPwd.equals(pwd)) {
			out.println(id+"님 환영합니다.");
		} else {
			out.println("id,pwd를 확인해주세요.");
		}
		
		out.println("<p><p><a href='jw04/login.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
