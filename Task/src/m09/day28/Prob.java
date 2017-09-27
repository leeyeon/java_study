package m09.day28;

public class Prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열에 특정 문자를 변경하는 테스트");
		
		System.out.println("---------Sample1--------");
		String str1 = Prob.myReplace("hello world",'l','*');
		System.out.println(str1);
		
		System.out.println("---------Sample2--------");
		String str2 = Prob.myReplace("hello world",' ','-');
		System.out.println(str2);
		
		System.out.println("---------Sample3--------");
		String str3 = Prob.myReplace("hello world",'a','*');
		System.out.println(str3);
	}
	
	public static String myReplace(String str, char oldChar, char newChar) {
		
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == oldChar) {
				result += newChar;
			} else {
				result += ch;
			}
		}
		
		return result;
	}

}
