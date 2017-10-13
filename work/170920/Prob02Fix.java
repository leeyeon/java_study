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
		System.out.print("이  름 : "+name+"\t나  이 : "+age+printAdd());
	}

	// 상속받는 개체 오버라이딩하기
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
		return "\t부    서: "+dept+"\n";
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
		return "\t학    번: "+id+"\n";
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
		return "\t담당과목: "+subject+"\n";
	}
}



public class Prob02Fix
{
	public static void main(String[] args) 
	{
		Student s = new Student("홍길동", 20, 200201);
		Teacher t = new Teacher("이순신", 30, "JAVA");
		Employee e = new Employee("유관순", 40, "교무과");

		s.print();
		t.print();
		e.print();
	}
}