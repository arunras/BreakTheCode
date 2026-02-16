package sorts;

public class MergeSort {

  // MERGE: two subarrays of arr[]
  // 1st: subarray of arr[p..q]
  // 2nd: subarray of arr[q+1..r]
  public static void merge(int[] arr, int p, int q, int r) {

    // Find sizes of 2 subarrays to be merged
    int n1 = q - p + 1;
    int n2 = r - q;

    // Create 2 subarrays
    int[] L = new int[n1];
    int[] R = new int[n2];

    // DIVIDE: Copy data to each 2 subarrays
    for (int i = 0; i < n1; i++)
      L[i] = arr[p + i];
    for (int j = 0; j < n2; j++)
      R[j] = arr[q + 1 + j]; 

    /* CONQUER: Merge the 2 subarrays */
    int i = 0, j = 0; // Initial indexes of 1st & 2nd subarrays
    int k = p; // Initial index of merged array;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        //arr[k] = L[i]; i++;
        arr[k] = L[i++];
      } else {
        //arr[k] = R[j]; j++;
        arr[k] = R[j++];
      }
      k++;
    }

    while (i < n1) {// Copy remaining elements of L[] if any. 
      //arr[k] = L[i]; i++; k++;
      arr[k++] = L[i++];
    }
    while (j < n2) {// Copy remaining elements of R[] if any. 
      //arr[k] = R[j]; j++; k++;
      arr[k++] = R[j++];
    }
    
  }  


  //Main function that sorts arr[p..r] using merge
  public static void sort(int[] arr, int p, int r) {
    if (p < r) {
      int m = (p + r) / 2; // Find the middle point

      //SORT : 1st & 2nd halves
      sort(arr, p, m);
      sort(arr, m + 1, r);

      //MERGE: the sorted halves
      merge(arr, p, m, r);
    }
  }

}
































