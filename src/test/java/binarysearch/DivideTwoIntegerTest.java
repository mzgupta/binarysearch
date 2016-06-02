package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivideTwoIntegerTest {
	DivideTwoIntegers problem;

	@Before
	public void setUp() throws Exception {
		problem = new DivideTwoIntegers();
	}

	@Test
	public void test() {

		Assert.assertEquals(16 / 4, problem.divide(16, 4));
		Assert.assertEquals(16 / 4, problem.divide(-16, -4));
		Assert.assertEquals(1990 / 4, problem.divide(1990, 4));
		Assert.assertEquals(-16 / 4, problem.divide(-16, 4));
		Assert.assertEquals(-16 / 4, problem.divide(16, -4));
		

	}

}
