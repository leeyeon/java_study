import java.util.*;

public class ArrayCopy 
{
	public List<String> moveToVector(String[] datas) {
		
		List<String> vc = new Vector<String>(datas.length);

		for ( int i = datas.length-1; i >= 0; i--) {
			vc.add(datas[i]);
		}
		

		return vc;
	}
	public static void main(String[] args) 
	{
		ArrayCopy ac = new ArrayCopy();
		String datas[] = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
		//Vector<String> vector = ac.moveToVector(datas);

		/*
		System.out.println("입력 배열: ");
		for( int i=0; i < datas.length; i++ ) {
			System.out.print((i == 0 ? "\t{ \"":"\"") + datas[i]
						+ (i == (datas.length-1) ? "\" };\n":"\" ,") );
		}

		System.out.println("리턴되는 Vector: ");
		for( int i=0; i < vector.size(); i ++ ) {
			System.out.print((i == 0 ? "\t\"":"\"") + vector.elementAt(i)
						+ (i == (datas.length-1) ? "\" 의 순서로 저장된 Vector\n":"\" ,") );
		}
		*/
	}
}
