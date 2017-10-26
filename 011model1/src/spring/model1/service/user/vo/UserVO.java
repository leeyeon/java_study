package spring.model1.service.user.vo;

import java.io.Serializable;

/*
 * FileName : UserVO.java
 *  :: ����� ������ ���� Bean 		:  	Value Object
 *  :: Controller ���� Model ��  		: 	client �䱸���� ==> Model) 
 * ::  Model ���� Control ��  			:   Model data ó����� ==> Control 
 *  �� Presentation Layer/Business Layer �� ������ Data �̵�(Data Transfer Object::DTO)
 *  :: POJO(Plain Old Java Object)
*/
public class  UserVO implements Serializable{
	
	///Field
	private String userId;
	private String userPasswd;
	private boolean active;

	///Constructor
	public UserVO(){
		System.out.println("UserVO Default Constructor");
	}

	///Method(getter/setter Method)
	public void setUserId(String userId){
		this.userId =  userId;	
	}
	public void setUserPasswd(String userPasswd){
		this.userPasswd = userPasswd;
	}
	public void setActive(boolean active)	{
		this.active = active;	
	}
	public String getUserId(){
		return userId;
	}
	public String getUserPasswd(){
		return userPasswd;	
	}	
	public boolean isActive(){
		return active;	
	}

	public String toString() {
		return "UserVO [active=" + active + ", userId=" + userId
				+ ", userPasswd=" + userPasswd + "]";
	}
}//end of class