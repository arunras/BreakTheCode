package idsa;

import java.util.Arrays;

public class BubbleSort {

  public static int[] sortBubble(int[] A) {
    for (int i = 0; i < A.length-1; i++) {
      for (int j = 0; j < A.length-1-i; j++) {
        if (A[j] > A[j+1]) {
          swap(A, j, j+1);
        }
      } 
    }
    return A;
  }

  public static int[] bubbleSort(int[] A) {
    boolean isSorted = false;  
    int lastUnsorted = A.length - 1;
    while(!isSorted) {
      isSorted = true;
      for (int i = 0; i < lastUnsorted; i++) {
        if (A[i] > A[i+1]) {
          swap(A, i, i+1);
          isSorted = false;
        }
      }
      lastUnsorted--;
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
    System.out.println("Result:" + Arrays.toString(bubbleSort(A)));  
  }

}
