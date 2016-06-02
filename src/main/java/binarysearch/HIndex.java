package binarysearch;

import java.util.Arrays;

public class HIndex {
	public int hIndex(int[] citations) {
		int max = 0;
		int n = citations.length;
		for (int h = 1; h <= n; h++) {
			int atleast = 0;
			int atMost = 0;
			for (int i = 0; i < n; i++) {
				if (citations[i] >= h) {
					atleast++;
				}
				if (citations[i] <= h) {
					atMost++;
				}
			}
			if (atleast >= h && atMost >= (n - h)) {
				if (h > max) {
					max = h;
				}
			}

		}
		return max;
	}

	public int hIndex2(int[] citations) {
		int n = citations.length;
		Arrays.sort(citations);
		for (int i = 0; i < citations.length; i++) {
			int h = citations[i];
			if (h >= (n - i)) {
				return h;
			}
		}
		return 0;
	}

}
