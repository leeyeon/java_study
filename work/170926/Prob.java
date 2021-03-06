public class Prob 
{
	private static String[] stringSplit(String str1, String str2) {
				
		
		int arrayCount = 0;
		int indexCount = 0;	
		String str = null;

		for(int i=0; i<str1.length(); i++) {
			str = String.valueOf(str1.charAt(i));
			
			if(str2.equals(str)) {
				arrayCount++;
			}
		}

		//구분하면 +1 필요함
		String[] strs = new String[arrayCount+1];

		//구분하여 배열에 저장하기
		for (int i = 0; i<str1.length(); i++) {

			str = String.valueOf(str1.charAt(i));

			if (str2.equals(str)) indexCount ++;
			else {
				strs[indexCount] =
					(strs[indexCount] == null)? str : strs[indexCount] + str;

				/*
				if(strs[indexCount] == null) {
					strs[indexCount] = str;
				} else {
					strs[indexCount] += ch;
				}
				*/
			}
		}
		return strs;
	}

	public static void main(String[] args) 
	{
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strs = stringSplit(str, "#");
		System.out.println("===문자열 처리 결과===");
		for (int i = 0; i < strs.length; i++ ) {
			System.out.println(strs[i]);
		}

	}
}
