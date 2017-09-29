package m09.day28;

public class CellPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CellPhone myPhone = new CellPhone("SCH-800");
			
			myPhone.charge(20);
			myPhone.printBattery();
			
			myPhone.call(300);
			myPhone.printBattery();
			
			myPhone.charge(50);
			myPhone.printBattery();
			
			myPhone.call(40);
			myPhone.printBattery();
			
			try {
				myPhone.call(-20);
			} catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			
			CellPhone yourPhone = new CellPhone("SCH-800");
			
			if (myPhone.equals(yourPhone)) {
				System.out.println("���� ���Դϴ�.");
			} else {
				System.out.println("�ٸ� ���Դϴ�.");
			}
	}

}