public class Example1
{
	public static void main(String[] args)
	{
		int i = Integer.parseInt(args[0]);
		String result = "";

		
		// ����° ���

		if(i>= 0 && i <= 100) {
			switch (i/10)
			{
				case 10:
				case 9:
					result = "���Դϴ�."; break;
				case 8:
					result = "���Դϴ�."; break;
				case 7:
					result = "���Դϴ�."; break;
				case 6:
					result = "���Դϴ�."; break;
				default:
					result = "���Դϴ�."; break;
			}
		}
		else	result = "�߸��� ���Դϴ�.";

		System.out.print("�Է��Ͻ� �� "+i+"���� "+result);

		/*

		// ù��° ���
		System.out.print("�Է��Ͻ� �� "+i+"���� ");

		if(i>=0 && i <= 100)	{
			if(i>=90)	System.out.println("���Դϴ�.");
			else if(i>=80)	System.out.println("���Դϴ�.");
			else if(i>=70)	System.out.println("���Դϴ�.");
			else if(i>=60)	System.out.println("���Դϴ�.");
			else		System.out.println("���Դϴ�.");
		}
		else	System.out.println("�߸��� ���Դϴ�.");

		// �ι�° ���

		System.out.print("�Է��Ͻ� �� "+i+"���� ");
		if(i>= 0 && i <= 100) {
			switch (i/10)
			{
				case 9:
					System.out.println("���Դϴ�."); break;
				case 8:
					System.out.println("���Դϴ�."); break;
				case 7:
					System.out.println("���Դϴ�."); break;
				case 6:
					System.out.println("���Դϴ�."); break;
				default:
					System.out.println("���Դϴ�."); break;
			}
		}
		else	System.out.println("�߸��� ���Դϴ�.");
		*/


	}
}