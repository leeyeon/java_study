package m10.day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJDBC {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@192.168.0.32:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		con = DriverManager.getConnection(url,"scott","tiger");
		stmt = con.createStatement();
		
		//DML : INSERT
		String sql1 = "INSERT INTO firstJDBC VALUES(1,'ȫ�浿', 'a@lycos.co.kr','�Ѿ�')";
		String sql2= "INSERT INTO firstJDBC VALUES(2,'ȫ���', 'a@lycos.co.kr','�Ѿ�')";
		String sql3 = "INSERT INTO firstJDBC VALUES(3,'�̼���', 'a@lycos.co.kr','�Ѿ�')";
		
		//executeUpdate() : DML ����
		int i = stmt.executeUpdate(sql1);
		System.out.println("1�� insert ���� :  "+i+" ���� ���� ����������ϴ�." );
		
		i = stmt.executeUpdate(sql2);
		System.out.println("2�� insert ���� :  "+i+" ���� ���� ����������ϴ�." );
		
		i = stmt.executeUpdate(sql3);
		System.out.println("3�� insert ���� :  "+i+" ���� ���� ����������ϴ�." );
		
		if(stmt != null)
			stmt.close();
		if(con != null)
			con.close();
	}

}