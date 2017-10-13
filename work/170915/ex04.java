import java.util.Scanner;

public class ex04 
{
	public static void main(String[] args) 
	{
		int number = 0;
		int count = 0;
		int sum = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		number = keyboard.nextInt();

		if( (number < 1) || (number > 1000) ) {
			System.out.println("1부터 1000까지의 수를 입력해주세요.");
			return;
		}

		count = 1000/number;
		
		for(int i=0; i<count; i++) {
			sum = sum + number*(i+1);
		}

		System.out.println(number+"의 배수 개수 = "+count);
		System.out.println(number+"의 배수 합 = "+sum);
	}
}
