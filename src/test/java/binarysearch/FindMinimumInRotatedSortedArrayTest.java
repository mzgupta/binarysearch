package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMinimumInRotatedSortedArrayTest {
	FindMinimumInRotatedSortedArray problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new FindMinimumInRotatedSortedArray();
	}

	@Test
	public void test() {
		int[] x = { 4, 5, 6, 7, 0, 1, 2 };
		Assert.assertEquals(0, problem.findMin(x));
		x = new int[] { 1 };
		Assert.assertEquals(1, problem.findMin(x));
		x = new int[] { 2, 1 };
		Assert.assertEquals(1, problem.findMin(x));
		x = new int[] { 2, 1, 1 };
		Assert.assertEquals(1, problem.findMin(x));
		x = new int[] { 3, 1, 3 };
		Assert.assertEquals(1, problem.findMin(x));
		x = new int[] { 3, 3, 3, 1, 1, 2, 2, 3 };
		Assert.assertEquals(1, problem.findMin(x));
		x = new int[] { 3, 3, 1, 3 };
		Assert.assertEquals(1, problem.findMin(x));

	}

}
