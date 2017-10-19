package m10.day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. JDBC Programming
 * 2. ������ JDBC Programming ����
 * 3. executeQuery(SQL), executeUpdate(SQL) Method ����
 */
public class CreateJDBC {

	public static void main(String[] args) {
		// JDBC ������ �ʿ��ν��Ͻ� �� ���� ����
		 Connection con = null;
		 Statement stmt = null;
		 String url = "jdbc:oracle:thin:@192.168.0.32:1521:xe";
		 
		 // 1. Connection :: Login ������ �߻�ȭ�� interface
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 System.out.println("1. driver loading OK");

			 con = DriverManager.getConnection(url, "scott","tiger");
			 System.out.println("2. connection �ν��Ͻ� ���� �Ϸ�");

			 // 2. Statement :: Query ������ �߻�ȭ�� interface
			 stmt = con.createStatement();
			 System.out.println("3. statement��ü �����Ϸ�");

			 //Create Query �����
			 String createSql = 
					 		 "CREATE TABLE firstJDBC "+
							 "(no number(3), "+
							 " name varchar(20), "+
							 " email varchar2(30), "+
							 " address varchar2(50) )";

			 System.out.println(":: QUERY ���۰�� : "+ stmt.executeUpdate(createSql));
			 System.out.println("4. query���ۿϷ�");
			 
		 }catch(ClassNotFoundException e) {
			 System.out.println("\n==>Driver Loading�� Exception �߻�\n");
			 e.printStackTrace();

		 } catch(SQLException e) {
			 System.out.println("\n==>JDBC ���� �� Exception �߻� : "+e.getErrorCode());
			 e.printStackTrace();
		 } finally {
			try {
				if(stmt != null)	stmt.close();
				if(con != null)		con.close();
			} catch (SQLException e) {
				System.out.println("\n==>JDBC ���� �� Exception �߻� : "+e.getErrorCode());
				 e.printStackTrace();
			}
		 }

	}

}
