//package jb05.part07;

class BusCharge
{
	// field
	String section;
	
	// Constructor
	public BusCharge(){
	}

	public BusCharge(String section) {
		this.section = section;
	}
	
	// Method
	public void information() {
		System.out.println("버스요금안내");
	}
}

// charge()를 정의한 interface
interface Fee
{
	public void charge();
}

// abstract 클래스 상속 시 , abstract 메서드 필히 OverRiding 해야됨 !!!
class Student extends BusCharge implements Fee
{
	public Student(){
		super("학생");
	}

	// 아래 Method 주석처리하고 컴파일 해보고 컴파일 에러 확인하기
	public void charge() {
		System.out.println("300원");
	}
}

class Adult extends BusCharge implements Fee
{
	public Adult() {
		super("일반인");
	}
	
	public void charge() {
		System.out.println("500원");
	}
}

class Old extends BusCharge implements Fee
{
	public Old() {
		super("어르신");
	}

	public void charge() {
		System.out.println("공짜");
	}
}

public class Display07
{
	public static void main(String[] args) 
	{
		// 상위 레퍼런스로 하위 인스턴스를 참조할 수 있다능 (묵시적 형변환)
		// polymophism : 하나의 인터페이스로 접근할 수 있고 다양하게 활용할 수 있음
		Student bc1 = new Student();
		Adult bc2 = new Adult();
		Old bc3 = new Old();

		bc1.information();
		System.out.println(bc1.section);
		bc1.charge();

		bc2.information();
		System.out.println(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge();


///*
		// compile error
		// 1. 문제 발생한 이유?
		// 2. 문제를 해결하여 출력될 수 있도록 구현 수정하기
		// hint : casting 연산자..

		Fee[] fee = new Fee[3];
		fee[0] = new Student();
		fee[1] = new Adult();
		fee[2] = new Old();

		for(int i=0; i<fee.length; i++) {
			Fee[i].information();
			System.out.println(fee[i].section);
			fee[i].charge();
		}


		/*
			Fee[] fee = new Fee[3];
			fee[0] = new Student();
			fee[1] = new Adult();
			fee[2] = new Old();

			for(int i=0; i<fee.length; i++) {
				((BusCharge)fee[i]).information();
				System.out.println(((BusCharge)fee[i]).section);
				fee[i].charge();
			}
		*/

//*/
	}
}
