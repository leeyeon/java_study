class Super
{
	// Method
	public void a() {
		System.out.println("Super : a()");
	}
}

// 상위 class Super를 상속받는 하위 Class Sub 정의
class Sub extends Super
{
	// Method
	public void a() {
		System.out.println("overriding된 Sub: a()");
	}

	public void b() {
		System.out.println("sub : b()");
	}
}

public class CastingComplete 
{
	public static void main(String[] args) 
	{
		// 하나 : 상위 class 인스턴스 생성
		System.out.println("\n 여기는 Super s1 = new Super() 부분");
		Super s1 = new Super();
		s1.a();

		// 둘 : 하위 class 인스턴스 생성
		System.out.println("\n 여기는 Sub s2 = new Sub() 부분");
		Sub s2 = new Sub();
		s2.a();
		s2.b();

		// 셋 : 상위 data type 으로 하위 인스턴스 생성
		System.out.println("\n 여기는 Super s3 = new Sub() 부분");
		Super s3 = new Sub();
		s3.a();

		//error 발생함
		//s3.b();
		// 사용할라면 casting 연산자 사용해서 명시적 형변환 해야됩미당 *아래*

		System.out.println("\n s3는 b()에 접근 불가하다.");
		System.out.println("casting 연산자를 이용 Sub sub = (Sub)s3 명시적 형변환");
		Sub sub = (Sub)s3;
		sub.b();

		// 넷 : 하위 data type 으로 상위 인스턴스 생성
		// error
		// Sub s4 = new Super();

	}
}
