package m09.day27;

public class Prob2 
{
	public String toEncoding(String str){
		
		String result = "";
		String hexOne = "";
		String hexTwo = "";

		for(int i=0; i < str.length(); i++) {
			String value = String.valueOf(str.charAt(i));
			byte[] temp = value.getBytes();

			//한글 처리
			if(temp.length == 2) {
				hexOne = Integer.toHexString(temp[0]).substring(6).toUpperCase();
				hexTwo = Integer.toHexString(temp[1]).substring(6).toUpperCase();

				result += "%"+ hexOne + "%"+ hexTwo;
			//나머지
			} else {
				result += value;
					
			}

		}

		return result;
	}

	public static void main(String[] args) 
	{
		Prob2 p1 = new Prob2();

		System.out.println("입력 :Korea");
		System.out.println("출력 :"+p1.toEncoding("Korea"));
		System.out.println("입력 :홍길동");
		System.out.println("출력 :"+p1.toEncoding("홍길동"));
		System.out.println("입력 :홍 길 동");
		System.out.println("출력 :"+p1.toEncoding("홍 길 동"));
		System.out.println("입력 :Hong 길 동");
		System.out.println("출력 :"+p1.toEncoding("Hong 길 동"));
		System.out.println("입력 :0319");
		System.out.println("출력 :"+p1.toEncoding("0319"));

	}
}
