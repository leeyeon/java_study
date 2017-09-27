//package jp03.part01;

import java.io.*;

public class InputTest 
{
	public static void main(String[] args) 
	{
		//InputStream : 표준입력장치를 추상화한 class
		InputStream inputStream = System.in;
		
		System.out.println("입력을 기다립니다...");

		try
		{
			//값을 읽어들이는 무한 loop 시작
			while(true) {
				
				//1.java.io 는 지연될 수 있다
				int i = inputStream.read();
				char c = (char) i;

				//2.java.io 는 FIFO 구조임
				//Q... 왜 입력한 값에 공백이 두번이 더 나오냐!!!!
				System.out.println("입력하신 값: "+c);

				//x가 입력되면 종료
				if(c=='x') {
					inputStream.close();
					break;
				}
				//한글입력시 깨짐 char형은 영문자 한개씩 받으니까~~ 한글은 char 2개 필요함
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
