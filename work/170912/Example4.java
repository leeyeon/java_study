public class Example4 
{
	public static void main(String[] args) 
	{
		for ( int i = 1; i <= 9; i++ ) {
			for ( int j = 1; j <= 9; j++ )
			{
				if ( j == 1 ) System.out.println(i+" ���� ����մϴ�.");
				System.out.println(i + " * " + j + " = " + (i*j));
				if ( j == 9 ) System.out.println("..............");
			}
		}
		
	}
}
