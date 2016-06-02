package binarysearch;

/**
 * Longest Increasing Subsequence
 * <p>
 * Given an unsorted array of integers, find the length of longest increasing
 * subsequence.
 * </p>
 * <p>
 * For example, Given [10, 9, 2, 5, 3, 7, 101, 18], The longest increasing
 * subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may
 * be more than one LIS combination, it is only necessary for you to return the
 * length.
 * </p>
 * <p>
 * Your algorithm should run in O(n2) complexity.
 * </p>
 * <p>
 * Follow up: Could you improve it to O(n log n) time complexity?
 * </p>
 * 
 * */
public class LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int[] solution = new int[nums.length];
		for (int i = 0; i < solution.length; i++) {
			solution[i] = 1;
		}
		int res = 1;
		for (int i = 1; i < nums.length; i++) {
			for (int k = 0; k < i; k++) {
				if (nums[i] > nums[k]) {
					solution[i] = Math.max(solution[i], 1 + solution[k]);
				}
			}
			res = Math.max(res, solution[i]);
		}
		return res;
	}

	public int lengthOfLISPrint(int[] nums) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int[] solution = new int[nums.length];
		int[] parent = new int[nums.length];
		for (int i = 0; i < solution.length; i++) {
			solution[i] = 1;
			parent[i] = -1;
		}
		int res = 1;
		int index = 1;
		for (int i = 1; i < nums.length; i++) {
			for (int k = 0; k < i; k++) {
				if (nums[i] > nums[k]) {
					if (solution[i] < 1 + solution[k]) {
						solution[i] = 1 + solution[k];
						parent[i] = k;
					}
				}
			}
			if (res < solution[i]) {
				res = solution[i];
				index = i;
			}
		}

		String str = "";
		while (index != -1) {
			str = nums[index] + "," + str;
			index = parent[index];
		}
		System.out.println(str);

		return res;
	}

	public int lengthOfLISBS(int[] nums) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int[] s = new int[nums.length];
		s[0] = nums[0];
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] >= s[index]) {
				s[++index] = nums[i];
			} else {
				s[find(s, nums[i], 0, index)] = nums[i];
			}
		}
		return index + 1;

	}

	private int find(int[] s, int x, int low, int high) {
		while (low < high) {
			int mid = low + ((high - low) / 2);
			if (x < s[mid]) {
				high = mid;
			} else if (x > s[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}

		}
		return high;
	}

}
