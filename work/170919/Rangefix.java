public class Rangefix 
{
	public static void main(String[] args) 
	{
		int[] array = { 3, 24, 1, 55, 17, 43, 5};
		int temp;

		System.out.println("[배열의 내용]");
		for (int i=0; i<array.length; i++)
		{
			if(i == array.length-1)
				System.out.println(array[i]);
			else 
				System.out.print(array[i]+", ");
		}

		for (int i=0; i<array.length; i++)
		{
			for (int j=i; j<array.length; j++)
			{
				if (array[j]<array[i]) // 크면 바꾸긔
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("[클래스 실행결과]");
		for (int i=0; i<array.length; i++)
		{
			if(i == array.length-1)
				System.out.println(array[i]);
			else 
				System.out.print(array[i]+", ");
		}
	}

	// 합병 정렬
	//public void merge

	
	//public void 
}
