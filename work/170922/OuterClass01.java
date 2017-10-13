class OuterClass01 
{
	private String outer = "OuterClass �� Field";

	public OuterClass01(){}

	public void outerMethod(){
		System.out.println(":: "+this.getClass().getName()+" start..");
		// innerClass�� ������ ��� �ν��Ͻ� ���� �� ����
		InnerClass ic = new InnerClass();
		ic.innerMethod();
		System.out.println(":: "+this.getClass().getName()+" end..");
	}

	// InnerMember Class
	public class InnerClass
	{
		private String inner = "InnerClass �� Field";

		public InnerClass(){}

		public void innerMethod(){
			// innerClass���� outer class�� ����
			//OuterClass�� Field, Method�� ���� ���� :: ���۷��� ���ʿ�
			System.out.println("==> "+this.getClass().getName()+" start..");
			//==>Outer Class �� Field ���� ��� :: 2 ����
			System.out.println(outer);
			System.out.println(OuterClass01.this.outer);
			//==>�Ʒ��� ���๮�� �ּ� Ǯ�� compile error �� �߻��Ѵ�. ������...
			//System.out.println(this.outer);
			System.out.println(inner);
			System.out.println("==> "+this.getClass().getName()+" end..");
		}
	}

	public static void main(String[] args) 
	{
		new OuterClass01().outerMethod();
	}
}