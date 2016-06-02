package binarysearch;

public class FindPeakElement {
	public int findPeakElement(int[] nums) {
		int l = 0;
		int r = nums.length - 1;

		while (l < r) {
			int mid = l + (r - l) / 2;
			int ln = (mid <= 0) ? Integer.MIN_VALUE : nums[mid - 1];
			int rn = (mid >= nums.length - 1) ? Integer.MIN_VALUE
					: nums[mid + 1];

			if (ln < nums[mid] && nums[mid] > rn) {
				return nums[mid];
			} else if (ln > nums[mid]) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		return nums[l];

	}
}
