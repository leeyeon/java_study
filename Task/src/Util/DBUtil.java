package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static final String driver = "oracle.jdbc.driver.OracleDriver";
	public static final String url = "jdbc:oracle:thin:@192.168.0.32:1521:xe";
	public static final String id = "hr";
	public static final String pwd = "hr";
	
	static {
		try {
			Class.forName(driver);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public static Connection connect() {
		
		Connection con = null;
		
		try {
			
			con = DriverManager.getConnection(url, "hr", "hr");
			return con;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
