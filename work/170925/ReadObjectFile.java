import java.io.*;

public class ReadObjectFile
{
	public static void main(String[] args) throws Exception
	{
		//1. File에서 instance를 읽을 SinkStream :: FileInputStream 생성
		//2. instance 를 읽는 FilterStream : ObjectInputStream 생성
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserInfo.obj"));

		UserVO user01 = (UserVO)ois.readObject(); //==> API확인 ==> 명시적인 형변환이유?
		UserVO user02 = (UserVO)ois.readObject(); //==> API확인 ==> 명시적인 형변환이유?

		System.out.println("1번째 회원정보 :: "+user01);
		System.out.println("2번째 회원정보 :: "+user02);

		ois.close();
	}
}
