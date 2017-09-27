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

		System.out.print("copy할 file 이름을 입력하세요 : ");
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();

		//==> 원본파일 Data를 read 할 수 있는 BufferedReader 생성
		br = new BufferedReader( new FileReader( fileName ) );

		//==> 사본파일 이름 만들기
		copyFileName = fileName+"_copy";

		//==> Data를 write 할 수 있는 BufferedWriter 생성
		 bw = new BufferedWriter ( new FileWriter(copyFileName) );

		 // read / writer 하는 while문
		 String source = null;
		 while( (source = br.readLine()) != null){
			 bw.write(source);
			 readCount++;
		 }
		 bw.flush();

		 //stream close()
		 bw.close();
		 br.close();

		 System.out.println("=============================================");
		 System.out.println("========> read횟수 readCount : "+readCount);
		 System.out.println("=============================================");

	}
}
