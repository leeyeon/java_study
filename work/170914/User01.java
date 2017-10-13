public class User01 
{
	String name = "ȫ�浿";
	int javaLevel = 0;

	public User01(){
		System.out.println("Constructor Method");
	}

	public String getName() {
		return name;
	}

	public int getJavaLevel() {
		return javaLevel;
	}

	public static void main(String[] args) {
		
		System.out.println("====================");
		User01 user = new User01();
		System.out.println("====================");

		/*
		System.out.println("====================");
		User01 user;
		System.out.println("====================");
		user = new User01();
		System.out.println("====================");
		new User01();
		System.out.println("====================");
		*/

		System.out.println("name : "+user.getName());
		System.out.println("javaLevel : "+user.getJavaLevel());
	}
}
