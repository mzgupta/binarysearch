package binarysearch;

public class FirstBadVersion {
	private int badVersion = 0;

	public int firstBadVersion(int n) {
		int low = 1;
		int high = n;
		while (low < high) {
			int mid = low + ((high - low) >> 2);
			if (isBadVersion(mid)) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	public boolean isBadVersion(int version) {
		return badVersion <= version;
	}

	public void setBadVersion(int badVersion) {
		this.badVersion = badVersion;
	}
}
