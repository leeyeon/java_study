import java.util.Scanner;

public class ex04 
{
	public static void main(String[] args) 
	{
		int number = 0;
		int count = 0;
		int sum = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���: ");
		number = keyboard.nextInt();

		if( (number < 1) || (number > 1000) ) {
			System.out.println("1���� 1000������ ���� �Է����ּ���.");
			return;
		}

		count = 1000/number;
		
		for(int i=0; i<count; i++) {
			sum = sum + number*(i+1);
		}

		System.out.println(number+"�� ��� ���� = "+count);
		System.out.println(number+"�� ��� �� = "+sum);
	}
}