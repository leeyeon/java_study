public class Util 
{
	//limit������ �Ҽ� ���� return
	public int findPrimeCount(int limit) {

		boolean isPrime = true;
		int count = 0;

		for ( int i = 2; i <= limit; i++) {
			isPrime = true;
			for ( int j = 2; j <= i; j++ ) {
				if ( ( i != j ) && ( i%j == 0 )) {
					isPrime = false;
					break;
				}
			}

			//�Ҽ��� count ++
			if(isPrime) count ++;

		} // end of for

		return count;
	}

	//limit������ �Ҽ��� �迭�� ��� return
	public int[] findPrimeReturnArray(int limit) {

		int countPrime = findPrimeCount(limit);
		int[] prime = new int[countPrime];
		boolean isPrime = true;
		int indexCount = 0;

		// prime ��ŭ �ֱ�
		for ( int i = 2; i <= limit; i++) {
			isPrime = true;
			for ( int j = 2; j <= i; j++ ) {
				if ( ( i != j ) && ( i%j == 0 )) {
					isPrime = false;
					break;
				}
			}

			//�Ҽ��� �迭�� �ֱ�
			if(isPrime) {
				prime[indexCount] = i;
				indexCount++;
			}			

		} // end of for

		return prime;
	}

}