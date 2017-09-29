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
				
				//유효성
				if(pashing.length == 2) {
					count ++;
					sum += Integer.parseInt(pashing[1]);
					System.out.println(pashing[0]+"의 점수는 "+pashing[1]+"점 입니다.");
				}
			}
			
			br.close();

			if(count == 0) {
				System.out.println("count error");
				return;
			}
			
			System.out.println("모두의 총점은 "+sum+"점 입니다.");
			System.out.println("모두의 평균은 "+sum/count+"점 입니다.");			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		
	}

}
