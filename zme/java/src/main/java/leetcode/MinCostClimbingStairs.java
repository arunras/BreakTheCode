//https://leetcode.com/problems/min-cost-climbing-stairs
package leetcode;

public class MinCostClimbingStairs {
	
	public static int find(int[] cost) {
		int size = cost.length;
		int[] dp = new int[size];
		dp[0] = cost[0];
		dp[1] = cost[1];
		for (int i = 2; i < size; i++) {
			dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
		}
		return Math.min(dp[size - 1], dp[size - 2]);
	}

}
