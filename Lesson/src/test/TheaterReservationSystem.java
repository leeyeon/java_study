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
					  System.out.println("<����System>"+rs.getShopName()+
							  													" : ��ô�� DB check 1�� �ҿ�");
					  Thread.sleep(1000);
					 }catch(Exception e){
						 e.printStackTrace();
					 }
				
				ticket[i] = false;
				System.out.println("<����System>"+rs.getShopName() +
						" : ��������\t<"+(i+1)+">��ǥ������");

				
				return !(ticket[i]);
			}
		}
		
		//�¼� ������
		throw new Exception("��ȭǥ�� �����ϴ�.");
	}

}
