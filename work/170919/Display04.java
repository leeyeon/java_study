//package jb05.part05.test04;

abstract class BusCharge
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
	
	// 사용되지 않으며, 하위클래스에 OverRiding을 강하제하는 추상 메서드 정의
	public abstract void charge();
}

// abstract 클래스 상속 시 , abstract 메서드 필히 OverRiding 해야됨 !!!
class Student extends BusCharge
{
	public Student(){
		super("학생");
	}

	public void charge() {
		System.out.println("300원");
	}
}

class Adult extends BusCharge
{
	public Adult() {
		super("일반인");
	}
	
	public void charge() {
		System.out.println("500원");
	}
}

class Old extends BusCharge
{
	public Old() {
		super("어르신");
	}

	public void charge() {
		System.out.println("공짜");
	}
}

public class Display04
{
	public static void main(String[] args) 
	{
		// 상위 레퍼런스로 하위 인스턴스를 참조할 수 있다능 (묵시적 형변환)
		// polymophism : 하나의 인터페이스로 접근할 수 있고 다양하게 활용할 수 있음
		BusCharge bc1 = new Student();
		BusCharge bc2 = new Adult();
		BusCharge bc3 = new Old();

		bc1.information();
		System.out.println(bc1.section);
		bc1.charge();

		bc2.information();
		System.out.println(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge();


		/*
			Display03에 추가된 부분
			위의 코딩과 아래 코딩 비교
			1. 반복된 부분?
			2. 같은 Data Type을 묶음으로 일괄 관리?
		*/

		BusCharge[] bc = new BusCharge[3];
		bc[0] = new Student();
		bc[1] = new Adult();
		bc[2] = new Old();

		for(int i=0; i<bc.length; i++) {
			bc[i].information();
			System.out.println(bc[i].section);
			bc[i].charge();
		}
	}
}
