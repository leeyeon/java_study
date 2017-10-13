//package jp02.part05;

class  A
{	
	public void abc(String message){
		System.out.println("::"+this.getClass().getName()+"start..");
		System.out.println("::abc()"+message);
		System.out.println("::"+this.getClass().getName()+"end");
	}
}
	public class AnonymousInnerClass
	{	
		public static void main(String[] args){
		//1.�ν��Ͻ� ����, �ĺ�������  Method����
		System.out.println("1.=============================");
		A a = new A();
		a.abc("Hello");

		//2.�ν��Ͻ� ������ �ٷ� Method����
		System.out.println("2.=============================");
		new A().abc("Hello");
		
		/*==�Ʒ��ڵ带 ����=========
			public class B extend A{
				public void def(String message){
					System.out.println("::Hi "+message);
				}
			}
			new A() {
				public void def(String message){
					System.out.println("::Hi "+message);
				}
			}
			.abc("Hello");
			new B().df("Hello");
		=======================*/

		//3. ���� �ڵ带 �����Ѵٸ�, �Ʒ��� �ڵ��...
		//==>Anonymous(�͸�,�Ҹ�:�̸��� ����....)
		//==>���� �ҽ����� public class B extends �� �����...

		System.out.println("3.=============================");
		new A(){
			public void def(String message){
				System.out.println("::"+this.getClass().getName()+"start..");
				System.out.println("::abc()"+message);
				System.out.println("::"+this.getClass().getName()+"end");
			}
		}.abc("Hello");

		System.out.println("4.=============================");
		new A(){
			public void def(String message){
				System.out.println("::"+this.getClass().getName()+"start..");
				System.out.println("::abc()"+message);
				System.out.println("::"+this.getClass().getName()+"end");
			}
		}.def("Hello");
	}	
}
