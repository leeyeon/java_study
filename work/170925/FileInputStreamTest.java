//package jp03.part03;

import java.io.*;

public class FileInputStreamTest 
{
	public static void main(String[] args) 
	{
		//File �� �о� ���̴� Stream ����
		FileInputStream fis = null;
		//read() �� count�ϱ� ���� ����
		int readCount = 0;

		try
		{
			fis = new FileInputStream(args[0]);
			
			while(true) {
				int i = fis.read();

				//the next byte of data, or -1 if the end of the stream is reached.
				if(i == -1) {
					break;
				}

				char c= (char)i;
				System.out.print(c);

				readCount ++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			System.out.println("\n\n=============================");
			System.out.println("=====>>> read Ƚ�� readCount: "+readCount);
			System.out.println("=============================");
			try {
				fis.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
