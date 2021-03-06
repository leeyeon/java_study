//package jb04.part04;

abstract class  BusCharge
{	
	String section;
		
	public BusCharge(){}		
			
	public BusCharge(String str)
	{
		section = str;
	}

	public void information()
	{
		System.out.println("버스요금안내");
	}

	abstract public void charge();
}


class Student extends BusCharge
{	public Student(){
		super("학생");
	}
	public void charge(){
		System.out.println(":: 300원");
	}
}

class Adult extends BusCharge
{	public Adult(){
		super("일반인");
	}
	public void charge(){
		System.out.println(":: 500원");
	}
}

class Old extends BusCharge
{	public Old(){
		super("어르신");
	}
	public void charge(){
		System.out.println(":: 공짜\n");
	}
}

public class Display
{	
	public static void main(String args[])
	{
		BusCharge abc1 = new Student();	//Student b1 = new Student();
		BusCharge abc2 = new Adult();	//Adult b2 = new Adult();
		BusCharge abc3 = new Old();		//Old b3 = new Old();

		BusCharge[] bc = new BusCharge[3];
		bc[0] = new Student();
		bc[1] = new Adult();
		bc[2] = new Old();

		for(int i = 0; i < bc.length; i++) {
			bc[i].information();
			System.out.println(bc[i].section);
			bc[i].charge();
		}
/*
		abc1.information();
		System.out.println(abc1.section);
		abc1.charge();

		abc2.information();
		System.out.println(abc2.section);
		abc2.charge();
		
		abc3.information();
		System.out.println(abc3.section);
		abc3.charge();
*/

	}
}