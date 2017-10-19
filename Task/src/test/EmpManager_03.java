package test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpManager_03 {

	
	public void printEmployee(String name, int salary) {
		SQLManager.conncetion();
		SQLManager.setPreparedStatement("SELECT"
				+ " employee_id, first_name, salary"
				+ " FROM employees"
				+ " WHERE UPPER(first_name) LIKE UPPER('%?%')"
				+ " AND salary >= ?");
		
		ResultSet rs = SQLManager.runQuery();
		SQLManager.setString(1,"al");
		SQLManager.setInt(2, 4000);
		
		
		try {
			while (rs.next()) {
				System.out.print("¹øÈ£: "+rs.getString(1));
				System.out.print(",	id: "+rs.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		SQLManager.disconncetion();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmpManager_03().printEmployee("al", 4000);
		
	}

}
