package shop.service.user;

public class Client {

	//Field
	private String id;
	protected String name;
	int salary;
	public boolean female;
	public static final String nationally = "¥Î«—πŒ±π";

	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	public Client(String id, String name, int salary, boolean female) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.female = female;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", salary=" + salary + ", female=" + female + "]";
	}

}
