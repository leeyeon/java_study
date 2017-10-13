class TopSecret02
{
	//Field
	//==> access modifier를 활용한 information hiding
	//==> private 접근제어를 사용, 직접 접근할 수 없도록 하고 getter Method통해 접근
	private int secretNo = 7777;

	public TopSecret02(){}

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

}

public class ModifierTest02{

	public static void main(String[] args) 
	{
		TopSecret02 topSecret = new TopSecret02();

		//==> private Field는 information hiding 되어 있어 접근 및 변경이 불가
		//==> Method를 통해 접근만 가능 / 변경불가
		//System.out.println(topSecret.secretNo);
		//topSecret.secretNo = 1234;

		System.out.println(topSecret.getSecretNo(0));
	}
}
