import java.util.Stack;

public class StackTest
{
	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<String>();

		String value = new String("1 : ȫ�浿");
		stack.push(value);
		stack.push( new String("2 : �̼���"));
		stack.push("3 : �ָ�");

		System.out.println("==> ����� Data ���� : "+stack.size());
		String str1 = stack.pop();
		System.out.println(str1);

		System.out.println("==> ����� Data ���� : "+stack.size());
		String str2 = stack.peek(); // ==> pop(), peek()�� ��������...
		System.out.println(str2);

		System.out.println("==> ����� Data ���� : "+stack.size());
		while( !stack.isEmpty() ){
			String str3 = (String)stack.pop();
			System.out.println(str3);
		}
	}
}
