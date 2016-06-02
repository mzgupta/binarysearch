package binarysearch;

import java.util.Arrays;

public class IntersectionOfTwoArrays2 {
	public int[] intersect(int[] nums1, int[] nums2) {
		int[] nums = new int[Math.min(nums1.length, nums2.length)];
		int i = 0, j = 0, k = 0;
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				nums[k++] = nums1[i];
				i++;
				j++;
			}
		}
		int[] result = new int[k];
		for (i = 0; i < result.length; i++) {
			result[i] = nums[i];
		}

		return result;

	}

}
