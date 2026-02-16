package arrays;

public class MissingNumberInArray {

  public static int findMissingNumber(int[] arr) {
    int n = arr.length + 1;
    int total = n*(n+1)/2;
    int missing = 0;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    missing = total - sum;
    return missing;
  }

}
