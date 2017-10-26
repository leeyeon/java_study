package jw.service.user.vo;

/*
 *  FileName : UserVO.java
 *  ::  Client 의 From Data 를 Object Modeling 한 Bean
 *  ::  Data 만 갖는 객체 ==> Value Object  (Value Object Pattern)
 */
public class UserVO {

	///Field
	private String id;
	private String pwd;
	private boolean active;
	private int no;
	
	///Constructor
	public UserVO() {
	}
	
	public UserVO(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	public UserVO(String id, String pwd, int no) {
		this(id, pwd);
		this.no = no;
	}

	///Method
	//getter/setter Method
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", pwd=" + pwd + ", active=" + active	+ ", no=" + no + "]";
	}
	
}//end of class