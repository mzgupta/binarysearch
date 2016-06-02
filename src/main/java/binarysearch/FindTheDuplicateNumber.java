package binarysearch;

/**
 * <p>
 * Given an array nums containing n + 1 integers where each integer is between 1
 * and n (inclusive), prove that at least one duplicate number must exist.
 * Assume that there is only one duplicate number, find the duplicate one.
 * </p>
 * Note:
 * <ul>
 * <li>You must not modify the array (assume the array is read only).</li>
 * <li>You must use only constant, O(1) extra space.</li>
 * <li>Your runtime complexity should be less than O(n2).</li>
 * <li>There is only one duplicate number in the array, but it could be repeated
 * more than once.</li>
 * </ul>
 * */
public class FindTheDuplicateNumber {
	/**
	 * Using Bit Manipulation
	 * */
	public int findDuplicate(int[] nums) {
		int n = nums.length - 1;
		int res = 0;
		for (int i = 0; i < 32; i++) {
			int mask = 1 << i;
			int dc = 0;
			int ndc = 0;
			for (int j = 0; j <= n; j++) {
				if ((nums[j] & mask) > 0) {
					dc++;
				}
				if (j > 0 && ((j & mask) > 0)) {
					ndc++;
				}
			}
			if (dc > ndc) {
				res += mask;
			}

		}
		return res;
	}

	/**
	 * Using Binary Search but only one duplicate allowed
	 * */
	public int findDuplicateBS(int[] nums) {
		int low = 1;
		int high = nums.length - 1;

		while (low < high) {
			int mid = low + (high - low) / 2;
			int count = 0;
			for (int a : nums) {
				if (a <= mid) {
					count++;
				}
			}
			if (count <= mid) {
				low = mid + 1;
			} else {
				high = mid;
			}

		}
		return low;
	}

	/**
	 * Using Loop detection
	 * */
	public int findDuplicateLoop(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];

		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
			fast = nums[fast];
		}

		int finder = nums[0];
		while (finder != nums[slow]) {
			finder = nums[finder];
			slow = nums[slow];
		}
		return finder;
	}

}
