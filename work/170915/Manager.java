//package jb04.part03;

public class Manager extends Employee  
{
	int salary;

	public Manager()
	{
		System.out.println("Manager�� default Construtor");
	}

	public Manager(String name)
	{
		super(name);
		System.out.println("Manager�� name�� �޴� Construtor");
	}

	public Manager(String name, String part)
	{	
		this(name);
		this.part = part;
		System.out.println("Manager�� name,part�� �޴� Construtor");
	}

	public Manager(String name, String part,int age)
	{	
		this(name, part);
		this.age = age;
		System.out.println("Manager�� name,part,age�� �޴� Construtor");
	}

	public Manager(String name, String part, int age, int salary)
	{	
		this(name,part,age);
		this.salary = salary;
		System.out.println("Manager�� name,part,age,salary�� �޴� Construtor");
	}
	public void callSalary() 
	{
		System.out.println("Manager�� �⺻���� : "+salary());

	}

	public static void main (String args[])
	{
	
		//Manager m1 = new Manager("ȫ�浿");

		Manager m1 = new Manager("ȫ�浿","EJB",25,300);

	}
}
