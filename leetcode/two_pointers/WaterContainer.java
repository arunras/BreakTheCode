/*==42. Trapping Rain Water==*/

class WaterContainer {
  /*-Input Vars-*/
  int[] height;
  int n = height.length;

  /*-Intermediate Vars-*/
  int left = 0;
  int right = n - 1;

  /*-Output Var-*/
  int maxWater = 0;

  public int trap(int[] height) {
    while (left < right) {
      int leftH = height[left];
      int rightH = height[right];

      int window = right - left;
      int water = window * Math.min(leftH, rightH);

      maxWater = Math.max(maxWater, water);

      if (leftH < rightH) {
        left++;
      } else {
        right--;
      }
    }

    return maxWater;
  }

}
