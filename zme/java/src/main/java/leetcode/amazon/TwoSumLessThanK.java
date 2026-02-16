// https://leetcode.com/problems/two-sum-less-than-k/
package leetcode.amazon;

import java.util.Arrays;

public class TwoSumLessThanK {

  public static int find(int[] A, int k) {
    Arrays.sort(A);
    int start = 0, end = A.length - 1;
    int ans = -1;
    
    while (start < end) {
      int sum = A[start] + A[end];
      if (sum < k) {
        ans = Math.max(ans, sum);
        start++;
      } else {
        end--;
      }
    }
    return ans;
  }

}
