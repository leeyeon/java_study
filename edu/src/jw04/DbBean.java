package jw04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jw.common.util.DBUtil;

public class DbBean {

	private String id;
	private String pwd;
	
	public DbBean() {
		// TODO Auto-generated constructor stub
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public boolean getUser() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			con = DBUtil.getConnection();
			
			String query = "SELECT id, pwd FROM users WHERE id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			String str = null;
			
			// id �ִ��� Ȯ��
			if(rs.next()) {
				str = rs.getString("pwd");
				System.out.println("db ���� Ȯ���� id�� pwd"+id+" : "+pwd);
			} else {
				System.out.println("db�� client���� �Է��� <"+id+">�� �����ϴ�.");
			}
			
			// pwd �´��� Ȯ��
			if(str != null && str.equals(pwd)) {
				return true;
			} else {
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (Exception e) {}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {}
			}
			if(con != null) {
				try {
					con.close();
				} catch (Exception e) {}
			}
		}
	}
}
