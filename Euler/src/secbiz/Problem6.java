package secbiz;

/*
 * The sum of the squares of the first ten natural numbers is,
					12 + 22 + ... + 102 = 385
    The square of the sum of the first ten natural numbers is,
					(1 + 2 + ... + 10)2 = 552 = 3025
	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
  */

public class Problem6 {

	private int Num;
	private int squaresumed;
	private int sumsquared;
	
	/**
	 * @param num
	 */
	public Problem6(int num) {
		super();
		Num = num;
		squaresumed = GetSquaresofSum(Num);
		sumsquared = GetSumofSquares(Num);
	}


	protected static int GetSquaresofSum(int Number) {
		// TODO Auto-generated method stub
		
		int sum = (Number * (Number +1)) / 2;
		return sum*sum;
		
	}


	protected static int GetSumofSquares(int Number) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for (int i = 1; i <= Number; i++) {
			
			sum += (i*i);
		}
		
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem6 answer = new Problem6(100);
		System.out.println(answer.GetResult());
		System.out.println(GetSumofSquares(100));
		System.out.println(GetSquaresofSum(100));
		
	}

	public int GetResult() {
		// TODO Auto-generated method stub
		return squaresumed - sumsquared;
	}
}
