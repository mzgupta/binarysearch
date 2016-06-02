package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchInsertPositionTest {
	SearchInsertPosition problem;

	@Before
	public void setUp() throws Exception {
		problem = new SearchInsertPosition();
	}

	@Test
	public void test() {
		int[] nums = { 1, 3, 5, 6 };
		Assert.assertEquals(2, problem.searchInsert(nums, 5));
		Assert.assertEquals(1, problem.searchInsert(nums, 2));
		Assert.assertEquals(4, problem.searchInsert(nums, 7));
		Assert.assertEquals(0, problem.searchInsert(nums, 0));

		nums = new int[] { 1, 1, 1, 1 };
		Assert.assertEquals(0, problem.searchInsert(nums, 1));

		nums = new int[] { 1, 3, 5 };
		Assert.assertEquals(1, problem.searchInsert(nums, 3));

	}

}
