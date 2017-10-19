package m10.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Util.DBUtil;

public class EmpManager_06 {
	
	public void printEmployee(String city, int lo, int hi) throws SQLException {
		
		String query =  "SELECT" + 
						" emp.last_name 직원명, dep.department_name 부서명" + 
						" FROM employees emp, departments dep, locations loc" + 
						"      WHERE emp.department_id = dep.department_id" + 
						"      AND dep.location_id = loc.location_id" + 
						"      AND loc.city IN (?)" + 
						"      AND emp.salary BETWEEN ? AND ?";
		
		Connection con = DBUtil.connect();
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, city);
		pstmt.setInt(2, lo);
		pstmt.setInt(3, hi);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1)+"	"+rs.getString(2));
		}
		
	}
	public static void main(String[] args) throws SQLException {
		new EmpManager_06().printEmployee("South San Francisco", 7000, 10000);
	}

}
