package idsa;

import java.util.Arrays;

public class InsertionSort {

  public static int[] insertionSort(int[] A) {
    int j;
    for (int i = 0; i < A.length; i++) {
      j = i - 1;
      while (j >= 0 && A[j] > A[j+1]) {
        swap(A, j, j+1);
        j = j - 1;
      } 
    }
    return A;
  }

  public static void swap (int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public static void main (String[] args) {
    int[] A = {8, 5, 9, 2, 4, 6, 3, 7, 1};
    System.out.println("Array: " + Arrays.toString(A));
    System.out.println("Result:" + Arrays.toString(insertionSort(A)));  
  }
}
