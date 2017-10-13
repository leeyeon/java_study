public class Example2 
{
	public static void main(String[] args) 
	{
		if(args.length != 2 ) {
			System.out.println("1~9까지의 값을 입력하세요.");
			return;
		}
		int i = Integer.parseInt(args[0]);

		if( (i<=0) && (i>=10) ) {
			System.out.println("1~9까지의 값을 입력하세요.");
			return;
		}


		for( int j = 1; j < 10; j ++ ) {
			System.out.println( j +" * "+i+" = "+(i*j));
		}
	}
}
