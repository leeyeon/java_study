package service.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import common.dao.AbstractDao;
import service.user.vo.UserVO;

public class UserDao extends AbstractDao {

	public UserDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void addUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		List<String> user;
		
		try {
			
			con = this.connect();
			
			StringBuffer query = new StringBuffer();
			query.append("INSERT INTO USER_INFO (name, gender, year, month, day, ");
			query.append("calender, education, job, position, married, children, ");
			query.append("telFirst, telSecond, telThird, telCheck, ");
			query.append("mobileFirst, mobileSecond, mobileThird, mobileCheck, country, address)");
			query.append(" VALUES(?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?)");
			
			pstmt = con.prepareStatement(query.toString());
			
			user = userVO.getUser();
			
			// 이름 필수 입력
			if(user.get(0).length()>0) {
				
				//System.out.println("userVO SiZE: "+user.size());
				for(int i=0; i<user.size(); i++) {
					pstmt.setString(i+1, user.get(i));
				}
				
				System.out.println("pstmt에 넣기 성공");
				pstmt.executeUpdate();
				userVO.setSuccess(true);
			}
			
			if(userVO.isSuccess()) {
				System.out.println("회원가입 성공");
				System.out.println(userVO);
			} else {
				System.out.println("회원가입 실패");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			this.close(con, pstmt);
		}
		
	}
	
	public UserVO findUser(String name) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserVO userVO = null;
		
		try {
			
			con = this.connect();
			
			StringBuffer query = new StringBuffer();
			query.append("SELECT name, gender, year, month, day, ");
			query.append("calender, education, job, position, married, children, ");
			query.append("telFirst, telSecond, telThird, telCheck, ");
			query.append("mobileFirst, mobileSecond, mobileThird, mobileCheck, country, address");
			query.append(" FROM USER_INFO");
			query.append(" WHERE name = ?");
			
			pstmt = con.prepareStatement(query.toString());
			
			pstmt.setString(1, name);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				userVO = new UserVO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
									rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),
									rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),
									rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19),rs.getString(20),
									rs.getString(21));
				System.out.println("<<<SELECT TEST>>>");
				System.out.println(userVO);
				System.out.println();
			}
			return userVO;
		} catch(Exception e) {
			e.printStackTrace();
			return userVO;
		} finally {
			this.close(con, pstmt, rs);
		}

	}
	
	public void updateUser(UserVO userVO) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		List<String> user;
		
		try {
			
			con = this.connect();
			
			StringBuffer query = new StringBuffer();
			query.append("UPDATE USER_INFO ");
			query.append(" SET gender = ?, year = ?, month = ?, day = ?, ");
			query.append("calender = ?, education = ?, job = ?, position = ?, married = ?, children = ?, ");
			query.append("telFirst = ?, telSecond = ?, telThird = ?, telCheck = ?, ");
			query.append("mobileFirst = ?, mobileSecond = ?, mobileThird = ?, mobileCheck = ?, country = ?, address = ?");
			query.append(" WHERE name = ?");
			
			pstmt = con.prepareStatement(query.toString());
			
			user = userVO.getUser();
			
			pstmt.setString(21, user.get(0));
			for(int i=0; i < user.size(); i++) {
				if(i!=(user.size()-1)) {
					pstmt.setString(i+1, user.get(i+1));
				}				
			}
			
			System.out.println("<<<UPDATE TEST>>>");
			pstmt.executeUpdate();
			System.out.println(userVO);
			System.out.println("<<<업데이트 성공>>>");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(con, pstmt);
		}
	}

}
