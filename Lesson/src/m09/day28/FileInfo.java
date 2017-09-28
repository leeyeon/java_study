package m09.day28;

import java.io.*;

/*
* 	FileName : FileInfo.java 
*/
public class FileInfo {
	
	///main method
  	public static void main (String args[]) {

		System.out.println("���� �̸��� �������� ");
		
		String name= ""; 
		//==> NullString  ==> String s =  new String()�� ���� �ǹ�
		//==> String s = null�� �����սô�.
		
		// ���� �̸��� �޾Ƶ���
		try {
			  BufferedReader in =
					   new BufferedReader(new InputStreamReader(System.in));
			  name = in.readLine();      
		}catch (Exception e) {
			e.printStackTrace();
		}

		// file Ŭ���� ��ü ����
		File file = new File(name);
		
		//file �� �����Ѵٸ� file ���õ� information ���
		if (file.exists()) {
		  System.out.println("���� �̸� : " + file.getName());
		  System.out.println("��� �н� : " + file.getPath());
		  System.out.println("���� �н� : " + file.getAbsolutePath());
		  System.out.println("���� ���� : " + file.canWrite());
		  System.out.println("�б� ���� : " + file.canRead());
		  System.out.println("���� ���� : " + file.length() + " ����Ʈ");
		}else{
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
  }//end of main
  	
} //end of class