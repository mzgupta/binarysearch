package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectionOfTwoArraysTest {
	IntersectionOfTwoArrays problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new IntersectionOfTwoArrays();
	}

	@Test
	public void testIntersection() {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		Assert.assertArrayEquals(new int[] { 2 },
				problem.intersection(nums1, nums2));
	}

	@Test
	public void testIntersection2() {
		int[] nums1 = { 1, 2 };
		int[] nums2 = { 2, 1 };
		Assert.assertArrayEquals(new int[] { 1, 2 },
				problem.intersection(nums1, nums2));
	}

}
