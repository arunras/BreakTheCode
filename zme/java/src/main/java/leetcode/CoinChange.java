//https://leetcode.com/problems/coin-change/
package leetcode;

import java.util.Arrays;

public class CoinChange {
	
	public static int change(int[] coins, int amount) {
		int[] d = new int[amount + 1];
		Arrays.fill(d, amount + 1);
		d[0] = 0;
		for (int i = 1; i <= amount; i++) {
			for (int c = 0; c < coins.length; c++) {
				int coinValue = coins[c];
				if (coinValue <= i) {
					d[i] = Math.min(d[i], d[i - coinValue] + 1);
				}
			}
		}
		return d[amount] <= amount	? d[amount] : -1;
	}

}
