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
		String sql1 = "INSERT INTO firstJDBC VALUES(1,'홍길동', 'a@lycos.co.kr','한양')";
		String sql2= "INSERT INTO firstJDBC VALUES(2,'홍길순', 'a@lycos.co.kr','한양')";
		String sql3 = "INSERT INTO firstJDBC VALUES(3,'이순신', 'a@lycos.co.kr','한양')";
		
		//executeUpdate() : DML 전송
		int i = stmt.executeUpdate(sql1);
		System.out.println("1번 insert 유무 :  "+i+" 개의 행이 만들어졌습니다." );
		
		i = stmt.executeUpdate(sql2);
		System.out.println("2번 insert 유무 :  "+i+" 개의 행이 만들어졌습니다." );
		
		i = stmt.executeUpdate(sql3);
		System.out.println("3번 insert 유무 :  "+i+" 개의 행이 만들어졌습니다." );
		
		if(stmt != null)
			stmt.close();
		if(con != null)
			con.close();
	}

}