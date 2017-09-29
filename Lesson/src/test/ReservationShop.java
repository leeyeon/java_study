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
				System.out.println(shopName+" : 1��° �õ�");
			}
			if(trs.getTicket(this)) {
				System.out.println(shopName+" : 2��° �õ�");
			}
			if(trs.getTicket(this)) {
				System.out.println(shopName+" : 3��° �õ�");
			}
		} catch(Exception e) {
			System.out.println(shopName + " ǥ �����");
		}
	}

}
