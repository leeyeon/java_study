package m10.day16;

import java.sql.*;

public class PreparedStmtTest {

	public static void main(String[] args) throws Exception {

		// 입력 data validation check
		if (args.length != 3) {
			System.out.println("실행방법 java Example01 [no값] [id값] [pwd 값]");
			System.exit(0);
		}
		
		int no = Integer.parseInt(args[0]);
		String id = args[1];
		String pwd = args[2];
		
		String url = "jdbc:oracle:thin@192.168.0.32:1521:xe";
		
		// 1단계 : Connection
		Class.forName("orcle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "scott","tiger");
		
		// statement / preparedState 비교와 이해
		
		// statemenet
//		Statement stmt = con.createStatement();
//		String createSql = "INSERT INTO member VALUES("+no+","+id+","+pwd+")";
//		int confirm = stmt.executeUpdate("INSERT INTO member VALUES(?,?,?)");
		
		// preparedStatement
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO member VALUES(?,?,?)");
		
		pstmt.setInt(1, no);
		pstmt.setString(2, id);
		pstmt.setString(3, pwd);
		int confirm = pstmt.executeUpdate();
		
		if(confirm == 1) {
			System.out.println("number TABLE DATA INSERT 완료");
		} else {
			System.out.println("number TABLE DATA INSERT 실패");
		}
		
		if(pstmt != null)	pstmt.close();
		if(con != null)		con.close();
		
	}

}
