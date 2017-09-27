//package jp03.part03;

import java.io.*;

public class FileInputStreamTest 
{
	public static void main(String[] args) 
	{
		//File 을 읽어 들이는 Stream 선언
		FileInputStream fis = null;
		//read() 수 count하기 위한 변수
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
			System.out.println("=====>>> read 횟수 readCount: "+readCount);
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
