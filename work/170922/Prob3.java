public class Prob3 
{
	public String leftPad(String str, int size, char padChar) {

		//str 문자열 길이
		int strIndex = str.length();
		String temp = "";

		//str 문자열 길이가 size보다 큰 경우
		if (strIndex >= size) {
			return str;
		} else {
			for ( int i=0; i<(size - strIndex); i++ ) {
				temp += padChar;
				if(i == (size - strIndex - 1)) {
					temp += " ";
				}
			}
			return temp + str;
		}
	}
	public static void main(String[] args) 
	{
		Prob3 prob = new Prob3();

		System.out.println(prob.leftPad("ABC",6,'#'));
		System.out.println(prob.leftPad("ABC",5,'$'));
		System.out.println(prob.leftPad("ABC",2,'&'));

	}
}
