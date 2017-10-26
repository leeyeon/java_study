package spring.model1.service.user.dao;

import spring.model1.service.user.vo.UserVO;

/*
 * FileName : UserDao.java
 *  :: DAO : Data Access Object
 *  :: Controller ������ Unit Test �� ���Ͽ� �Ʒ��� ���� Test ����
 *  	-  	getUser() method ������ DBMS�� ������� �ʰ� controller ���� ���޵Ǵ� VO ��ü��  
 *          id,password  null check, 3�� �̻��  �α��� ������ Ȯ��, active �� true ó��
 *     -  �� ������ ����, Unit Test �Ǿ� �ִٸ�, Control, Model(�����Ͻ�����/�۽ý��Ͻ�����) �������� 
 *        �ϼ����� ������ ������ ���� �׽�Ʈ�� �����ϴ� ����
 */
public class UserDao {
	
	///Field
	
	///Constructor
	public UserDao() {
		System.out.println("UserDAO Default Constructor");
	}
	
	///Method
	public void  getUser(UserVO userVO){
		
		System.out.println("[ UserDAO.getUser() start........]");
		
		// UserVO�� Value Ȯ��
		System.out.println( userVO.toString() );
		
		if( userVO.getUserId() != null && userVO.getUserId().length() >=3 
			&& userVO.getUserPasswd() != null && userVO.getUserPasswd().length() >=3	){
			userVO.setActive(true);
		}
		
		// UserVO�� Value�� Ȯ���ϸ�....
		System.out.println( userVO.toString() );
		
		//==> �������� Presentation Layer �� Controller  �����ϴ� �����̴�
		//==> Business Layer(��ü������ Persistence Layer)������  DAO ��  
		//==> �Ʒ��� ������ ���� �� ������ �Ѵ�.
		/*
		 * 1. Connection ��ü ȹ��( DataSource :: ConnectionPool)
		 * 2. Statement ��ü ȹ�� (CRUD ����)
		 * 3. ResultSet ��ü ȹ�� (CRUD ��� ȹ��)
		 * 4. UserVO�� id / pwd �� DBMS������� ���� Value �� ��
		 * 5. UserVO�� active ���� 
		 */
		System.out.println("[ UserDAO.getUser() end........]\n");
	}//end of getUser()
}///end of class