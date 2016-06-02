package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestIncreasingSubsequenceTest {

	LongestIncreasingSubsequence problem;

	@Before
	public void setUp() throws Exception {
		problem = new LongestIncreasingSubsequence();
	}

	@Test
	public void test() {
		int[] nums = { -1000, -100, -90, -21 };
		Assert.assertEquals(4, problem.lengthOfLIS(nums));
		nums = new int[] { 10, 9, 2, 5, 3, 7, 101, 18 };
		Assert.assertEquals(4, problem.lengthOfLIS(nums));
		nums = new int[] { 1, 3, 6, 7, 9, 4, 10, 5, 6 };
		Assert.assertEquals(6, problem.lengthOfLIS(nums));

	}

	@Test
	public void test2() {
		int[] nums = { -1000, -100, -90, -21 };
		Assert.assertEquals(4, problem.lengthOfLISPrint(nums));
		nums = new int[] { 10, 9, 2, 5, 3, 7, 101, 18 };
		Assert.assertEquals(4, problem.lengthOfLISPrint(nums));
		nums = new int[] { 1, 3, 6, 7, 9, 4, 10, 5, 6 };
		Assert.assertEquals(6, problem.lengthOfLISPrint(nums));

	}

	@Test
	public void test3() {
		int[] nums = { -1000, -100, -90, -21 };
		Assert.assertEquals(4, problem.lengthOfLISBS(nums));
		nums = new int[] { 10, 9, 2, 5, 3, 7, 101, 18 };
		Assert.assertEquals(4, problem.lengthOfLISBS(nums));
		nums = new int[] { 1, 3, 6, 7, 9, 4, 10, 5, 6 };
		Assert.assertEquals(6, problem.lengthOfLISBS(nums));
		nums = new int[] { 3, 5, 6, 2, 5, 4, 19, 5, 6, 7, 12 };
		Assert.assertEquals(6, problem.lengthOfLISBS(nums));

	}

}
