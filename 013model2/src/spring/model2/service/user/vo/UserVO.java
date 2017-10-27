package spring.model2.service.user.vo;

import java.io.Serializable;

/*
 * FileName : UserVO.java
 *  :: 사용자 정보를 갖는 Bean 		:  	Value Object
 *  :: Controller 에서 Model 로  		: 	client 요구사항 ==> Model) 
 * ::  Model 에서 Control 로  			:   Model data 처리결과 ==> Control 
 *  즉 Presentation Layer/Business Layer 를 오가면 Data 이동(Data Transfer Object::DTO)
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