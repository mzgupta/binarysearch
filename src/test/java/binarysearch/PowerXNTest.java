package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerXNTest {

	PowerXN problem;

	@Before
	public void setUp() throws Exception {
		problem = new PowerXN();
	}

	@Test
	public void test() {
		Assert.assertEquals(4, problem.myPow(2, 2), 0.001);
		Assert.assertEquals(4, problem.myPow(0.00001, 2147483647), 0.001);
	}

}
