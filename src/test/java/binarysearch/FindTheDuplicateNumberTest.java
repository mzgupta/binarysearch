package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindTheDuplicateNumberTest {

	FindTheDuplicateNumber problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new FindTheDuplicateNumber();
	}

	@Test
	public void test1() {
		int[] nums = { 1, 2, 3, 3 };
		Assert.assertEquals(3, problem.findDuplicate(nums));

		nums = new int[] { 1, 1, 1, 1 };
		Assert.assertEquals(1, problem.findDuplicate(nums));

	}

	@Test
	public void test2() {
		int[] nums = { 1, 2, 3, 3 };
		Assert.assertEquals(3, problem.findDuplicateBS(nums));

		nums = new int[] { 1, 1, 1, 1 };
		Assert.assertEquals(1, problem.findDuplicateBS(nums));
	}

	@Test
	public void test3() {
		int[] nums = { 1, 2, 3, 3 };
		Assert.assertEquals(3, problem.findDuplicateLoop(nums));

		nums = new int[] { 1, 1, 1, 1 };
		Assert.assertEquals(1, problem.findDuplicateLoop(nums));

		nums = new int[] { 1, 1, 1, 1, 5, 6, 7, 8 };
		Assert.assertEquals(1, problem.findDuplicateLoop(nums));

	}

}
