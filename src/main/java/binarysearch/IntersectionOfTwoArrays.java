package binarysearch;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		int n1length = nums1.length;
		int n2Length = nums2.length;
		int min = Math.min(n1length, n2Length);
		int[] nums = new int[min];
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0, j = 0, k = 0;
		while (i < n1length && j < n2Length) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				int matched = nums1[i];
				nums[k++] = matched;
				i++;
				j++;
				while (i < n1length && matched == nums1[i]) {
					i++;
				}
				while (j < n2Length && matched == nums2[j]) {
					j++;
				}

			}
		}
		int[] result = new int[k];
		for (i = 0; i < result.length; i++) {
			result[i] = nums[i];
		}

		return result;

	}
}
