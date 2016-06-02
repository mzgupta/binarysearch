package binarysearch;

public class DungeonGame {
	public int calculateMinimumHP(int[][] dungeon) {
		int m = dungeon.length - 1;
		int n = dungeon[0].length - 1;
		int[][] dp = new int[m + 1][n + 1];

		dp[m][n] = Math.max(1, 1 - dungeon[m][n]);

		for (int i = m - 1; i >= 0; i--) {
			dp[i][n] = Math.max(1, dp[i + 1][n] - dungeon[i][n]);
		}
		for (int j = n - 1; j >= 0; j--) {
			dp[m][j] = Math.max(1, dp[m][j + 1] - dungeon[m][j]);
		}

		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				dp[i][j] = Math.max(1, Math.min((dp[i][j + 1] - dungeon[i][j]),
						(dp[i + 1][j] - dungeon[i][j])));
			}
		}
		printMatrix(dp);
		return dp[0][0];

	}

	private void printMatrix(int[][] dungeon2) {
		for (int i = 0; i < dungeon2.length; i++) {
			for (int j = 0; j < dungeon2[0].length; j++) {
				System.out.print(dungeon2[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
