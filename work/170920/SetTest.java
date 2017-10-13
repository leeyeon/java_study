package jp01.part09;

import java.util.HashSet;
import java.util.Set;

public class SetTest  
{
	public static void main(String[] args) 
	{	
		Set<String>hs = new HashSet<String>();

		String str = new String("A");
		boolean isAddOk = hs.add(str);
		System.out.println("저장유무 : "+isAddOk);

		isAddOk = hs.add("b");
		System.out.println("저장유무 : "+isAddOk);
		
		isAddOk = hs.add("B");
		System.out.println("저장유무 : "+isAddOk);

		isAddOk = hs.add("B");
		System.out.println("저장유무 : "+isAddOk);

		System.out.println("저장된 data 갯수 : "+hs.size());
		if(hs.contains("b")){
			System.out.println("저장된 data b를 삭제함 : ");
			hs.remove("b");
		}
		System.out.println("저장된 data 갯수 : "+hs.size());

	}
}
