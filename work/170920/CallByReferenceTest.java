//Package jp01.part02;

public class CallByReferenceTest
{

	int number = 100;

	public void referenceChange(CallByReferenceTest value) {
		System.out.println("===================");
		value.number = value.number + 100;
		System.out.println("value.number : "+value.number);
		System.out.println("===================");
	}
	
	public static void main(String[] args) 
	{
		CallByReferenceTest call = new CallByReferenceTest();

		call.referenceChange(call);
		System.out.println("call.number : "+call.number);

	}
}
