package sorts;

public class SelectionSort {

  //Approach1: Brute Force -> O(n2)
  public static int[] sort(int[] data) {
    int n = data.length;
    for (int i=0; i<n-1; i++) {
      int min = data[i];
      for (int j=i+1; j<n; j++) {
        if (min > data[j]) {
          int temp = data[j];
          data[j] = min;
          min = temp;
        }
      }
      data[i] = min;
    }
    return data;
  }

}
