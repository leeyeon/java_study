public class Example3 
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]); //�Է¹ޱ�
		int sum = 0;
		int temp;

		if( i == j ) {
			System.out.println("�Է��� ���� �����ϴ�.");
			return;
		}

		if( i > j ) {
			temp = i;
			i = j;
			j = temp; // ���� �ٲٱ�
		}

		for(int k = i ; k <= j; k++ ) {
			sum = sum + k;
		}
		
		System.out.println(i+" ~ "+j+"�� ���� "+sum+"�Դϴ�.");
	}
}