
public class Test3
{
	public static void main(String[] args)
	{
		int temp = 0;
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		for(int k = 0; k < 2; k++) {
			if(k == 0 ) temp = i; else temp = j;
			System.out.print("�Է��Ͻ� "+(k+1)+"��° ���ڰ� "+temp+"�� ");

			if(temp%2 == 0 )	System.out.print("¦���̸� ");
			else			System.out.print("Ȧ���̸� ");

			if(temp%3 == 0 )	System.out.println("3�� ����Դϴ�.");
			else			System.out.println("3�� ����� �ƴմϴ�.");
		}

	}
}