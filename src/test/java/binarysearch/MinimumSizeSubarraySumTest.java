package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimumSizeSubarraySumTest {
	MinimumSizeSubarraySum problem;

	@Before
	public void setUp() throws Exception {
		problem = new MinimumSizeSubarraySum();
	}

	@Test
	public void test() {
		int[] nums = {2,3,1,2,4,3};
		int s = 7;
		Assert.assertEquals(2, problem.minSubArrayLen(s, nums));
	}
}
