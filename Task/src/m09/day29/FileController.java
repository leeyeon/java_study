package m09.day29;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FileController {

	public void reverseLine(String oldf, String newf) throws Exception {
		
		//List<String> arr = new ArrayList<String>();
		Stack<String> stack = new Stack<String>();
		BufferedReader br;
		BufferedWriter bw;
		
		br = new BufferedReader(new FileReader(oldf));
		bw = new BufferedWriter(new FileWriter(newf));
		
		String source = "";
		while ( (source = br.readLine()) != null) {
			stack.push(source);
		}
		
		while(!(stack.isEmpty())) {
			bw.write(stack.pop()+"\n");
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
		String oldf = "files/oldf.txt"; //�����
		String newf = "files/newf.txt";
		c.reverseLine(oldf, newf);
		
	}

}
