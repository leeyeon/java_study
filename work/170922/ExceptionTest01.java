public class ExceptionTest01 
{
	//Field
	private int sum;
	private int avg;

	public ExceptionTest01() {
	}

	public void sum(int x, int y) {
		System.out.println("1. ==> sum ����");
		sum = x + y;
		System.out.println("1. ==> �� : "+sum );
		System.out.println("1. ==> sum ��");
	}

	public void avg(int z) {
		System.out.println("2. ==> avg ����");
		// z = 0 �� ��� �Ҵ�
		avg = sum /z;
		System.out.println("2. ==> ��� :"+avg );
		System.out.println("2. ==> avg ��");
	}

	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

		ExceptionTest01 et = new ExceptionTest01();
		et.sum(i,j);
		et.avg(k);

		System.out.println("main Method End...");

	}
}
