public class Ex08 
{
	public static void main(String[] args) 
	{
		if(args.length != 1) {
			System.out.println("�ϳ��� ���ڸ� �Է����ּ���.");
			System.exit(0);
		}
		
		int inputNum = Integer.parseInt(args[0]);
		int end = inputNum;

		if( (inputNum < 0) || (inputNum % 2 == 0) ) {
			System.out.println("0���� ū Ȧ���� �Է� �����մϴ�.");
			return;
		}

		for(int i = 0; i < inputNum / 2 + 1; i++) {
			for(int j = 0; j < end; j++) {
				if( j >= i ) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			end --;
		}
	}
}