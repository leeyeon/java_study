public class Util 
{
	//limit까지의 소수 개수 return
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

			//소수면 count ++
			if(isPrime) count ++;

		} // end of for

		return count;
	}

	//limit까지의 소수를 배열에 담아 return
	public int[] findPrimeReturnArray(int limit) {

		int countPrime = findPrimeCount(limit);
		int[] prime = new int[countPrime];
		boolean isPrime = true;
		int indexCount = 0;

		// prime 만큼 넣깅
		for ( int i = 2; i <= limit; i++) {
			isPrime = true;
			for ( int j = 2; j <= i; j++ ) {
				if ( ( i != j ) && ( i%j == 0 )) {
					isPrime = false;
					break;
				}
			}

			//소수면 배열에 넣기
			if(isPrime) {
				prime[indexCount] = i;
				indexCount++;
			}			

		} // end of for

		return prime;
	}

}
