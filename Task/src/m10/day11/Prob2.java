package m10.day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Prob2 {
	
	private static int[] generateRandomNumber() {
		
		int[] array = new int[10];
		int compare =  new Random().nextInt()%10 + 10;
		
		for(int i=0; i<array.length; i++) {			
			for(int j=0; j<array.length; j++) {
				if(((i!=j) && (compare == array[j]))) {
					compare = new Random().nextInt(20) + 1;
					j=0;
				}
			}
			
			if(i==21) i--;
			else array[i] = compare;
			
		}
		
		return array;
	}
	
	public static void printStatistics(int[] array) {
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("./store.txt"));
			int max = array[0];
			int min = array[0];
			double sum = 0;
			
			for(int i=0; i<array.length; i++) {
				bw.write(array[i]+"\n");
				
				if (i != 0) {
					Math.max(max, array[i]);
					Math.min(min, array[i]);
				}
				
				sum += array[i];
			}
			
			bw.write("최대값 : "+max+"\n");
			bw.write("최소값 : "+min+"\n");
			bw.write("평균값 : "+sum/array.length);
			
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = generateRandomNumber();
		printStatistics(array);

	}

}
