package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLManager {
	
	private static final String url = "jdbc:oracle:thin:@192.168.0.32:1521:xe";
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static Connection con = null;
	private static PreparedStatement pstmt = null;

	
	public static void conncetion() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void disconncetion() {
		try {
			if (con != null) con.close();
			if (pstmt != null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static ResultSet runQuery() {
		ResultSet rs = null;
		try {
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public static int runDML() {
		int num = 0;
		
		try {
			num = pstmt.executeUpdate();
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return num;
	}
	
	public static void setPreparedStatement(String sql) {
		try {
			pstmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void setString(int index, String str) {
		try {
			pstmt.setString(index, str);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void setInt(int index, int num) {
		try {
			pstmt.setInt(index, num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		return con;
	}

	public static void setCon(Connection con) {
		SQLManager.con = con;
	}

	public static PreparedStatement getPstmt() {
		return pstmt;
	}

	public static void setPstmt(PreparedStatement pstmt) {
		SQLManager.pstmt = pstmt;
	}

	public static String getUrl() {
		return url;
	}
	public static String getDriver() {
		return driver;
	}

}
