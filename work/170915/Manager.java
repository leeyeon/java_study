//package jb04.part03;

public class Manager extends Employee  
{
	int salary;

	public Manager()
	{
		System.out.println("Manager의 default Construtor");
	}

	public Manager(String name)
	{
		super(name);
		System.out.println("Manager의 name을 받는 Construtor");
	}

	public Manager(String name, String part)
	{	
		this(name);
		this.part = part;
		System.out.println("Manager의 name,part을 받는 Construtor");
	}

	public Manager(String name, String part,int age)
	{	
		this(name, part);
		this.age = age;
		System.out.println("Manager의 name,part,age을 받는 Construtor");
	}

	public Manager(String name, String part, int age, int salary)
	{	
		this(name,part,age);
		this.salary = salary;
		System.out.println("Manager의 name,part,age,salary을 받는 Construtor");
	}
	public void callSalary() 
	{
		System.out.println("Manager의 기본급은 : "+salary());

	}

	public static void main (String args[])
	{
	
		//Manager m1 = new Manager("홍길동");

		Manager m1 = new Manager("홍길동","EJB",25,300);

	}
}
