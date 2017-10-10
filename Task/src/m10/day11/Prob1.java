package m10.day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Vector;

public class Prob1 {

	public List<String> getList() {
		
		Vector<String> score = new Vector<String> ();
		String fileName = "./list.txt";

		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			String source = "";
			while((source = br.readLine()) != null) {
				String result = "[";
				String[] pasing = source.split("/");
				
				for(int i=0; i < pasing.length; i++) {
					result += pasing[i]+", ";
				}
				
				if("sql".equals(pasing[1].toLowerCase())) {
					if(Integer.parseInt(pasing[2]) >= 90)
						result += "����";
					else
						result += "�̼���";
				} else if("java".equals(pasing[1].toLowerCase())) {
					if(Integer.parseInt(pasing[2]) >= 80)
						result += "����";
					else
						result += "�̼���";
				}
				
				score.add(result+"]");
			}
			
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		return score;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> scores = new Prob1().getList();
		
		for(int i=0; i<scores.size(); i++) {
			System.out.println(scores.get(i));
		}
	}

}