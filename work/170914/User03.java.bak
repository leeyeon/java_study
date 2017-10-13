public class User03 
{
	String name;
	int javaLevel;

	public User03(){
		System.out.println("나는 생성자");
		name = "홍길동";
		javaLevel = 0;
	}

	public User03(String str) {
		System.out.println("나는 String을 인자로 받아 name을 초기화하는 생성자");
		name = str;
	}

	public User03(int i) {
		System.out.println("나는 int을 인자로 받아 javaLevel을 초기화하는 생성자");
		javaLevel = i;
	}

	public User03(String str, int i) {
		System.out.println("나는 String,int을 인자로 받아 name,javaLevel을 초기화하는 생성자");
		name = str;
		javaLevel = i;
	}
	
	public String getName() {
		return name;
	}

	public int getJavaLevel() {
		return javaLevel;
	}

	public static void main(String[] args) {
		
		System.out.println("====================");
		User03 user = new User03();
		System.out.println("====================");

		System.out.println("name : "+user.getName());
		System.out.println("javaLevel : "+user.getJavaLevel());
	}
}
