package patterns.slidding_window;

public class MinSizeSubarraySum {

  public static int findMinSubArray(int[] arr, int s) {
    int minLength = Integer.MAX_VALUE;
    int sum = 0;
    int start = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      while (sum >= s) {
        minLength = Math.min(minLength, i - start + 1);  
        sum -= arr[start];
        start++;
      }
    }
    return minLength == Integer.MAX_VALUE ? 0 : minLength;
  }

}

