/*==TWO POINTERS==*/

class TwoPointers {
  
  /*--SAME DIRECTION--*/
  public static void twoPointersSameDirection(int[] arr) {
    int n = arr.length;

    int slow = 0;
    int fast = 0;

    while (fast < n) {
      // 1. Process current elements
      int current = process(arr[slow], arr[fast]);

      // 2. Update pointers based on condition
      if (condition(arr[slow], arr[fast]) {
        slow++;
      }

      // 3. fast pointer always move forward
      fast++;
    }
  }

  /*--OPPOSITE DIRECTION--*/
  public static void twoPointersOppositeDirection(int[] arr) {
    int n = arr.length;

    int left = 0;
    int right = n - 1;

    while (left < right) {
      // 1. Process current elements
      int current = process(arr[left], arr[right]);

      // 2. Update pointers based on condition
      if (condition(arr[left], arr[right]) {
        left++;
      } else {
        right--;
      }
    }
  }

}
