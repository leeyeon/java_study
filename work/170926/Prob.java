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

		//�����ϸ� +1 �ʿ���
		String[] strs = new String[arrayCount+1];

		//�����Ͽ� �迭�� �����ϱ�
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
		System.out.println("===���ڿ� ó�� ���===");
		for (int i = 0; i < strs.length; i++ ) {
			System.out.println(strs[i]);
		}

	}
}