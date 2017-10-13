//package jp01.part09;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest  
{
	public static void main(String[] args) 
	{	
		Queue<String>queue = new LinkedList<String>();

		String value = new String("1: È«±æµ¿");
		queue.offer(value);
		queue.offer(new String ("2: ÀÌ¼ø½Å"));
		queue.offer("3: ÁÖ¸ù");

		String str1 = (String)queue.poll();
		System.out.println(str1);

		String str2 = (String)queue.peek();
		System.out.println(str2);

		String str4 = (String)queue.element();
		System.out.println("str4 : "+str4+" ... ");

		while (queue.peek() != null)
		{
			String str3 = (String)queue.poll();
			System.out.println(str3);
		}
	}
}
