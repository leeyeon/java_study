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
		System.out.println("������ݾȳ�");
	}
}

// charge()�� ������ interface
interface Fee
{
	public void charge();
}

// abstract Ŭ���� ��� �� , abstract �޼��� ���� OverRiding �ؾߵ� !!!
class Student extends BusCharge implements Fee
{
	public Student(){
		super("�л�");
	}

	// �Ʒ� Method �ּ�ó���ϰ� ������ �غ��� ������ ���� Ȯ���ϱ�
	public void charge() {
		System.out.println("300��");
	}
}

class Adult extends BusCharge implements Fee
{
	public Adult() {
		super("�Ϲ���");
	}
	
	public void charge() {
		System.out.println("500��");
	}
}

class Old extends BusCharge implements Fee
{
	public Old() {
		super("���");
	}

	public void charge() {
		System.out.println("��¥");
	}
}

public class Display07
{
	public static void main(String[] args) 
	{
		// ���� ���۷����� ���� �ν��Ͻ��� ������ �� �ִٴ� (������ ����ȯ)
		// polymophism : �ϳ��� �������̽��� ������ �� �ְ� �پ��ϰ� Ȱ���� �� ����
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


/*
		// compile error
		// 1. ���� �߻��� ����?
		// 2. ������ �ذ��Ͽ� ��µ� �� �ֵ��� ���� �����ϱ�
		// hint : casting ������..

		Fee[] fee = new Fee[3];
		fee[0] = new Student();
		fee[1] = new Adult();
		fee[2] = new Old();

		for(int i=0; i<fee.length; i++) {
			Fee[i].information();
			System.out.println(fee[i].section);
			fee[i].charge();
		}
*/


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


	}
}
