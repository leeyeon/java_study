public class Account 
{
	private String accNo;
	private int balance;

	public Account(String acc) {
		accNo = acc;
		balance = 0;
		System.out.println(accNo+" ���°� �����Ǿ����ϴ�.");
	}

	// �Ա�
	public void save(int money) {
		balance += money;
		System.out.println(accNo + " ���¿� " + money +"������ �ԱݵǾ����ϴ�.");
	}

	// ���
	public void deposit(int money) {
		balance -= money;
		System.out.println(accNo + " ���¿� " + money +"������ ��ݵǾ����ϴ�.");
	}
	
	// getter&setter ����
	public String getAccNo() {
		return accNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setAccNo (String accNo) {
		this.accNo = accNo;
	}

	public void setBalance (int balance) {
		this.balance = balance;
	}

		public static void main(String[] args) throws Exception
	{
		String accNo = null;
		int balance = 0;

		Account accObj = new Account("078-2762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo + " ������ �ܰ�� " + balance + "�����Դϴ�.");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo() + " ������ �ܰ�� " + balance + "�����Դϴ�.");

		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo + " ������ �ܰ�� " + balance + "�����Դϴ�.");

	}

}
