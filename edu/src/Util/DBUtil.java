package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static final String driver = "oracle.jdbc.driver.OracleDriver";
	public static final String url = "jdbc:oracle:thin:@127.0.01:1521:xe";
	public static final String id = "scott";
	public static final String pwd = "tiger";
	
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
			
			con = DriverManager.getConnection(url, id, pwd);
			return con;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
