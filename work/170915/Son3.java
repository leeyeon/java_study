public class Son3 extends Iam 
{
	String school;

	public Son3(){
		System.out.println("Son class default Constructor");
	}

	public void setSchool(String str){
		school = str;
	}

	public String getSchool(){
		return school;
	}

	public static void main(String args[]){

		Son3 son = new Son3();

		
		son.setName("홍길동아들");
		son.setAge(50);
		son.setJob("개발자준비중");
		son.setSchool("아이티교육센터");

		System.out.println("이름 : "+son.getName());
		System.out.println("나이 : "+son.getAge());
		System.out.println("직업 : "+son.getJob());
		System.out.println("학교 : "+son.getSchool());
		
	}
}