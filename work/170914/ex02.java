public class ex02 
{
	public static void main(String[] args) 
	{
		int limit = 50;
		boolean prime = false;

		for (int num=2; num<=limit; num++) // 1�� �ڱ� �ڽ����θ� ���� �� �־�� ��. 1�� ��� ���� ������ 0�̹Ƿ� ����
		{
			for (int divide=2; divide<=num; divide++)
			{
				if((num != divide) && (num%divide == 0)) {
					prime = false;
					break;
				} else prime = true; // ������ ���� �Ҽ���~ false �϶� break �Ǵϱ�
			} // end of for

			if(prime) {
				System.out.println(num); // ���
			} // end of if
		} // end of for
	}
}
