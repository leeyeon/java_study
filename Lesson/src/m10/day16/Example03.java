package m10.day16;

import java.sql.*;
import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		PreparedStatement pstmt = null;
		//Statement stmt = null;
		String url = "jdbc:oracle:thin:@192.168.0.32:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		System.out.println("지울 id 값을 입력해주세요.");
		String id = new Scanner(System.in).next().trim();
		String query = "DELETE FROM member WHERE id = ?";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			/*stmt = con.createStatement();
			stmt.executeUpdate(query);
			 */
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("member TABLE RECORD DELETE 완료");
			} else {
				System.out.println("member TABLE RECORD DELETE 실패");
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
