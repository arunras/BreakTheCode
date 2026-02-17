/*==15. 3Sum==*/

class 3Sum { 
  /*-Input Vars-*/
  int[] nums;

  /*-Intermediate Vars-*/
  int n = nums.length;

  /*-Output Var-*/
  List<List<Integer>> resultList;

  public List<List<Integer>> threeSum(int[] nums) {
    // 1. Sort Array
    Arrays.sort(nums);

    for (int i = 0; i < n - 2; i++) {
      // 2. Edge Case
      if (nums[i] > 0) break;
      if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate

      // 3. Two Pointers
      int left = i + 1;
      int right = n - 1;

      while (left < right) {
        // 1. Process current elements
        int sum = nums[i] + nums[left] + nums[right];

        // 2. Update pointers based on condition
        if (sum == 0) {
          resultList.add(Arrays.asList(nums[i], nums[left], nums[right]);
          left++;
          right--;
          while (left < right && nums[left] == nums[left - 1]) left++; // Skip duplicate from left
          while (left < right && nums[right] == nums[right + 1]) right--; // Skip duplicate from right
        } else if (sum < 0){
          left++;
        } else {
          right--;
        }
      }
    }

    return resultList; 
  }

}
