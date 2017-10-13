//pakage jb01.part05;

public class CastingTest
{
	public static void main(String[] args)
	{
		byte b1 = 100;
		byte b2 = 20;

		byte b4 = (byte)(b1+b2);
		System.out.println("b4(b1+b2): "+b4);

		byte b5 = (byte)(b1+b4);
		System.out.println("b5(b1+b4): "+b5);

		int i1 = b1 + b2;
		System.out.println(i1);
		int i2 = b1 + b4;
		System.out.println(i2);

		double test01 = 100 + 0.5;
		System.out.println(test01);

		int i3 = 201/2;
		System.out.println("i3(201/2)"+i3);

		double d1 = 201/2;
		System.out.println("d1(201/2)"+d1);

		double d2 = (double)201/2;
		System.out.println("d2(201/2)"+d2);

	}
}