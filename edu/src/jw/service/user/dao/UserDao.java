package jw.service.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jw.common.dao.AbstractDao;
import jw.service.user.vo.UserVO;

/* 
 * FileName : UserDao.java
 *  :: AbstarctDao ���� ȸ������ Service ��� DAO
*/
public class  UserDao extends AbstractDao{
	
	///Field 
	
	///constructor
	public UserDao(){
	}

	///Method
	public void getUser(UserVO userVO){
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		try{		
			// 1�ܰ� connection
			con = this.connect();
			
            // 2�ܰ� statement 
			pStmt = con.prepareStatement("SELECT id , pwd FROM users WHERE id=? AND pwd=?");
			pStmt.setString(1,userVO.getId());
			pStmt.setString(2,userVO.getPwd());

			//3�ܰ� resultset
			rs = pStmt.executeQuery();
			if(rs.next()){    
				System.out.println("db���� Ȯ�� �� id,pwd ==>: "+userVO.getId()+" : " +userVO.getPwd());
				userVO.setActive(true);
			}else{               
            	System.out.println("db�� < "+userVO.getId()+" >�� �ش��ϴ� �ڷᰡ �����ϴ�.");
			}
		}catch(Exception e){		
			e.printStackTrace();
		}finally{
			this.close(con, pStmt, rs);
		}
	}//end of getUser()
	
	public boolean addUser(UserVO userVO){
		Connection con = null;
		PreparedStatement pStmt = null;
		boolean insertResult   = false;
		try{		
			//1�ܰ� connection
			con = this.connect();
			
			//2�ܰ� statement 
			pStmt = con.prepareStatement(	"INSERT " +
											"INTO users ( no, id, pwd) " +
											"VALUES( ? , ? , ? )" );
			pStmt.setInt(1,userVO.getNo());
			pStmt.setString(2,userVO.getId());
			pStmt.setString(3,userVO.getPwd());

			//3�ܰ� ����� Ȯ���ϱ�
			if( 1 == pStmt.executeUpdate()){    
				insertResult = true;
			}
		}catch(Exception e){		
			e.printStackTrace();
		}finally{
			this.close(con,pStmt);
		}
		return insertResult; 
	}//end of addUser()
	
	public List<UserVO> getUserList() {
		
		ArrayList<UserVO> arrayList = new ArrayList<UserVO>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			con = this.connect();
			
			pstmt = con.prepareStatement("SELECT no, id, pwd FROM users ORDER BY no");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserVO userVO = new UserVO(rs.getString("id"),rs.getString("pwd"),rs.getInt("no"));
				System.out.println(userVO);
				arrayList.add(userVO);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(con, pstmt, rs);
		}
		
		return arrayList;
		
	}
}