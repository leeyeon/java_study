//package jp03.part02;

import java.io.*;

public class ReaderTest 
{
	public static void main(String[] args) 
	{
		try
		{
			//InputStream : 표준입력장치를 추상화한 class
			InputStream inputStream = System.in;
			//InputStream을 Reader로 변경 (byte처리 -> 문자처리변경)
			//한글처리가 가능해짐
			Reader reader = new InputStreamReader(inputStream);
			
			System.out.println("입력을 기다립니다...");

			//값을 읽어들이는 무한 loop 시작
			while(true) {
				
				//1.java.io 는 지연될 수 있다
				int i = reader.read();
				char c = (char) i;

				//2.java.io 는 FIFO 구조임
				//Q... 왜 입력한 값에 공백이 두번이 더 나오냐!!!!
				System.out.println("입력하신 값: "+c);

				//x가 입력되면 종료
				if(c=='x') {
					inputStream.close();
					break;
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}
}
