public class ex07 
{
	public static void main(String[] args) 
	{
		int year = 2010;
		int month = 2;
		int maxDay = 0;


		//4의 배수인 해는 윤년
		if ( (year&4) == 0) {
			// 1. 100의 배수가 아닐때
			// 2. 100의 배수이고 400의 배수일때
			if ( (year%100) != 0 || ((year%100)==0 && (year%400)==0)) {
				maxDay = 28;
			} else maxDay = 31;
		} else maxDay = 31;


		/*
		if ( (year&4) == 0) { //4의 배수인 해는 윤년
			if ( (year%100) == 0 ) { //100의 배수인 해는 윤년이 아님
				if ((year%400) == 0 ) { //400의 배수는 윤년
					maxDay = 28;
				} else maxDay = 31;
			} else maxDay = 28;
		} else maxDay = 31;
		*/


		System.out.println(year + "년 " + month + "월의 말일은 " + maxDay + "일 입니다.");
	}
}
