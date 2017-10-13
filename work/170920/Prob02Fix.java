class Person
{
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void print() {
		System.out.print("��  �� : "+name+"\t��  �� : "+age+printAdd());
	}

	// ��ӹ޴� ��ü �������̵��ϱ�
	public String printAdd() {
		return "";
	}
}


class Employee extends Person
{
	private String dept;

	public Employee() {
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public String printAdd() {
		return "\t��    ��: "+dept+"\n";
	}
}

class Student extends Person
{
	private int id;

	public Student() {
	}

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String printAdd() {
		return "\t��    ��: "+id+"\n";
	}
}

class Teacher extends Person
{
	private String subject;

	public Teacher() {
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public String printAdd() {
		return "\t������: "+subject+"\n";
	}
}



public class Prob02Fix
{
	public static void main(String[] args) 
	{
		Student s = new Student("ȫ�浿", 20, 200201);
		Teacher t = new Teacher("�̼���", 30, "JAVA");
		Employee e = new Employee("������", 40, "������");

		s.print();
		t.print();
		e.print();
	}
}