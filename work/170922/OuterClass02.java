//package jp02.part05;

public class OuterClass02  
{	
	private String outer = "outerClass의 Field";

	public OuterClass02(){
	}

	public void outerMethod(){
		System.out.println("::"+this.getClass().getName()+"start..");

		final String localVariable = "OuterClass내의 outerMethod의 localVariable";
		
		class InnerLocalClass{
		
		private String inner = "innerClass의 Field";

		public InnerLocalClass(){
		}

		public void innerMethod(){
			System.out.println("==>"+this.getClass().getName()+"start..");
			//innerClass에서 OuterClass로 접근하기
			System.out.println(localVariable);
			System.out.println(outer);
			System.out.println(inner);
			System.out.println("==>"+this.getClass().getName()+"end..");
		}
	}

	System.out.println("::"+this.getClass().getName()+"start..");

	//inne local class를 둘러싼 method에서 인스턴스 생성가능
	InnerLocalClass ilc = new InnerLocalClass();
	ilc.innerMethod();
}
	public static void main(String[] args) 
	{
		new OuterClass02().outerMethod();
	}
}
