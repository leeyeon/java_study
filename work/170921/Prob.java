public class Prob 
{
	public static void main(String[] args) 
	{
		String sourceString = "everyday we have is one more than deserve";
		String encodedString = "";
		char parse;
		int code;

		for ( int i=0; i < sourceString.length(); i++)
		{
			//�Ľ�
			parse = sourceString.charAt(i);
			
			if ((96 < parse) && (parse < 120) ) { //a~w decoding 
				parse = (char)(parse + 3);
			} else if ((120 <= parse) && (parse <123)) { //xyz decoding
				parse = (char)(parse - 23);
			}
			
			//���ڿ���ġ��
			//encodedString += Character.toString((char)code);
			encodedString += parse;
			
		}

		System.out.println("��ȣȭ�� ���ڿ� : "+sourceString);
		System.out.println("��ȣȭ�� ���ڿ� : "+encodedString);

	}
}
