package jw.common.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jw.common.util.DBUtil;

public abstract class AbstractDao {

	public AbstractDao() {
	}
	
	// DBUtil getConnection() ¹ÝÈ¯
	public Connection connect() {
		Connection con = null;
		
		try {
			con = DBUtil.getConnection();
		} catch (RuntimeException e) {
			throw e;
		}
		
		return con;
	}
	
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		if (rs == null) {
			try {
				rs.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		this.close(con, pstmt);
	}
	
	public void close(Connection con, PreparedStatement pstmt) {
		if (pstmt == null) {
			try {
				pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		if (con == null) {
			try {
				con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
