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
		System.out.println("������ݾȳ�");
	}
	
	// ������ ������, ����Ŭ������ OverRiding�� �������ϴ� �߻� �޼��� ����
	public abstract void charge();
}

// abstract Ŭ���� ��� �� , abstract �޼��� ���� OverRiding �ؾߵ� !!!
class Student extends BusCharge
{
	public Student(){
		super("�л�");
	}

	public void charge() {
		System.out.println("300��");
	}
}

class Adult extends BusCharge
{
	public Adult() {
		super("�Ϲ���");
	}
	
	public void charge() {
		System.out.println("500��");
	}
}

class Old extends BusCharge
{
	public Old() {
		super("���");
	}

	public void charge() {
		System.out.println("��¥");
	}
}

public class Display04
{
	public static void main(String[] args) 
	{
		// ���� ���۷����� ���� �ν��Ͻ��� ������ �� �ִٴ� (������ ����ȯ)
		// polymophism : �ϳ��� �������̽��� ������ �� �ְ� �پ��ϰ� Ȱ���� �� ����
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
			Display03�� �߰��� �κ�
			���� �ڵ��� �Ʒ� �ڵ� ��
			1. �ݺ��� �κ�?
			2. ���� Data Type�� �������� �ϰ� ����?
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
