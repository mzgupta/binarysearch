package binarysearch;

public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
		int globalMinLen = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;
		int currentSum = 0;

		do {
			if (currentSum >= s) {
				if ((j - i + 1) < globalMinLen) {
					globalMinLen = j - i + 1;
				}
				currentSum -= nums[i++];
			} else {
				if (j < nums.length) {
					currentSum += nums[j++];
				} else {
					break;
				}
			}
		} while (i < j);

		return (globalMinLen == Integer.MAX_VALUE) ? 0 : globalMinLen - 1;
	}
}
