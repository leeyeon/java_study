package jw04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.DBUtil;

public class UserInitParamDao {
	
	private String jdbcDriver;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPasswd;
	
	public UserInitParamDao() {
		// TODO Auto-generated constructor stub
	}

	public UserInitParamDao(String jdbcDriver, String jdbcURL, String jdbcUser, String jdbcPasswd) {
		this.jdbcDriver = jdbcDriver;
		this.jdbcURL = jdbcURL;
		this.jdbcUser = jdbcUser;
		this.jdbcPasswd = jdbcPasswd;
	}

	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}

	public void setJdbcURL(String jdbcURL) {
		this.jdbcURL = jdbcURL;
	}

	public void setJdbcUser(String jdbcUser) {
		this.jdbcUser = jdbcUser;
	}

	public void setJdbcPasswd(String jdbcPasswd) {
		this.jdbcPasswd = jdbcPasswd;
	}
	
	public void getUser(UserVO userVO) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName(jdbcDriver);
			con = DriverManager.getConnection(jdbcURL,jdbcUser,jdbcPasswd);
			
			String query = "SELECT id, pwd FROM users WHERE id=? AND pwd=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userVO.getId());
			pstmt.setString(2, userVO.getPwd());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("db 에서 확인한 id와 pwd //"+userVO.getId()+" : "+userVO.getPwd());
				userVO.setActive(true);
			} else {
				System.out.println("db에 client에서 입력한 <"+userVO.getId()+">가 없습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
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
