package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchForARangeTest {

	SearchForARange problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new SearchForARange();
	}

	@Test
	public void test() {
		int[] nums = { 1, 1, 2, 3 };

		Assert.assertArrayEquals(new int[] { 2, 2 }, problem.searchRange(nums, 2));

		Assert.assertArrayEquals(new int[] { -1, -1 },
				problem.searchRange(nums, 9));

		nums = new int[] { 5, 7, 7, 8, 8, 10 };
		Assert.assertArrayEquals(new int[] { 3, 4 },
				problem.searchRange(nums, 8));

		nums = new int[] { 1, 1, 1, 1, 1, 1 };
		Assert.assertArrayEquals(new int[] { 0, 5 },
				problem.searchRange(nums, 1));

	}

	@Test
	public void testSearchLeft() {
		int[] nums = { -10, 0, 1, 1, 2, 3 };

		Assert.assertEquals(0, problem.searchLeft(nums, -10));
		Assert.assertEquals(1, problem.searchLeft(nums, 0));
		Assert.assertEquals(-1, problem.searchLeft(nums, 1000));

		nums = new int[] { 5, 7, 7, 8, 8, 10 };
		Assert.assertEquals(3, problem.searchLeft(nums, 8));

	}

	@Test
	public void testSearchRight() {
		int[] nums = { -10, 0, 1, 1, 2, 3 };

		Assert.assertEquals(0, problem.searchRight(nums, -10));
		Assert.assertEquals(1, problem.searchRight(nums, 0));
		Assert.assertEquals(3, problem.searchRight(nums, 1));
		Assert.assertEquals(-1, problem.searchRight(nums, 1000));

	}

	@Test
	public void testBinarySearch() {
		int[] nums = { -10, 0, 1, 1, 1, 1, 2, 3 };

		Assert.assertEquals(0, problem.binarySearch(nums, -10));
		Assert.assertEquals(1, problem.binarySearch(nums, 0));
		Assert.assertEquals(3, problem.binarySearch(nums, 1));
		Assert.assertEquals(-1, problem.binarySearch(nums, 1000));

	}

}
