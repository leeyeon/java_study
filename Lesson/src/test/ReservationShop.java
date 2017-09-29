package test;

public class ReservationShop extends Thread {
	private String shopName;
	private TheaterReservationSystem trs;

	public ReservationShop() {
	}
	
	public ReservationShop(TheaterReservationSystem trs, String shopName) {
		this.trs = trs;
		this.shopName = shopName;
	}
	
	public String getShopName() {
		return shopName;
	}
	
	//thread
	public void run() {
		try {
			if(trs.getTicket(this)) {
				System.out.println(shopName+" : 1번째 시도");
			}
			if(trs.getTicket(this)) {
				System.out.println(shopName+" : 2번째 시도");
			}
			if(trs.getTicket(this)) {
				System.out.println(shopName+" : 3번째 시도");
			}
		} catch(Exception e) {
			System.out.println(shopName + " 표 없어요");
		}
	}

}
