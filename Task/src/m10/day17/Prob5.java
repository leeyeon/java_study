package m10.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Util.DBUtil;

public class Prob5 {
	
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		
		System.out.println("부서의 아이디를 입력하세요.");
		int keyboard = new Scanner(System.in).nextInt();

		if(keyboard == 0) {
			System.out.println("부서의 아이디를 입력하지 않으셨습니다.");
			System.exit(1);
		}
		
		String query =  "SELECT" + 
						" emp.employee_id, vt.department_name , emp.salary, vt.avg_salary" + 
						" FROM employees emp, "+ 
						"    (SELECT" + 
						"     dep.department_id, dep.department_name , AVG(emp.salary) AS AVG_SALARY" + 
						"     FROM employees emp, departments dep" + 
						"     WHERE emp.department_id = dep.department_id" + 
						"         AND dep.department_id IN (?)" + 
						"     GROUP BY dep.department_id, dep.department_name ) vt" + 
						" WHERE emp.department_id = vt.department_id";
		
		try {
			con = DBUtil.connect();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, keyboard);
			
			ResultSet rs = pstmt.executeQuery();
			
			for(int i=1; i<=4; i++)
				System.out.print(pstmt.getMetaData().getColumnLabel(i)+"	");
			System.out.println();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"		"+rs.getString(2)+"	"+rs.getInt(3)+"	"+rs.getInt(4));
			}
			
		} catch (SQLException e)  {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
