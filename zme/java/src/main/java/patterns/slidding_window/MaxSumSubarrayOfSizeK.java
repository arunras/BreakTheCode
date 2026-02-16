package patterns.slidding_window;

public class MaxSumSubarrayOfSizeK {

    public static int findMaxSumSubarray(int[] arr, int k) {
      int max = 0;
      int sum = 0;
      int start = 0;

      for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
        if (i >= k - 1) {
          max = Math.max(max, sum);
          sum -= arr[start];
          start++; 
        }
      }
      return max;
    }

}
