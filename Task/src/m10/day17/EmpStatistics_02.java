package m10.day17;

import java.sql.*;

import Util.DBUtil;

public class EmpStatistics_02 {
	
	public void printStatistics(int maxSalary) throws SQLException {
		
		System.out.println("================================");
		System.out.println("Max Salary : " + maxSalary);
		System.out.println("================================");
		
		Connection con = DBUtil.connect();		
		
		String query = "SELECT job.job_title AS title, MAX(salary) AS max_salary"
					+ " FROM employees emp, jobs job"
					+ " WHERE emp.job_id = job.job_id AND emp.salary >= ?"
					+ " GROUP BY job.job_title"
					+ " ORDER BY MAX(salary) DESC";
		
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1,maxSalary);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println("["+rs.getString(1)+"] "+rs.getString(2));
		}
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		int maxSalary = 10000;
		new EmpStatistics_02().printStatistics(maxSalary);
		
		maxSalary = 15000;
		new EmpStatistics_02().printStatistics(maxSalary);

	}

}
