package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDao {
	
	int isSuccess;

	public UserDao() {
		// TODO Auto-generated constructor stub
	}
	
	/*  */
	public void addUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		List<String> user;
		
		try {
			
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			con = ds.getConnection();
			
			pstmt = con.prepareStatement("INSERT INTO USERS (name, gender, year, month, day, "
					+ "calender, education, job, position, married, children, "
					+ "telFirst, telSecond, telThird, telCheck, "
					+ "mobileFirst, mobileSecond, mobileThird, mobileCheck, country, address)" 
					+ " VALUES(?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?)");
			
			user = userVO.getUser();
			
			// 이름 필수 입력
			if(user.get(0).length()>0) {
				
				System.out.println("userVO SiZE: "+user.size());
				for(int i=0; i<user.size(); i++) {
					pstmt.setString(i+1, user.get(i));
				}
				
				System.out.println("pstmt에 넣기 성공");
				
				isSuccess = pstmt.executeUpdate();
			}
			
			if(isSuccess == 1) {
				System.out.println("회원가입 성공");
				System.out.println(userVO);
			} else {
				System.out.println("회원가입 실패");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(con != null) con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public UserVO findUser(String name) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String str = "";
		UserVO userVO = new UserVO();
		
		try {
			
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			con = ds.getConnection();
			
			pstmt = con.prepareStatement("SELECT name, gender, year, month, day, "
					+ "calender, education, job, position, married, children, "
					+ "telFirst, telSecond, telThird, telCheck, "
					+ "mobileFirst, mobileSecond, mobileThird, mobileCheck, country, address" 
					+ " FROM USERS"
					+ " WHERE name = ?");
			
			pstmt.setString(1, name);
			
			rs = pstmt.executeQuery();
			Vector<String> userInfo = new Vector<String>();
			
			while(rs.next()) {
				for(int i = 1; i <=20; i++) {
					userInfo.add(rs.getString(i));
					System.out.print(rs.getString(i)+" : ");
				}
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(con != null) con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return userVO;

	}

	public int getIsSuccess() {
		return isSuccess;
	}

}
