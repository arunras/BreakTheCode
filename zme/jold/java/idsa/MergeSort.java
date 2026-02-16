package idsa;

import java.util.Arrays;

public class MergeSort {

  private void sort(int[] A) {
    mergeSort(A, 0, A.length - 1);
  }
 
  private void mergeSort(int[] A, int start, int end) {
    if (start < end) {
      int mid = (int) Math.floor((start+end)/2);
      mergeSort(A, start, mid);
      mergeSort(A, mid+1, end);
      merge(A, start, mid, end);
    }
  } 

  private void merge(int[] A, int start, int mid, int end) {
    int sizeOfLeft = mid-start+1;
    int sizeOfRight = end - mid;
    int[] leftA = new int[sizeOfLeft];
    int[] rightA = new int[sizeOfRight];

    for(int i = 0; i < sizeOfLeft; i++) {
      leftA[i] = A[start + i];
    }

    for(int j = 0; j < sizeOfRight; j++) {
      rightA[j] = A[mid + 1 + j];
    }

    int i = 0, j = 0;

    for (int k = start; k <= end; k++) {
      if ((j >= sizeOfRight) || (i < sizeOfLeft && leftA[i] <= rightA[j])) {
        A[k] = leftA[i];
        i++;
      } else {
        A[k] = rightA[j];
        j++;
      }
    }
  }

  public static void main(String[] args) {
    MergeSort sorter = new MergeSort();
    int[] A = {8, 5, 9, 2, 4, 6, 3, 7, 1};
    sorter.sort(A);
    System.out.println(Arrays.toString(A));
  }
}
