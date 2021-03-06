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
			System.out.println("고객님은 "+monthlyFixedFee+" 정액 요금제입니다.");
			if(getTotalCallTime()*getFeePerCallTime() <= monthlyFixedFee) {
				setTotalFee(monthlyFixedFee);
			} else {
				setTotalFee(getTotalCallTime()*getFeePerCallTime());
			}
		} else
			System.out.println("고객님은 정액 요금제에 가입되어 있지 않습니다.");
		
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
