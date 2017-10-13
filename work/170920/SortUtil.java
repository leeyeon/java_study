public class SortUtil 
{
	public int[] ascending(int[] inputNumbers) {
		int temp;
		for ( int i = 0; i < inputNumbers.length ; i++ ) {
			for (int j = 0; j < inputNumbers.length; j++) {
				if (inputNumbers[i] < inputNumbers[j])
				{
					temp = inputNumbers[j];
					inputNumbers[j] = inputNumbers[i];
					inputNumbers[i] = temp;
				}
			}
		}
		return inputNumbers;
	} // end of as ascending method

	public static void main(String[] args) 
	{
		SortUtil util = new SortUtil();
		int[] numbers = new int[] { 7, 5, 2, 19, 34, 51, 32, 11, 67, 21 };

		// 유효성 검사
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if( ( numbers[i] == numbers[j] ) && ( i != j ) ) {
					System.out.println("배열 안에 같은 수가 있습니다.");
					System.exit(0);
				}
			}
		} // end of for

		numbers = util.ascending(numbers);

		for ( int i = 0; i < numbers.length; i++ ) {
			System.out.print(numbers[i]);

			if (i != numbers.length-1) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		} // end of for

		System.out.println("Successful!!!");

	} // end of main
}
