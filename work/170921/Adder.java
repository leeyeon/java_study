public class Adder
{
	
	public int execute(String expr) {

		int result = 0;
		String strNum = "";
		for ( int i = 0; i < expr.length(); i++ ) {
			char c = expr.charAt(i);
			if ( c == '+' ) {
				// + 나오면 전체를 int로 형변환
				result += Integer.parseInt(strNum);
				strNum = "";
			} else {
				// + 나올때까지 문자열 합치기
				//strNum += Character.toString(c);
				strNum += c;
			}
		}
		
						// 마지막 숫자 더해줌
		return (result + Integer.parseInt(strNum));

	}

	public static void main(String[] args) 
	{
		Adder adder = new Adder();
		String expr = "3+5+9+1";
		System.out.println(expr + "=" + adder.execute(expr));
		expr = "11+45+77+3";
		System.out.println(expr + "=" + adder.execute(expr));
		expr = "33+51+12+11";
		System.out.println(expr + "=" + adder.execute(expr));
	}
}
