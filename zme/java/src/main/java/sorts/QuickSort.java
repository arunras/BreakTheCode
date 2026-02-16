package sorts;

public class QuickSort {

    private static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }

    private static int partition(int[] arr, int p, int r) {
      int pivot = arr[r];
      int i = p - 1;

      for (int j = p; j < r; j++) {
        if (arr[j] <= pivot) {
          i++;
          swap(arr, j, i);
        }
      }
      swap(arr, i + 1, r);
      return i + 1;
    }

    public static int[] sort(int[] arr, int p, int r) {
      if (p < r) {
        int pi = partition(arr, p, r);

        sort(arr, p, pi-1);
        sort(arr, pi+1, r);
      }
      return arr;
    }

}
