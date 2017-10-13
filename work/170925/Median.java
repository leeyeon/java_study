import java.util.Arrays;

public class Median 
{
	static int findMedian(int[] values) {
		
		int sum = 0;
		int avg = 0;
		int temp = 0;
		int median = 0;
		int compare = 0;

		//�հ�
		for (int i=0; i<values.length; i++ ) {
			sum += values[i];
		}
		//��հ�
		avg = sum/values.length;

		//temp �ʱ�ȭ
		temp = Math.abs(avg-values[0]);

		for (int i=0; i<values.length; i++) {
			//compare ���̰� ����
			if(values[i] == avg) {
				return values[i];
			} else {
				compare = Math.abs(values[i] - avg);
			}

			//temp�� ���̰��� ũ�� values[i]�� �߰�����¡
			if(temp > compare) {
				temp = compare;
				median = values[i];
			} else if(temp == compare) { //����������
				median = values[i];
			}
		}
		
		return median;
		
	}

	public static void main(String[] args) 
	{
		Median median = new Median();

		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : "+Arrays.toString(values1));
		System.out.println("median : "+median.findMedian(values1));

		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : "+Arrays.toString(values2));
		System.out.println("median : "+median.findMedian(values2));


	}
}