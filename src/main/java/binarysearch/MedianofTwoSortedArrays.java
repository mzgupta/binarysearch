package binarysearch;

/**
 * <p>
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity
 * should be O(log (m+n)).
 * 
 * </p>
 * */

public class MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int[] a, int[] b) {
		int aLength = a.length;
		int bLength = b.length;
		int total = aLength + bLength;
		int k = total / 2;
		if (total % 2 == 0) {
			return (findKthElementSortedArrays(a, b, k) + findKthElementSortedArrays(
					a, b, k + 1)) * 0.5;
		} else {
			k = (total + 1) / 2;
			return findKthElementSortedArrays(a, b, k);
		}

	}

	public int findKthElementSortedArrays(int[] a, int[] b, int k) {
		return findKthElementSortedArrays(a, b, k, 0, a.length - 1, 0,
				b.length - 1);
	}

	private int findKthElementSortedArrays(int[] a, int[] b, int k, int aStart,
			int aEnd, int bStart, int bEnd) {
		int aLen = aEnd - aStart + 1;
		int bLen = bEnd - bStart + 1;

		if (aLen == 0 && bLen >= k) {
			return b[bStart + k - 1];
		} else if (bLen == 0 && aLen >= k) {
			return b[bStart + k - 1];
		} else if ((aLen + bLen) >= k) {
			if (k == 1) {
				return Math.min(a[aStart], b[bStart]);
			}

			int i = Math.min(k / 2, aLen);
			int j = Math.min(k / 2, bLen);

			if (a[i + aStart - 1] > b[j + bStart - 1]) {
				return findKthElementSortedArrays(a, b, k - j, aStart, aEnd,
						bStart + j, bEnd);

			} else {
				return findKthElementSortedArrays(a, b, k - i, aStart + i,
						aEnd, bStart, bEnd);

			}

		} else {
			return -1;

		}

	}
}
