public class Ex08Fix
{
	public static void main(String[] args) 
	{
		if(args.length != 1) {
			System.out.println("하나의 숫자를 입력해주세요.");
			System.exit(0);
		}
		
		int inputNum = Integer.parseInt(args[0]);
		int end = inputNum;

		if( (inputNum < 0) || (inputNum % 2 == 0) ) {
			System.out.println("0보다 큰 홀수만 입력 가능합니다.");
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
