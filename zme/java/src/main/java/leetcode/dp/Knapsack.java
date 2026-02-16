package leetcode.dp;

public class Knapsack {

	public static int find(int[][] items, int maxWeight) {
		int rows = items.length + 1, cols = maxWeight + 1;
		int[][] dp = new int[rows][cols];
		
		for (int i = 1; i < rows; i++) {
			int weight = items[i - 1][0];
			int value = items[i - 1][1];
			for (int j = 1; j < cols; j++) {
				if (weight > j) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(value + dp[i - 1][j - weight], dp[i - 1][j]);
				}
			}
		}
		return dp[rows - 1][cols - 1];
	}
}
