/*==BINARY SEARCH==*/

class BinarySearch {
  /*-Input Vars-*/
  List<Integer> arr;

  public int binarySearch(List<Integer> arr, int target) {
    int n = arr.size();

    int left = 0;
    int right = n - 1;
    int firtTrueIndex = -1;

    while (left <= right) { // <= left & right could point to the same element
      int mid = left + (right - left) / 2; // Use '(right - left) / 2' to prevent integer overflow
      if (feasible(mid)) { //Found target
        firstTrueIndex = mid;
        right = mid - 1; // discard right half
      } else {
        left = mid + 1; // discard left half
      }
    }

    return firstTrueIndex;
  }

  private boolean feasible(int index) {
    return arr.get(mid) == 1;
  }

}
