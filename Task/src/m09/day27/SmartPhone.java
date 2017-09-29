package m09.day27;

public class SmartPhone extends CellPhone {
	private boolean isMonthlyFixedRate;
	private int monthlyFixedFee;
	
	public SmartPhone() {
	}
	
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
	}
	
	public SmartPhone(String phoneNumber, int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
		super(phoneNumber, feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}
	
	//Method
	
	public void calculateTotalFee() {
		if(isMonthlyFixedRate) {
			System.out.println("�������� "+monthlyFixedFee+" ���� ������Դϴ�.");
			if(getTotalCallTime()*getFeePerCallTime() <= monthlyFixedFee) {
				setTotalFee(monthlyFixedFee);
			} else {
				setTotalFee(getTotalCallTime()*getFeePerCallTime());
			}
		} else
			System.out.println("�������� ���� ������� ���ԵǾ� ���� �ʽ��ϴ�.");
		
	}
	
	public boolean isMonthlyFixedRate() {
		return isMonthlyFixedRate;
	}
	public void setMonthlyFixedRate(boolean isMonthlyFixedRate) {
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}
	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}
	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}
	
	
}