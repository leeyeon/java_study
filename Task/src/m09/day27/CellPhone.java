package m09.day27;

public class CellPhone {
	private String phoneNumber;
	private int totalCallTime;
	private int totalFee;
	private int feePerCallTime;
	
	public CellPhone() {
	}
	
	
	public CellPhone(String phoneNumber, int feePerCallTime) {
		super();
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}


	//Method
	public void call(String phoneNumber, int callTime) {
		System.out.println(phoneNumber+" 번호로 "+callTime + " 통화함.");
		totalCallTime += callTime;
	}
	
	public void calculateTotalFee() {
		totalFee = totalCallTime * feePerCallTime;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getTotalCallTime() {
		return totalCallTime;
	}
	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}
	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	public int getFeePerCallTime() {
		return feePerCallTime;
	}
	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
}
