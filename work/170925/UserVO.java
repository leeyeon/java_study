import java.io.*;

/*
	ㅇ 회원정보를 가지고 있는 UserVO :: ValueObject ==> RMI / EJB (Value Object Pattern)
	ㅇ 회원의 정보를 갖는 UserVO instance는 file에 저장될것이며..
	ㅇ 객체를 입출력자원, network 자원으로 이동되기 위해서는
		Serializable 이라는 marker interface를 구현해야 한다.	==> 객체직열화
*/

public class UserVO implements Serializable
{
	private int no;
	private String name;

	public UserVO(){}

	public UserVO(int no, String name){
		this.no = no;
		this.name = name;
	}

	public void setNo(int no){
		this.no = no;
	}
	public void setName(String name){
		this.name = name;
	}

	public int getNo(){
		return no;
	}
	public String getName(){
		return name;
	}

	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("UserVO [no=");
		builder.append(no);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
}
