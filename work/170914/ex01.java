import java.util.Scanner;

public class ex01 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. : ");
		int inputInt = keyboard.nextInt();

		if(inputInt < 2 || inputInt > 9 ) {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			return; // ���α׷� ����
		}

		for (int i =1; i <= 9; i++)
		{
			System.out.println(inputInt +" * "+i+" = " + (inputInt*i));
		}
	}
}