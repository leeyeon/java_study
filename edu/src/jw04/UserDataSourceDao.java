package jw04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jw.common.pool.OracleConnectionPool;
import jw.common.util.DBUtil;

public class UserDataSourceDao {

	public UserDataSourceDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void getUser(UserVO userVO) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			//con = DBUtil.connect();
			//con = OracleConnectionPool.getInstance().getConnection();
			
			
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			con = ds.getConnection();			
			
			String query = "SELECT id, pwd FROM users WHERE id=? AND pwd=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userVO.getId());
			pstmt.setString(2, userVO.getPwd());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("db 에서 확인한 id와 pwd"+userVO.getId()+" : "+userVO.getPwd());
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
