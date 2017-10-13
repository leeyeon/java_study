public class Prob2 
{
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.println("�ϳ��� ���ڸ� �Է����ּ���.");
			System.exit(0);
		}
		int largest = 0;
		int smallest = 10000;
		int sum = 0;
		double average = 0.0;

		int[] array = new int[args.length];

		for(int i=0; i<args.length; i++) {
			// �Ľ� & �迭�� ����
			array[i] = Integer.parseInt(args[i]);

			// ��ȿ�� üũ
			if ((array[i] < 0) && (array[i] > 9999))
			{
				System.out.println("0 ~ 9999 ������ ������ �Է��ϼ���.");
				return;
			}
		}

		for(int i=0; i<args.length; i++) {
			System.out.print(array[i]+", ");
			
			// ��
			sum += array[i];
			
			// �ִ밪, �ּҰ�
			if(i == 0) {
				smallest = largest = array[0];
			} else {
				if(smallest > array[i])
					smallest = array[i];
				if(largest < array[i])
					largest = array[i];
			}
		}

		average = (double) sum / args.length;

		System.out.println("\n==============================");
		System.out.println("the largest value = "+largest);
		System.out.println("the smallest value = "+smallest);
		System.out.println("the total value = "+sum);
		System.out.println("and the average is = "+average);
	}
}