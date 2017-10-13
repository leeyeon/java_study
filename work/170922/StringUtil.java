public class StringUtil 
{
	private static String replaceString(String[] arr) {

		int cntBefore = 0; // count 해서 개수 비교
		int cntAfter = 0;
		String str = "";
		String temp = "";
		String result = "";

		for ( int i = 0; i < arr.length; i++ ) {
			str = arr[i];
			cntAfter = 0;

			for ( int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 'a') {
					cntAfter ++;
				}
			}

			//System.out.println("str 이름 : "+str+"\t a의 개수: "+cntAfter);

			//현 배열의 a 개수가 크면?
			if(cntBefore < cntAfter) {
				cntBefore = cntAfter;
				temp = str;
			}
		}
		
		for ( int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) == 'a') {
				//a이면 대문자로 변경
				result += String.valueOf(temp.charAt(i)).toUpperCase();
			} else {
				result += temp.charAt(i);
			}
		}
		//replace

		return result;
	}

	public static void main(String[] args) 
	{
		String[] arr = {"java program","array","java program area","append"};
		String result = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 : "+result);
	}
}
