//pakage jb01.part06;

public class OperatorTest
{
	public static void main(String[] args)
	{
		int value = 1;

		value ++;
		System.out.println("value++: "+value);

		++value;
		System.out.println("++value: "+value);

		value--;
		System.out.println("value--: "+value);

		--value;
		System.out.println("--value: "+value);

		int temp = value++;
		System.out.println("temp: "+temp);
		System.out.println("value: "+value);

		int temp01 = 5%2;
		int temp02 = 5%3;

		System.out.println("������ ������: 5%2 ==> "+temp01);
		System.out.println("������ ������: 5%3 ==> "+temp02);

		int temp03 = ( 1 <= 2 ) ? 3 : 4;
		System.out.println("���׿����� : ( 1 <= 2 ) ? 3 : 4 ==> "+temp03);
	}
}