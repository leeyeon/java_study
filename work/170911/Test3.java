
public class Test3
{
	public static void main(String[] args)
	{
		int temp = 0;
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		for(int k = 0; k < 2; k++) {
			if(k == 0 ) temp = i; else temp = j;
			System.out.print("입력하신 "+(k+1)+"번째 인자값 "+temp+"는 ");

			if(temp%2 == 0 )	System.out.print("짝수이며 ");
			else			System.out.print("홀수이며 ");

			if(temp%3 == 0 )	System.out.println("3의 배수입니다.");
			else			System.out.println("3의 배수가 아닙니다.");
		}

	}
}