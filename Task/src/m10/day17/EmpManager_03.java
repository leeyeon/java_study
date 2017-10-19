package m10.day17;

import java.sql.*;

import Util.DBUtil;

public class EmpManager_03 {
	
	public void printEmployee(String name, int salary) throws SQLException {
		
		String query = "SELECT"
				+ " employee_id, first_name, salary"
				+ " FROM employees"
				+ " WHERE UPPER(first_name) LIKE UPPER('%'||?||'%')"
				+ " AND salary >= ?";
		
		Connection con = DBUtil.connect();
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, name.toUpperCase());
		pstmt.setInt(2, salary);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println("["+rs.getString(1)+"] "+rs.getString(2)+"	"+rs.getInt(3));
		}
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		new EmpManager_03().printEmployee("al", 4000);

	}

}
