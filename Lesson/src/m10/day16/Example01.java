package m10.day16;

import java.sql.*;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@192.168.0.32:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String query = "CREATE TABLE member ("
				+ "no NUMBER,"
				+ "id VARCHAR2(10),"
				+ "PWD VARCHAR2(10)"
				+ ")";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			stmt = con.createStatement();
			
			stmt.executeUpdate(query);
			System.out.println("member TABLE 생성완료");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)	con.close();
				if (stmt != null)	stmt.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
