package m09.day29;

import java.io.*;
import java.util.ArrayList;

public class FileController {

	public void reverseLine(String oldf, String newf) throws Exception {
		
		ArrayList<String> arr = new ArrayList<String>();
		BufferedReader br;
		BufferedWriter bw;
		
		br = new BufferedReader(new FileReader(oldf));
		bw = new BufferedWriter(new FileWriter(newf));
		
		String source = "";
		while ( (source = br.readLine()) != null) {
			arr.add(source);
		}
		
		for(int i = arr.size()-1; i>=0; i--) {
			bw.write(arr.get(i));
			
			if(i>0) bw.newLine();
			if(i==arr.size()-1) System.out.println("����");

		}
		
		//������
		bw.flush();
		
		//stream �ݱ�
		br.close();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileController c = new FileController();
		String oldf = "files/oldf.txt";
		String newf = "files/newf.txt";
		c.reverseLine(oldf, newf);
		
	}

}
