package m09.day29;

public class Account {

	private String accountNo;
	private boolean creditLine;
	private int creditLineLimit;
	private int balance;
	
	public Account() {
	}
	
	public Account(String accountNo, boolean creditLine,int creditLineLimit, int balance) {
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		this.creditLineLimit = creditLineLimit;
		this.balance = balance;
	}
	
	
	//method
	public void withdraw(int money) throws Exception {
		if((balance < money) && (money - balance) > creditLineLimit) {
			throw new Exception("잔고부족 출금불가합니다.");
		} else {
			balance -= money;
		}
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" 계좌번호: ");
		builder.append(accountNo);
		builder.append(", 잔고: ");
		builder.append(balance);
		builder.append("원");
		if(creditLine) {
			builder.append("\t[[-");
			builder.append(creditLineLimit);
			builder.append("원 마이너스통장 ]]");
		}		
		return builder.toString();
	}

	//getter setter	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public boolean isCreditLine() {
		return creditLine;
	}

	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}

	public int getCreditLineLimit() {
		return creditLineLimit;
	}

	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
