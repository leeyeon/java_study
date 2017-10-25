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

import jw.common.util.DBUtil;

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
		
		
		/*  JDBC ����  */
		
		String fromDbId = null;
		String fromDbPwd = null;
		
		try {
			
			Connection con = DBUtil.getConnection();
			
			String query = "SELECT id, pwd FROM users WHERE id=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				fromDbId = rs.getString("id");
				fromDbPwd = rs.getString("pwd");
				
				System.out.println("db ���� Ȯ���� id�� pwd"+fromDbId+" : "+fromDbPwd);
			} else {
				System.out.println("db�� client���� �Է��� <"+id+"> �� <"+pwd+">�� �����ϴ�.");
			}
			
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*  JDBC ����  */
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login ȭ��</h2>");
		
		if(fromDbId != null && fromDbPwd != null
				&& fromDbId.equals(id) && fromDbPwd.equals(pwd)) {
			out.println(id+"�� ȯ���մϴ�.");
		} else {
			out.println("id,pwd�� Ȯ�����ּ���.");
		}
		
		out.println("<p><p><a href='jw04/login.html'>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
