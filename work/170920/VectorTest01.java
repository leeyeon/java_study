//package jp01.part05;

import java.util.*;

public class VectorTest01
{
	public static void main(String[] args) 
	{
		//Vector 의 API 생성자 확인하기
		//Vector<E> class 라고 써있듬 <E> = <Element>
		Vector vector = new Vector(10,10);
		//1.5부터 <> 안에 자료형 넣어줘야 컴파일 에러 안남
		//Vector<String> vector = new Vector<String>(10,10);

		//Vector에 Object 저장 => add(Object obj) : Object를 인자로 받는다?
		//=> 어떤 데이터형을 넣을지 모르기 때문에 Object형으로 모든 걸 형변환해서 집어넣음
		String s1 = new String("1.홍");
		vector.add(s1);
		vector.add(new String("2.동"));
		vector.add("3.님 안녕하세요");

		for(int i = 0; i < vector.size(); i++) {
			//elementAt(i) i 인덱스에 있는 거 출력하는 거 .. arr[i] 랑 같은 의미
			Object obj = vector.elementAt(i);
			//Object 를 String 으로 명시적 형변환
			String s = (String)obj;
			System.out.print(s);
		}

		System.out.println("\n ==> API 확인");
		//1번 index에다가 obj 삽입,, 기존 있던 거 사이에 끼워넣기
		vector.insertElementAt("4. 길", 1);
		for(int i=0; i<vector.size(); i++) {
			System.out.print( (String)vector.elementAt(i) );
		}

		System.out.println("\n ==> API 확인");
		//3번 index에 obj 넣기. 기존ㄲㅓ에 덮어씌워짐
		vector.setElementAt("5. 홍길순", 3);
		for(int i=0; i<vector.size(); i++) {
			System.out.print( (String)vector.elementAt(i) );
		}

		System.out.println("\n ==> API 확인");
		//3번 index 삭제
		vector.removeElementAt(3);
		for(int i=0; i<vector.size(); i++) {
			System.out.print( (String)vector.elementAt(i) );
		}

	}
}
