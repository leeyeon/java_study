
class JuniorHighSchool {
	String name;

	public JuniorHighSchool(){
		name = "대한민국중학교";
	}

	public void schoolName(){
		System.out.println("중학교 이름 : "+name);
	}
}

class HighSchool extends JuniorHighSchool{
	String name;

	 public HighSchool(){
		 name = "대한민국고등학교";
	 }

	 public HighSchool(String name){
		 this.name = name;
	 }

	 public void schoolName(){
		 System.out.println("중학교 이름 : "+super.name);
		 System.out.println("고등학교 이름 : "+this.name);
		 System.out.println("고등학교 이름 : "+name);
	 }
}

public class SuperThisTest{

	public static void main(String[] args){

		HighSchool hs01 = new HighSchool();
		hs01.schoolName();

		System.out.println("===========================");

		HighSchool hs02 = new HighSchool("서울고등학교");
		hs02.schoolName();
	}
}
