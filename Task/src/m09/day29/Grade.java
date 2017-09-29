package m09.day29;

import java.io.*;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Grade grade = new Grade();
			String fileName ="score.txt";
			grade.printGrade(fileName);
	}
	
	public void printGrade(String fileName) {
		
		BufferedReader br = null;
		int count = 0;
		int sum = 0;

		try {
			br = new BufferedReader(new FileReader(fileName));
			String source = "";
			while ( (source = br.readLine()) != null) {
				String[] pashing = source.split(",");
				
				//��ȿ��
				if(pashing.length == 2) {
					count ++;
					sum += Integer.parseInt(pashing[1]);
					System.out.println(pashing[0]+"�� ������ "+pashing[1]+"�� �Դϴ�.");
				}
			}
			
			br.close();

			if(count == 0) {
				System.out.println("count error");
				return;
			}
			
			System.out.println("����� ������ "+sum+"�� �Դϴ�.");
			System.out.println("����� ����� "+sum/count+"�� �Դϴ�.");			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		
	}

}
