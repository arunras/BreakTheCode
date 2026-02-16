/*==42. Trapping Rain Water==*/

class RainWater {
  /*-Input Vars-*/
  int[] height;
  int n = height.length;

  /*-Intermediate Vars-*/
  int left = 0;
  int right = n - 1;
  int leftMax = 0;
  int rightMax = 0;

  /*-Output Var-*/
  int totalWater = 0;

  public int trap(int[] height) {
    while (left < right) {
      int leftH = height[left];
      int rightH = height[right];
      int currentWater = 0;

      if (leftH < rightH) {
        if (leftMax > leftH) {
          currentWater = leftMax - leftH;
        } else {
          leftMax = leftH;
        }
        left++;
      } else {
        if (rightMax > rightH) {
          currentWater = rightMax - rightH;
        } else {
          rightMax = rightH;
        }
        right--;
      }

      totalWater += currentWater;
    }
  }

}
