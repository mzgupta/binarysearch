package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SqrtTest {

	Sqrt problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new Sqrt();
	}

	@Test
	public void test() {
		Assert.assertEquals(1, problem.mySqrt(1));
		Assert.assertEquals(2, problem.mySqrt(4));
		Assert.assertEquals(3, problem.mySqrt(10));
		Assert.assertEquals(3, problem.mySqrt(2147483647));
	}

}
