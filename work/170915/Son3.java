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

		
		son.setName("ȫ�浿�Ƶ�");
		son.setAge(50);
		son.setJob("�������غ���");
		son.setSchool("����Ƽ��������");

		System.out.println("�̸� : "+son.getName());
		System.out.println("���� : "+son.getAge());
		System.out.println("���� : "+son.getJob());
		System.out.println("�б� : "+son.getSchool());
		
	}
}