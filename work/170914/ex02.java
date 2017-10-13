public class ex02 
{
	public static void main(String[] args) 
	{
		int limit = 50;
		boolean prime = false;

		for (int num=2; num<=limit; num++) // 1과 자기 자신으로만 나눌 수 있어야 함. 1은 모든 수가 나누면 0이므로 제외
		{
			for (int divide=2; divide<=num; divide++)
			{
				if((num != divide) && (num%divide == 0)) {
					prime = false;
					break;
				} else prime = true; // 끝까지 가면 소수지~ false 일때 break 되니까
			} // end of for

			if(prime) {
				System.out.println(num); // 출력
			} // end of if
		} // end of for
	}
}
