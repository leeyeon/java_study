package m10.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.DBUtil;

public class Prob {
	
	private static void printEmployeeList(String cityName, String deptName) throws Exception {

		String query =  "SELECT" + 
						" loc.city, dep.department_name, emp.first_name, emp.salary" + 
						" FROM employees emp, departments dep, locations loc" + 
						" WHERE emp.department_id = dep.department_id" + 
						"       AND dep.location_id = loc.location_id" + 
						"       AND LOWER(loc.city) LIKE LOWER('%'||?||'%')" + 
						"       AND LOWER(dep.department_name) LIKE LOWER('%'||?||'%')";
		
		Connection con = DBUtil.connect();
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, cityName);
		pstmt.setString(2, deptName);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1)+"	"+rs.getString(2)+"	"+rs.getString(3)+"	"+rs.getInt(4));
		}
		
	}
	public static void main(String[] args) throws Exception {
		printEmployeeList("lon", "resource");
		System.out.println("=============================");
		printEmployeeList("south", "it");
	}

}
