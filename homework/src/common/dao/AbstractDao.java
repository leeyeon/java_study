package common.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import common.util.ConvertUtil;
import common.util.DBUtil;

// ������������ ���⸸ �ϼ���
public abstract class AbstractDao {

	public AbstractDao() {
	}
	
	/* �ѱۺ�ȯ�� ���õ� method
	 * String convertKo(String str)
	 */
	public String convertKo(String str) {
		String convertStr = null;
		
		convertStr = ConvertUtil.convertKo(str);
		
		return convertStr;
	}
	
	/* JDBC method 
	 * Connection connect() : DBUtil getConnection() ��ȯ
	 * void close(Connection con, PreparedStatement pstmt)
	 * void close(Connection con, PreparedStatement pstmt, ResultSet rs)
	 */
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
