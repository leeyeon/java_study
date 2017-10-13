public class Example1
{
	public static void main(String[] args)
	{
		int i = Integer.parseInt(args[0]);
		String result = "";

		
		// 세번째 방법

		if(i>= 0 && i <= 100) {
			switch (i/10)
			{
				case 10:
				case 9:
					result = "수입니다."; break;
				case 8:
					result = "우입니다."; break;
				case 7:
					result = "미입니다."; break;
				case 6:
					result = "양입니다."; break;
				default:
					result = "가입니다."; break;
			}
		}
		else	result = "잘못된 수입니다.";

		System.out.print("입력하신 값 "+i+"점은 "+result);

		/*

		// 첫번째 방법
		System.out.print("입력하신 값 "+i+"점은 ");

		if(i>=0 && i <= 100)	{
			if(i>=90)	System.out.println("수입니다.");
			else if(i>=80)	System.out.println("우입니다.");
			else if(i>=70)	System.out.println("미입니다.");
			else if(i>=60)	System.out.println("양입니다.");
			else		System.out.println("가입니다.");
		}
		else	System.out.println("잘못된 수입니다.");

		// 두번째 방법

		System.out.print("입력하신 값 "+i+"점은 ");
		if(i>= 0 && i <= 100) {
			switch (i/10)
			{
				case 9:
					System.out.println("수입니다."); break;
				case 8:
					System.out.println("우입니다."); break;
				case 7:
					System.out.println("미입니다."); break;
				case 6:
					System.out.println("양입니다."); break;
				default:
					System.out.println("가입니다."); break;
			}
		}
		else	System.out.println("잘못된 수입니다.");
		*/


	}
}