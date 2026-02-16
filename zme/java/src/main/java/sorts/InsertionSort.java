package sorts;

public class InsertionSort {

  // Approach2: Insert into Subarray => O(n2)
  public static int[] sort(int[] data) {
    for (int i = 1; i < data.length; i++) {
      int key = data[i];
      int j = i - 1;
      while(j >= 0 && data[j] > key) {
        data[j+1] = data[j];
        j--;
      }
      data[j+1] = key;
    }
    return data; 
  }
  
}
