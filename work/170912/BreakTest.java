public class BreakTest
{
	public static void main(String[] args) 
	{
		int inputData = Integer.parseInt(args[0]);

		int i = 0;
		int sum = 0;

		while (true)
		{
			i++;
			sum = sum + i;
			if (i == inputData)
			{
				break;
			}
		}

		System.out.println("0 ~ "+inputData+" 까지의 합은 : "+sum+" 입니다.");
	}
}
