//package jp03.part02;

import java.io.*;

public class WriterTest
{
	public static void main(String[] args) 
	{
		try
		{
			//InputStream : 표준입력장치를 추상화한 class
			InputStream inputStream = System.in;
			//문자처리를 위한 reader로 변경
			Reader reader = new InputStreamReader(inputStream);

			//OutPutStream : 표준출력장치를 추상화한 class
			OutputStream outputStream = System.out;
			//문자처리를 위한 Writer로 변경
			Writer writer = new OutputStreamWriter(outputStream);

			System.out.println("입력을 기다립니다...");

			while(true) {
				int i = reader.read();
				writer.write(i);
				writer.flush();
				//write 된거 바로바로 출력함 (출력하는 메서드임)

				//x가 입력되면 종료
				if((char)i=='x') {
					break;
				}
			}

			//while문 내부의 flush()와 밖의 flush() 의미는?
			//while에서 입력받은 것들 한번에 내보냄..
			//writer.flush();

			//Stream close()
			reader.close();
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}
}
