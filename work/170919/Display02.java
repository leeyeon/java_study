//package jb05.part04.test02;

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

public class Display02
{
	public static void main(String[] args) 
	{
		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();

		b1.information();
		System.out.println(b1.section);
		b1.charge();

		b2.information();
		System.out.println(b2.section);
		b2.charge();

		b3.information();
		System.out.println(b3.section);
		b3.charge();

	}
}
