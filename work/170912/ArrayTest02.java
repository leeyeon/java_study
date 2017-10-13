public class ArrayTest02 
{
	public static void main(String[] args) 
	{
		int[][] value = new int[9][9];

		for( int i=0; i<9; i++ ) {
			value[0][i] = 1*(i+1);
		}

		for (int j=0; j<value.length; j++)
		{
			for (int k=0; k<value[j].length; k++)
			{
				System.out.println("value["+j+"]["+k+"] = "+value[j][k]);
			}
		}
	}
}
