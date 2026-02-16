// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
package leetcode.dp;

public class BuySellStock2 {
  
  public static int maxProfit(int[] prices) {
    int profit = 0;
    for (int i = 2; i < prices.length; i++) {
      if (prices[i] > prices[i - 1]) {
        profit += prices[i] - prices[i - 1];
      }
    }
    return profit;
  }

}
