package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectionOfTwoArrays2Test {

	IntersectionOfTwoArrays2 problem;

	@Before
	public void setUp() throws Exception {
		problem = new IntersectionOfTwoArrays2();
	}


	@Test
	public void testIntersection() {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		Assert.assertArrayEquals(new int[] { 2, 2 },
				problem.intersect(nums1, nums2));
	}

}
