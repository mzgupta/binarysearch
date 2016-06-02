package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchInRotatedSortedArrayTest {
	SearchInRotatedSortedArray problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new SearchInRotatedSortedArray();
	}

	@Test
	public void test() {
		int[] nums = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
		Assert.assertEquals(7, problem.search(nums, 3));
		Assert.assertEquals(1, problem.search(nums, 6));

		nums = new int[] { 1 };
		Assert.assertEquals(-1, problem.search(nums, 0));
		Assert.assertEquals(0, problem.search(nums, 1));

		nums = new int[] {1,3,1,1,1};
		Assert.assertEquals(1, problem.search(nums, 3));

	}

}
