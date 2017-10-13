public class Prob2 
{
	public String toEncoding(String str){
		
		String result = null;
		String hexOne = null;
		String hexTwo = null;

		for(int i=0; i < str.length(); i++) {
			String value = String.valueOf(str.charAt(i));
			byte[] temp = value.getBytes();

			//�ѱ� ó��
			if(temp.length == 2) {
				hexOne = Integer.toHexString(temp[0]).substring(6).toUpperCase();
				hexTwo = Integer.toHexString(temp[1]).substring(6).toUpperCase();

				result =
					(result == null) ?
							 "%"+ hexOne + "%"+ hexTwo:
					result + "%"+ hexOne + "%"+ hexTwo;
			//������
			} else {
				result =
					(result == null) ?
							 value:
					result + value;
			}

		}

		return result;
	}

	public static void main(String[] args) 
	{
		Prob2 p1 = new Prob2();

		System.out.println("�Է� :Korea");
		System.out.println("��� :"+p1.toEncoding("Korea"));
		System.out.println("�Է� :ȫ�浿");
		System.out.println("��� :"+p1.toEncoding("ȫ�浿"));
		System.out.println("�Է� :ȫ �� ��");
		System.out.println("��� :"+p1.toEncoding("ȫ �� ��"));
		System.out.println("�Է� :Hong �� ��");
		System.out.println("��� :"+p1.toEncoding("Hong �� ��"));
		System.out.println("�Է� :0319");
		System.out.println("��� :"+p1.toEncoding("0319"));

	}
}