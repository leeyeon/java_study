package m09.day25;

import java.io.*;

public class BufferedReaderTest
{
	public static void main(String[] args) throws Exception
	{
		//read �� count
		int readCount = 0;

		//SinkStream == >���ܿ��� �ܼ� ����� ���
		FileReader fr = new FileReader(args[0]);
		//FileterStream ==> �߰����� ��� ����
		BufferedReader br = new BufferedReader(fr);

		//BufferedReader br = new BufferedReader(new FileReader(args[0]);

		String oneLine = null;

		while(true){
			readCount ++;

			//readLine() : \n \r ���� �����Ͽ� read
			oneLine = br.readLine();
			//text ������ return null ... datatype�� String��
			if (oneLine == null) {
				break;
			}

			System.out.println("���� ���: "+readCount+" "+oneLine);
		}

		//Stream close
		br.close();
		fr.close();

	}
}
