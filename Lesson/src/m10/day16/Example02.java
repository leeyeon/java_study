package m10.day16;

import java.sql.*;
import java.util.Scanner;


public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		String url = "jdbc:oracle:thin:@192.168.0.32:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		System.out.println("no , id, pwd 형식으로 작성해주세요.");
		String data = new Scanner(System.in).nextLine();
		
		String[] parsing = data.split(",");
		for(int i = 0; i < parsing.length; i++) {
			parsing[i] = parsing[i].trim();
		}
		
		//String query = "INSERT INTO member"
		//		+ " VALUES ("+parsing[0]+ ", '"+parsing[1]+"', '"+parsing[2]+"')";
		
		String query = "INSERT INTO member VALUES (?,?,?)";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			/*
			stmt = con.createStatement();
			int result = stmt.executeUpdate(query);
			*/
			
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(parsing[0]));
			pstmt.setString(2, parsing[1]);
			pstmt.setString(3, parsing[2]);
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("member TABLE DATA INSERT 완료");
			}
			else {
				System.out.println("member TABLE DATA INSERT 실패");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)	con.close();
				if (pstmt != null)	pstmt.close();
				//if (stmt != null)	stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
