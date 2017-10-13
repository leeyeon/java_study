package m10.day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

public class Prob1 {

	public List<String> getList() {
		
		Vector<String> score = new Vector<String> ();
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("./list.txt"));
			

			String source = "";
			while((source = br.readLine()) != null) {
				String result = "[";
				String check = "미수료";
				String[] pasing = source.split("/");
				
				for(int i=0; i < pasing.length; i++) {
					result += pasing[i]+", ";
				}
				
				if("sql".equalsIgnoreCase(pasing[1])) {
					if(Integer.parseInt(pasing[2]) >= 90)
						check = "수료";
				} else if("java".equalsIgnoreCase(pasing[1])) {
					if(Integer.parseInt(pasing[2]) >= 80)
						check = "수료";
				}
				
				score.add(result+check+"]");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return score;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> scores = new Prob1().getList();
		
		/*
		for(int i=0; i<scores.size(); i++) {
			System.out.println(scores.get(i));
		}
		*/
		for(String data : scores) {
			System.out.println(data);
		}
	}

}
