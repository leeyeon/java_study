public class Prob 
{
	public void printSeason(int month) {
		String season = "��";
		switch (month) {
			case 3:
			case 4:
			case 5:
				break;
			case 6:
			case 7:
			case 8:
				season = "����";
				break;
			case 9:
			case 10:
			case 11:
				season = "����";
				break;
			case 12:
			case 1:
			case 2:
				season = "�ܿ�";
				break;
			default:
				System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
				break;
		}
		System.out.println(season+"�� �¾�̳׿�.");
	}

	public static void main(String[] args) 
	{
		if(args.length != 1) {
			System.out.println("�� ���� ���ڸ� �Է����ּ���.");
			System.exit(0);
		}
		int month = Integer.parseInt(args[0]);
		new Prob().printSeason(month);
	}
}
