package m10.day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteJDBC {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@192.168.0.32:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,"scott","tiger");
		
		Statement stmt = con.createStatement();
		
		String sql = "DELETE FROM firstJDBC WHERE no=3";
		//DML : DELETE ����
		int i = stmt.executeUpdate(sql);
		System.out.println("delete�� record�� ���� :"+i+"���� �����Ǿ����ϴ�.");
		
		if(stmt != null)
			stmt.close();
		if(stmt != null)
			stmt.close();
	}

}
