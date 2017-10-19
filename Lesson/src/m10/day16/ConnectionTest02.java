package m10.day16;

import java.sql.*;

//Oracle Driver ���
//import oracle.jdbc.driver.*;

/*
*	FileName : ConnectionTest01.java
*
*	1. JDBC Programming  ���� ����
 *   ==>DBMS ����(login����)			: Connection ��ü�� Object Modeling
 *   ==>SQL Prompt  & SQL����		: Statement  ��ü�� Object Modeling
 *   ==>SQL���� ���						: ResultSet ��ü�� Object Modeling
*/
public class ConnectionTest02{
   
	///Main Method
	public static void main(String[] args) throws Exception{

		//DB�� �α��� ��������
		String url = "jdbc:oracle:thin:@192.168.0.32:1521:xe";
		String user ="scott";
		String pwd = "tiger";

		//1.�ܰ�  connection :: login ����
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,user,pwd);

		//2�ܰ� QUERY (SELECT * FROM product) ���۴ܰ� 
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM product"); 

		//3�ܰ� ��� Ȯ��
		while(rs.next()) {
			
			String productName = rs.getString("p_name");
			int productPrice = rs.getInt("p_price");

			System.out.println("��ǰ�� : "+productName);
			System.out.println("��  �� : "+productPrice);

		}

		//������ ��ü�� close�Ѵ�.
		rs.close();
		stmt.close();
		con.close();

	}//end of main

}//end of class