package arrays;


public class AverageOfSubarraysOfSizeK {

  // Brute Force => O(N*K)
  public static double[] compute(int[] a, int k) {
    double[] aa = new double[a.length - k + 1];
    for (int i = 0; i <= a.length - k; i++) {
      double sum = 0;
      for (int j = i; j < i + k; j++) {
        sum += a[j];  
      }
      aa[i] = sum / k;
    }
    return aa;
  }

  //Sliding Window => O(N)
  public static double[] sliddingWindow(int[] a, int k) {
    double[] result = new double[a.length - k + 1];
    double sum = 0;
    int start = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];  
      if (i >= k - 1) {
        result[start] = sum / k;
        sum = sum - a[start];
        start++;
      }
    }
    return result;
  }

}
