public class Prob
{
	public static void main(String[] args) 
	{
		int num1 = 6;
		int num2 = 16;

		Prob prob = new Prob();
		System.out.println("두 수의 차는 : "+prob.abs(num1, num2));
	}

	public int abs(int num1, int num2) {

		if ( num1 - num2 < 0)
		{
			return num2 - num1;
		} else return num1 - num2;
	}
}
