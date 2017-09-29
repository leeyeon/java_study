package m09.day25;

import java.io.*;

public class ReaderTest 
{
	public static void main(String[] args) 
	{
		try
		{
			//InputStream : ǥ���Է���ġ�� �߻�ȭ�� class
			InputStream inputStream = System.in;
			//InputStream�� Reader�� ���� (byteó�� -> ����ó������)
			//�ѱ�ó���� ��������
			Reader reader = new InputStreamReader(inputStream);
			
			System.out.println("�Է��� ��ٸ��ϴ�...");

			//���� �о���̴� ���� loop ����
			while(true) {
				
				//1.java.io �� ������ �� �ִ�
				int i = reader.read();
				char c = (char) i;

				//2.java.io �� FIFO ������
				//Q... �� �Է��� ���� ������ �ι��� �� ������!!!!
				System.out.println("�Է��Ͻ� ��: "+c);

				//x�� �ԷµǸ� ����
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