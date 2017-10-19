package m10.day16;

import java.sql.*;

//Oracle Driver 사용
//import oracle.jdbc.driver.*;

/*
*	FileName : ConnectionTest01.java
*
*	1. JDBC Programming  절차 이해
 *   ==>DBMS 접근(login과정)			: Connection 객체로 Object Modeling
 *   ==>SQL Prompt  & SQL전송		: Statement  객체로 Object Modeling
 *   ==>SQL문의 결과						: ResultSet 객체로 Object Modeling
*/
public class ConnectionTest02{
   
	///Main Method
	public static void main(String[] args) throws Exception{

		//DB에 로그인 접속정보
		String url = "jdbc:oracle:thin:@192.168.0.32:1521:xe";
		String user ="scott";
		String pwd = "tiger";

		//1.단계  connection :: login 과정
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,user,pwd);

		//2단계 QUERY (SELECT * FROM product) 전송단계 
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM product"); 

		//3단계 결과 확인
		while(rs.next()) {
			
			String productName = rs.getString("p_name");
			int productPrice = rs.getInt("p_price");

			System.out.println("상품명 : "+productName);
			System.out.println("가  격 : "+productPrice);

		}

		//각각의 객체를 close한다.
		rs.close();
		stmt.close();
		con.close();

	}//end of main

}//end of class