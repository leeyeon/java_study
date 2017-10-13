import java.util.*;

public class VectorTest03 
{
	public static void main(String[] args) 
	{
		// Vector ��ü ������ ����(����, ����)�� �ν��Ͻ� DataType ����
		List<String> vector = new Vector<String>(10, 10);

		// Vector�� String����
		// add(E obj) : E�� ���ڷ� �޴´ٴ� �ǹ̴� ? :: Generic ������� ������ ����ȯ ���ʿ�
		String s1 = new String("1.ȫ");
		vector.add(s1);
		vector.add(new String("2.��"));
		vector.add("3.�� �ȳ�");

		// Vector ����� ���� ���
		for(int i=0; i<vector.size();i++){
			//Generic ������� ������ ����ȯ ���ʿ�
			//String s = vector.elementAt(i);
			//System.out.print(s);
			System.out.print( ((Vector)vector).elementAt(i) );
		}

		System.out.println("\nJDK 1.5 �߰���� :: Generic, enhanced For Loop ���");
		//==> ���� for ���� ���Ͽ� ��������. / JDK1.5�� �߰���� :: Enhanced For Loop
		// Vector ���ο� ����� ���� size()��ŭ �ݺ�, 1EA �� ���� String �ش�. (Generic �������..)

		for(String value : vector){
			System.out.print( value );
		}

		System.out.println("\n ==> API Ȯ�� ");
		((Vector)vector).insertElementAt("4.��", 1);
		for(int i=0; i<vector.size(); i++){
			System.out.print( ((Vector)vector).elementAt(i) );
		}
		
		System.out.println("\n ==> API Ȯ�� ");
		((Vector)vector).setElementAt("5.ȫ���", 3);
		for(int i=0; i<vector.size()
			; i++){
			System.out.print( ((Vector)vector).elementAt(i) );
		}

		System.out.println("\n ==> API Ȯ�� ");
		((Vector)vector).removeElementAt(3);
		for(int i=0; i<vector.size(); i++){
			System.out.print( ((Vector)vector).elementAt(i) );
		}

			
		}
}