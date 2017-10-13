public class ContinueTest
{
	public static void main(String[] args) 
	{

		int inputData = Integer.parseInt(args[0]);

		int sum = 0;

		for (int i=0; i<inputData; i++ )
		{
			if(i%2 == 1) {
				continue;
			}
			sum = sum + i;
		}

		System.out.prinln("0 ~ "+inputData+" 까지의 짝수의 합은 : "+sum);
	}
}
