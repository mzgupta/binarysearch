package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HIndexTest {
	HIndex problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new HIndex();
	}

	@Test
	public void test() {
		int[] citations = { 3, 0, 6, 1, 5 };
		Assert.assertEquals(3, problem.hIndex(citations));

		citations = new int[] { 1, 2, 5, 6, 100, 45, 98, 13, 23 };
		Assert.assertEquals(6, problem.hIndex(citations));

		citations = new int[] { 3, 0, 6, 1, 5 };
		Assert.assertEquals(3, problem.hIndex2(citations));

		citations = new int[] { 1, 2, 5, 6, 100, 45, 98, 13, 23 };
		Assert.assertEquals(6, problem.hIndex2(citations));

	}
}
