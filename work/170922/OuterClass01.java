class OuterClass01 
{
	private String outer = "OuterClass 의 Field";

	public OuterClass01(){}

	public void outerMethod(){
		System.out.println(":: "+this.getClass().getName()+" start..");
		// innerClass에 접근할 경우 인스턴스 생성 후 접근
		InnerClass ic = new InnerClass();
		ic.innerMethod();
		System.out.println(":: "+this.getClass().getName()+" end..");
	}

	// InnerMember Class
	public class InnerClass
	{
		private String inner = "InnerClass 의 Field";

		public InnerClass(){}

		public void innerMethod(){
			// innerClass에서 outer class로 접근
			//OuterClass의 Field, Method에 쉽게 접근 :: 레퍼런스 불필요
			System.out.println("==> "+this.getClass().getName()+" start..");
			//==>Outer Class 의 Field 접근 방식 :: 2 가지
			System.out.println(outer);
			System.out.println(OuterClass01.this.outer);
			//==>아래의 실행문을 주석 풀면 compile error 가 발생한다. 이유는...
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