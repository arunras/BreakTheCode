package patterns.slidding_window;

public class AverageOfSubarraysOfSizeK {

    public static double[] findAverages(int[] arr, int k) {
      double[] result = new double[arr.length - k + 1];
      double sum = 0;
      int start = 0;
      for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
        if (i >= k - 1) {
          result[start] = sum / k;
          sum -= arr[start];
          start++; 
        }
      }
      return result;
    }

}

