public class ex07 
{
	public static void main(String[] args) 
	{
		int year = 2010;
		int month = 2;
		int maxDay = 0;


		//4�� ����� �ش� ����
		if ( (year&4) == 0) {
			// 1. 100�� ����� �ƴҶ�
			// 2. 100�� ����̰� 400�� ����϶�
			if ( (year%100) != 0 || ((year%100)==0 && (year%400)==0)) {
				maxDay = 28;
			} else maxDay = 31;
		} else maxDay = 31;


		/*
		if ( (year&4) == 0) { //4�� ����� �ش� ����
			if ( (year%100) == 0 ) { //100�� ����� �ش� ������ �ƴ�
				if ((year%400) == 0 ) { //400�� ����� ����
					maxDay = 28;
				} else maxDay = 31;
			} else maxDay = 28;
		} else maxDay = 31;
		*/


		System.out.println(year + "�� " + month + "���� ������ " + maxDay + "�� �Դϴ�.");
	}
}
