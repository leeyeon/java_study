class Passanger
{
	String section;
	int charge;

	public Passanger() {}

	public Passanger(String section, int charge) {
		this.section = section;
		this.charge = charge;
	}

	public void information() {
		System.out.println("버스요금안내");
		System.out.println("학생:300,일반인:500, 어르신:공짜");
	}

	public void charge() {
		System.out.println(section +" :: "+charge+"원");
	}

}


class Student extends Passanger{
	public Student(){
		super("학생", 300);
	}
}

class Adult extends Passanger {	
	public Adult(){
		super("일반인", 500);
	}
}

class Old extends Passanger {	
	public Old(){
		super("어르신", 0);
	}

	public void charge(){
		System.out.println(section +" :: 공짜");
	}
}


public class DisplayFix 
{
	public static void main(String[] args) 
	{
		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();

		b1.information();
		b1.charge();
		b2.charge();		
		b3.charge();
	}
}
