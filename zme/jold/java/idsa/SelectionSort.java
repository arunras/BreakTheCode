package idsa;

import java.util.Arrays;

public class SelectionSort {

  public static int[] selectionSort(int[] A) {
    int temp, minIndex = 0;
    for (int i = 0; i < A.length-1; i++) {
      minIndex = i;
      for (int j = i+1; j < A.length; j++) {
        if (A[minIndex] > A[j]) {
          minIndex = j;
        }  
      }
      temp = A[minIndex];
      A[minIndex] = A[i];
      A[i] = temp;
    }
    return A;
  }


  public static void main (String[] args) {
    int[] A = {8, 5, 9, 2, 4, 6, 3, 7, 1};
    System.out.println("Array: " + Arrays.toString(A));
    System.out.println("Result:" + Arrays.toString(selectionSort(A)));  
  }
}
