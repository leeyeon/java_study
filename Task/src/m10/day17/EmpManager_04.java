package m10.day17;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Util.DBUtil;

public class EmpManager_04 {
	
	public void printEmployee(String jobs[]) throws SQLException {

		String str = "";
		
		for(int i=0; i<jobs.length; i++) {
			str += "?";
			if(i != jobs.length - 1)
				str += ",";
		}

		String query = "SELECT" + 
					  " emp.employee_id, emp.first_name, emp.salary" + 
					  " FROM employees emp, jobs job" + 
					  " WHERE emp.job_id = job.job_id" + 
					  "       AND job_title IN ("+str+")";
		
		Connection con = DBUtil.connect();
		PreparedStatement pstmt = con.prepareStatement(query);
		for(int i=0; i<jobs.length; i++) {
			pstmt.setString(i+1, jobs[i]);
		}
		
		ResultSet rs = pstmt.executeQuery();
				
		System.out.println(str);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"	"+rs.getInt(3));
		}
		
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String[] jobs = {"Accountant", "Stock Clerk"};
		new EmpManager_04().printEmployee(jobs);
	}

}
