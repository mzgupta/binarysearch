package binarysearch;

public class Search2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}

		int row = matrix.length;
		int col = matrix[0].length;

		int l = 0;
		int h = row * col - 1;

		while (l <= h) {
			int mid = (l + h) / 2;

			int x = mid / col;
			int y = mid % col;

			if (matrix[x][y] == target) {
				return true;
			} else if (target < matrix[x][y]) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return false;
	}

	public boolean searchMatrix2(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}
		int start = 0, rows = matrix.length, cols = matrix[0].length;
		int end = rows * cols - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (matrix[mid / cols][mid % cols] == target) {
				return true;
			}
			if (matrix[mid / cols][mid % cols] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}
}
