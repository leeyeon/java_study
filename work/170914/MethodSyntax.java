public class MethodSyntax 
{
	String name = "홍길동";
	String add = "한양";

	public void browerOn() {
		System.out.println("brower을 켜다");
	}

	public boolean documentWork() {
		System.out.println("document 작업을 하고 작업 완성 유무를 boolean return");
		return true;
	}

	public int sum(int i, int j){
		System.out.println("<<"+i+">> 와 << " + j + " >> 값을 받아 합 return");
		return (i+j);
	}

	public String getName() {
		System.out.println("이름을 전달합니다");
		return name;
	}
	
	public String getAdd() {
		System.out.println("주소를 전달합니다.");
		return add;
	}

	public String[] getAllInformation() {
		String[] str = { name, add };
		return str;
	}
}
