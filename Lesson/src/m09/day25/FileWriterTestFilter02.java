package m09.day25;

import java.io.*;

public class FileWriterTestFilter02
{
	public static void main(String[] args) throws IOException 
	{
		// �ʿ䰴ü Stream/String �ν��Ͻ� declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		// keyboard �� �Է¹ޱ� ���� Sink Stream Reader ��
		// 1���� line�� �б����� readLine() method�� �����ϴ� BufferedReader ����
		// Reader r = new InputStreamReader(System.in);
		// br = new BufferedReader(r);
		br = new BufferedReader(new InputStreamReader(System.in));

		// File�� ���� �������� FileWriter �� BufferWriter ����
		// FileWriter fw = new FileWriter("test.txt");
		// bw = new BufferedWriter(fw);
		bw = new BufferedWriter(new FileWriter("test.txt"));  // ==>APIȮ��
		// bw = new BufferedWriter(new FileWriter("test.txt", true));  // ==>APIȮ��

		System.out.println("ȭ�Ͽ� �����Ͻ� ���� �Է��ϼ���.");
		while(true){
			String str = br.readLine();
			if(str.equals("��")){
				break;
			}
			bw.write(str, 0, str.length()); // ==>API�� Ȯ������.
			bw.newLine(); // ==> API�� Ȯ������. (�ٹٲٱ�)
		}
		bw.flush(); // flush �� ������ ��
		
		// Stream close()
		br.close();
		bw.close();

	}
}
