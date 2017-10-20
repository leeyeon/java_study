package jw04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.DBUtil;

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
			
			con = DBUtil.connect();
			
			String query = "SELECT id, pwd FROM users WHERE id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			String str = null;
			
			// id 있는지 확인
			if(rs.next()) {
				str = rs.getString("pwd");
				System.out.println("db 에서 확인한 id와 pwd"+id+" : "+pwd);
			} else {
				System.out.println("db에 client에서 입력한 <"+id+">가 없습니다.");
			}
			
			// pwd 맞는지 확인
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
