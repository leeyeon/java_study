
// final modifier : ��ӺҰ�
final class TopSecret03
{
	//Field
	//==> access modifier�� Ȱ���� information hiding
	//==> final modifier�� Ȱ���� �����Ұ�
	private final int secretNo = 7777;

	//Constructor
	//==> Access modifier�� ���� ��ü�����Ұ� (private Constructor�� ����� ���� ����)
	private TopSecret03(){}

	//Method
	//getter Method
	//==> method�� ���� ������ ������ ��츸 secretNo�� return
	public int getSecretNo(int pwd){
		if(pwd==0){
			return secretNo;
		}else{
			return 0;
		}
	}
	
	//static method�� �̿��� instance return �ϰ��Ͽ� �ٸ� class���� ��밡���ϰ� ��.
	public static TopSecret03 getInstance(){
		TopSecret03 topSecret = new TopSecret03();
		return topSecret;
	}
}

public class ModifierTest03{

	public static void main(String[] args) 
	{
		// �����ڰ� private�� instance ����(������ ȣ��) �Ұ���
		// TopSecret03 topSecret = new TopSecret03();
		// instance ���� �Ұ��� static method�� ���� ��ü�� return �޴´�.
		TopSecret03 topSecret = TopSecret03.getInstance();
		System.out.println(topSecret.getSecretNo(0));
	}
}
