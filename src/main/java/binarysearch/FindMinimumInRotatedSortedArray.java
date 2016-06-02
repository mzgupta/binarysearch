package binarysearch;

public class FindMinimumInRotatedSortedArray {
	public int findMin(int[] nums) {
		int l = 0;
		int r = nums.length - 1;
		while (l < r) {

			int mid = l + (r - l) / 2;

			if (nums[mid] > nums[r]) {
				l = mid + 1;
			} else if (nums[mid] < nums[r]) {
				r = mid;
			} else {
				if (nums[l] == nums[mid]) {
					l++;
					r--;
				} else {
					r = mid;
				}
			}

		}
		return nums[l];
	}

	public int findMin1(int[] nums) {
		int l = 0;
		int r = nums.length - 1;
		while (nums[l] > nums[r]) {

			int mid = l + (r - l) / 2;

			if (nums[mid] > nums[r]) {
				l = mid + 1;
			} else {
				r = mid;
			}

		}
		return nums[l];
	}
}
