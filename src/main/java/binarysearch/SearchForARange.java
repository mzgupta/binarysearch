package binarysearch;

public class SearchForARange {
	public int[] searchRange(int[] nums, int target) {
		int[] range = { -1, -1 };
		range[0] = searchLeft(nums, target);
		if (range[0] >= 0) {
			range[1] = searchRight(nums, target);
		}
		return range;

	}

	public int searchRight(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;

		while (l <= r) {
			int mid = l + ((r - l) >> 1);
			if (nums[mid] == target) {
				if (mid != r && nums[mid + 1] == target) {
					l = mid + 1;
				} else {
					return mid;
				}
			} else if (target < nums[mid]) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

	public int searchLeft(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;

		while (l <= r) {
			int mid = l + ((r - l) >> 1);
			if (nums[mid] == target) {
				if (mid != l && nums[mid - 1] == target) {
					r = mid - 1;
				} else {
					return mid;
				}
			} else if (target < nums[mid]) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

	public int binarySearch(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;

		while (l <= r) {
			int mid = l + ((r - l) >> 1);
			if (nums[mid] == target) {
				return mid;
			} else if (target < nums[mid]) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}
}
