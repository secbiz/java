
public class LongestSequence {

	private static void lcs(int[] inputArray) {
		// TODO Auto-generated method stub
		
		int[] lcsLength = new int[inputArray.length];
		int[] lcsPrevious= new int[inputArray.length];
		
		for (int i = 0; i < inputArray.length; i++) {
			// for each position. get 

			int currentMax = 0;
			int maxIndex = -1;

			for (int j = 0; j < i; j++) {
				// find largest a and b so far
				
				if (inputArray[i] > inputArray[j]) {
					// extends lcs..save for later
					if (lcsLength[j] > currentMax) {
						currentMax = lcsLength[j];
						maxIndex = j;
					}
				}
			}
			// we now know which lcs inputArray[i] extends.
			// if it doesn't extend any then currentMax and maxIndex will be -1.
			
			if (currentMax == 0)
				lcsLength[i] = 1;
			else 
				lcsLength[i] = currentMax + 1;
			
			lcsPrevious[i] = maxIndex;	 
		}

		for (int i: inputArray)
			System.out.printf("%d ", i);
		
		System.out.println("");
		for (int i:lcsLength)
			System.out.printf("%d ", i);
		
		System.out.println("");
		for (int i:lcsPrevious)
			System.out.printf("%d ", i);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputArray = { 2, 4, 3, 5, 1, 7, 6, 9, 8 };
		lcs(inputArray);
	}

	
}
