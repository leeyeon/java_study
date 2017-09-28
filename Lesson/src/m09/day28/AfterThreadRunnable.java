package m09.day28;

public class AfterThreadRunnable implements Runnable {

	private String name;
	
	public AfterThreadRunnable() {
	}

	public AfterThreadRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<100; i++) {
			System.out.println(name+" : "+i);
			/*
			 * //sleep()
			 * try {
			 * 	Thread.sleep(100);
			 * } catch(InterruptedException e) {
			 *  System.out.println(e);
			 * } 
			 */
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("여기는 main start...");
		AfterThreadRunnable bt1 = new AfterThreadRunnable("1번째");
		AfterThreadRunnable bt2 = new AfterThreadRunnable("2번째");
		
		Thread t1 = new Thread(bt1);
		Thread t2 = new Thread(bt2);
		
		t1.start();
		t2.start();
		
		System.out.println("여기는 main end...");
	}



}
