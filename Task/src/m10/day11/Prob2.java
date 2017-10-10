package m10.day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Prob2 {
	
	private static int[] generateRandomNumber() {
		
		int[] array = new int[10];
		int compare =  new Random().nextInt()%10 + 10;
		
		for(int i=0; i<array.length; i++) {			
			for(int j=0; j<array.length; j++) {
				if(((i!=j) && (compare == array[j]))) {
					compare = new Random().nextInt()%10 + 10;
					j=0;
				}
			}
			
			if(compare == 0) i--;
			else array[i] = compare;
			
		}
		
		return array;
	}
	
	public static void printStatistics(int[] array) {
		
		int max = 0;
		int min = 20;
		double sum = 0;
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./store.txt"));
			
			for(int i=0; i<array.length; i++) {
				//System.out.println(array[i]);
				bw.write(array[i]+"\n");
				
				if(max <= array[i])
					max = array[i];
				if(min >= array[i])
					min = array[i];
				sum += array[i];
			}
			
//			System.out.println(max);
//			System.out.println(min);
//			System.out.println(sum/array.length);
			
			bw.write("�ִ밪 : "+max+"\n");
			bw.write("�ּҰ� : "+min+"\n");
			bw.write("��հ� : "+sum/array.length);
			
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = generateRandomNumber();
		printStatistics(array);

	}

}