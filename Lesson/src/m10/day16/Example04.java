package m10.day16;

import java.sql.*;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		PreparedStatement pstmt = null;
		//Statement stmt = null;
		String url = "jdbc:oracle:thin:@192.168.0.32:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		String query = "SELECT * FROM member";
		
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, "scott", "tiger");
			//stmt = con.createStatement();
			//ResultSet rs = stmt.executeQuery(query);
			
			pstmt = con.prepareStatement(query);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.print("¹øÈ£: "+rs.getString(1));
				System.out.print(",	id: "+rs.getString(2));
				System.out.println(",	pwd: "+rs.getString(3));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
				if (pstmt != null) pstmt.close();
				//if (stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
