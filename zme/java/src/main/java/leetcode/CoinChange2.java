//https://leetcode.com/problems/coin-change-2
package leetcode;

public class CoinChange2 {
	
	public static int change(int amount, int[] coins) {
		int rows = coins.length + 1, cols = amount + 1;
		int[][] dp = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			dp[i][0] = 1;
		}
		
		for (int c = 1; c < rows; c++) {
			int coinValue = coins[c - 1];
			for (int a = 1; a < cols; a++) {
				if (coinValue > a) {
					dp[c][a] = dp[c - 1][a];
				} else {
					dp[c][a] = dp[c][a - coinValue] + dp[c - 1][a];
				}
			}
		}
		return dp[rows - 1][cols - 1];
	}

}
