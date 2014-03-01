package secbiz;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Problem6Test extends TestCase {

	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testProblem6() {
		Problem6 problem10 = new Problem6(10);
		Problem6 problem100 = new Problem6(100);
		
		Assert.assertEquals(2640, problem10.GetResult());
		Assert.assertEquals(Problem6.GetSquaresofSum(100) - Problem6.GetSumofSquares(100), problem100.GetResult());

	}

}
