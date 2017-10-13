class TopSecret01
{
	int secretNo = 7777;

	public TopSecret01(){}

	public int getSecretNo(){
		return secretNo;
	}

}

public class ModifierTest01
{
	public static void main(String[] args) 
	{
		TopSecret01 topSecret = new TopSecret01();
		System.out.println(topSecret.secretNo);

		topSecret.secretNo = 1234;
		System.out.println(topSecret.getSecretNo());
	}
}
 /*
	TopSecret.class의 문제점
	★ secretNo는 중요한 attribute이다. 그러나 누구나 접근 및 변경이 가능
*/