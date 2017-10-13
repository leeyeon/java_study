
// final modifier : 상속불가
final class TopSecret03
{
	//Field
	//==> access modifier를 활용한 information hiding
	//==> final modifier를 활용한 수정불가
	private final int secretNo = 7777;

	//Constructor
	//==> Access modifier를 통한 객체생성불가 (private Constructor를 사용한 이유 이해)
	private TopSecret03(){}

	//Method
	//getter Method
	//==> method를 통해 조건을 충족할 경우만 secretNo를 return
	public int getSecretNo(int pwd){
		if(pwd==0){
			return secretNo;
		}else{
			return 0;
		}
	}
	
	//static method를 이용한 instance return 하게하여 다른 class에서 사용가능하게 함.
	public static TopSecret03 getInstance(){
		TopSecret03 topSecret = new TopSecret03();
		return topSecret;
	}
}

public class ModifierTest03{

	public static void main(String[] args) 
	{
		// 생성자가 private로 instance 생성(생성자 호출) 불가능
		// TopSecret03 topSecret = new TopSecret03();
		// instance 생성 불가로 static method를 통해 객체를 return 받는다.
		TopSecret03 topSecret = TopSecret03.getInstance();
		System.out.println(topSecret.getSecretNo(0));
	}
}
