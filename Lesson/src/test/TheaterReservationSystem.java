package test;

public class TheaterReservationSystem {

	private boolean[] ticket = new boolean [100];
	
	public TheaterReservationSystem() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized boolean getTicket(ReservationShop rs) throws Exception {
		
		for(int i=0; i<ticket.length; i++) {
			if(ticket[i]) {
				try{ 
					  System.out.println("<예매System>"+rs.getShopName()+
							  													" : 잠시대기 DB check 1초 소요");
					  Thread.sleep(1000);
					 }catch(Exception e){
						 e.printStackTrace();
					 }
				
				ticket[i] = false;
				System.out.println("<예매System>"+rs.getShopName() +
						" : 예매종료\t<"+(i+1)+">번표예매함");

				
				return !(ticket[i]);
			}
		}
		
		//좌석 없으면
		throw new Exception("영화표가 없습니다.");
	}

}
