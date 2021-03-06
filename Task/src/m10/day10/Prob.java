package m10.day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Prob {
	
	
	public Vector getScore(String fileName) {
		
		BufferedReader br = null;
		Vector<Score> score = new Vector<Score>();
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			
			String source = "";
			while( (source=br.readLine()) != null ) {
				String[] pashing = source.split("/");
				int kor = Integer.parseInt(pashing[1]);
				int eng = Integer.parseInt(pashing[2]);
				int math = Integer.parseInt(pashing[3]);
				score.add(new Score(pashing[0], kor, eng, math));
			}
			
			br.close();
		
		} catch(FileNotFoundException e) {
			System.out.println("error1");
		} catch(IOException e) {
			System.out.println("error2");
		} finally {
			
		}
		
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prob p2 = new Prob();
		Vector scores = p2.getScore("src/data.txt");
		//Vector<Score> scores = p2.getScore("src/data.txt");
		for(int i=0; i<scores.size(); i++) {
			Score score = (Score)scores.get(i);
			System.out.println(scores.get(i));
		}
		
	}

}
