package common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBUtil {
	
	public DBUtil() {
		
	}

	public static Connection getConnection(String driverClassName,
												String url,
												String id,
												String passwd) {
		
		Connection con = null;
		
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, id, passwd);			
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("db 접속시 오류 발생:"+e);
		}
		
		return con;
	}
	
	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			con = ds.getConnection();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 데이터소스 못받아서 연결 안되면...
			if (con == null) {
				con = getConnection("oracle.jdbc.driver.OracleDriver",
						"jdbc:oracle:thin:@127.0.01:1521:xe","scott","tiger");			
			}
		}
		
		return con;
	}
}
