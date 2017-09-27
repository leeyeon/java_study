package m09.day25;

import java.io.*;

public class WriterTest
{
	public static void main(String[] args) 
	{
		try
		{
			//InputStream : ǥ���Է���ġ�� �߻�ȭ�� class
			//InputStream inputStream = System.in;
			//����ó���� ���� reader�� ����
			Reader reader = new InputStreamReader(System.in);

			//OutPutStream : ǥ�������ġ�� �߻�ȭ�� class
			//OutputStream outputStream = System.out;
			//����ó���� ���� Writer�� ����
			Writer writer = new OutputStreamWriter(System.out);

			System.out.println("�Է��� ��ٸ��ϴ�...");

			while(true) {
				int i = reader.read();
				writer.write(i);
				writer.flush();
				//write �Ȱ� �ٷιٷ� ����� (����ϴ� �޼�����)

				//x�� �ԷµǸ� ����
				if((char)i=='x') {
					break;
				}
			}

			//while�� ������ flush()�� ���� flush() �ǹ̴�?
			//while���� �Է¹��� �͵� �ѹ��� ������..
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
