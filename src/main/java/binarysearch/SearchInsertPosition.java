package binarysearch;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		while (l <= r) {
			int mid = l + ((r - l) >> 1);
			if (nums[mid] == target) {
				if (l != mid && nums[mid - 1] == target) {
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
		return l;
	}
}
