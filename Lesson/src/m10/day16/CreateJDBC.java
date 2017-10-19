package m10.day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. JDBC Programming
 * 2. 각각의 JDBC Programming 절차
 * 3. executeQuery(SQL), executeUpdate(SQL) Method 이해
 */
public class CreateJDBC {

	public static void main(String[] args) {
		// JDBC 절차에 필요인스턴스 및 정보 선언
		 Connection con = null;
		 Statement stmt = null;
		 String url = "jdbc:oracle:thin:@192.168.0.32:1521:xe";
		 
		 // 1. Connection :: Login 과정을 추상화한 interface
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 System.out.println("1. driver loading OK");

			 con = DriverManager.getConnection(url, "scott","tiger");
			 System.out.println("2. connection 인스턴스 생성 완료");

			 // 2. Statement :: Query 전송을 추상화한 interface
			 stmt = con.createStatement();
			 System.out.println("3. statement객체 생성완료");

			 //Create Query 만들기
			 String createSql = 
					 		 "CREATE TABLE firstJDBC "+
							 "(no number(3), "+
							 " name varchar(20), "+
							 " email varchar2(30), "+
							 " address varchar2(50) )";

			 System.out.println(":: QUERY 전송결과 : "+ stmt.executeUpdate(createSql));
			 System.out.println("4. query전송완료");
			 
		 }catch(ClassNotFoundException e) {
			 System.out.println("\n==>Driver Loading시 Exception 발생\n");
			 e.printStackTrace();

		 } catch(SQLException e) {
			 System.out.println("\n==>JDBC 절차 중 Exception 발생 : "+e.getErrorCode());
			 e.printStackTrace();
		 } finally {
			try {
				if(stmt != null)	stmt.close();
				if(con != null)		con.close();
			} catch (SQLException e) {
				System.out.println("\n==>JDBC 절차 중 Exception 발생 : "+e.getErrorCode());
				 e.printStackTrace();
			}
		 }

	}

}
