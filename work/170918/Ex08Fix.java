public class Ex08Fix
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
		
		new Ex08Fix().print("*", inputNum, end);
		// Ex08Fix test = new Exo8Fix();
		// test.print("*", inputNum, end);

	}

	public void print(String symbol, int num, int endNum) {
		for(int i = 0; i < num / 2 + 1; i++) {
			for(int j = 0; j < endNum; j++) {
				if( j >= i ) {
					System.out.print(symbol);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			endNum --;
		}
	}

}
