public class ex06 
{
	public static void main(String[] args) 
	{
		int[] array = { 3, 24, 1, 55, 17, 43, 5};
		int temp;

		System.out.println("[�迭�� ����]");
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
				if (array[j]<array[i]) // ũ�� �ٲٱ�
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("[Ŭ���� ������]");
		for (int i=0; i<array.length; i++)
		{
			if(i == array.length-1)
				System.out.println(array[i]);
			else 
				System.out.print(array[i]+", ");
		}
	}
}