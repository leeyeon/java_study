class Super
{
	// Method
	public void a() {
		System.out.println("Super : a()");
	}
}

// ���� class Super�� ��ӹ޴� ���� Class Sub ����
class Sub extends Super
{
	// Method
	public void a() {
		System.out.println("overriding�� Sub: a()");
	}

	public void b() {
		System.out.println("sub : b()");
	}
}

public class CastingComplete 
{
	public static void main(String[] args) 
	{
		// �ϳ� : ���� class �ν��Ͻ� ����
		System.out.println("\n ����� Super s1 = new Super() �κ�");
		Super s1 = new Super();
		s1.a();

		// �� : ���� class �ν��Ͻ� ����
		System.out.println("\n ����� Sub s2 = new Sub() �κ�");
		Sub s2 = new Sub();
		s2.a();
		s2.b();

		// �� : ���� data type ���� ���� �ν��Ͻ� ����
		System.out.println("\n ����� Super s3 = new Sub() �κ�");
		Super s3 = new Sub();
		s3.a();

		//error �߻���
		//s3.b();
		// ����Ҷ�� casting ������ ����ؼ� ����� ����ȯ �ؾߵ˹̴� *�Ʒ�*

		System.out.println("\n s3�� b()�� ���� �Ұ��ϴ�.");
		System.out.println("casting �����ڸ� �̿� Sub sub = (Sub)s3 ����� ����ȯ");
		Sub sub = (Sub)s3;
		sub.b();

		// �� : ���� data type ���� ���� �ν��Ͻ� ����
		// error
		// Sub s4 = new Super();

	}
}
