//pakager jp3.part04;

import java.io.*;

public class BufferedReaderTest
{
	public static void main(String[] args) throws Exception
	{
		//read 수 count
		int readCount = 0;

		//SinkStream == >말단에서 단순 입출력 담당
		FileReader fr = new FileReader(args[0]);
		//FileterStream ==> 추가적인 기능 제공
		BufferedReader br = new BufferedReader(fr);

		//BufferedReader br = new BufferedReader(new FileReader(args[0]);

		String oneLine = null;

		while(true){
			readCount ++;

			//readLine() : \n \r 으로 구분하여 read
			oneLine = br.readLine();
			//text 없으면 return null ... datatype이 String임
			if (oneLine == null) {
				break;
			}

			System.out.println("한줄 출력: "+readCount+" "+oneLine);
		}

		//Stream close
		br.close();
		fr.close();

	}
}
