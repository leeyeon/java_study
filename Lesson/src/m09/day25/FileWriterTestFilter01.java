package m09.day25;

import java.io.*;

public class FileWriterTestFilter01
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = null;
		BufferedWriter bw = null;
		String fileName = "";
		String copyFileName = "";

		int readCount = 0;

		System.out.print("copy�� file �̸��� �Է��ϼ��� : ");
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();

		//==> �������� Data�� read �� �� �ִ� BufferedReader ����
		br = new BufferedReader( new FileReader( fileName ) );

		//==> �纻���� �̸� �����
		copyFileName = fileName+"_copy";

		//==> Data�� write �� �� �ִ� BufferedWriter ����
		 bw = new BufferedWriter ( new FileWriter(copyFileName) );

		 // read / writer �ϴ� while��
		 String source = null;
		 while( (source = br.readLine()) != null){
			 bw.write(source);
			 bw.newLine();
			 readCount++;
		 }
		 bw.flush();

		 //stream close()
		 bw.close();
		 br.close();

		 System.out.println("=============================================");
		 System.out.println("========> readȽ�� readCount : "+readCount);
		 System.out.println("=============================================");

	}
}
