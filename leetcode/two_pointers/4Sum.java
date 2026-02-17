/*==18. 4Sum==*/

class 4Sum { 
  /*-Input Vars-*/
  int[] nums;

  /*-Intermediate Vars-*/
  int n = nums.length;

  /*-Output Var-*/
  List<List<Integer>> resultList;

  public List<List<Integer>> fourSum(int[] nums, int target) {
    // 1. Sort Array
    Arrays.sort(nums);

    for (int i = 0; i < n - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate
      for (int j = i + 1; j < n - 2; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1]) continue; // Skip duplicate
        // 2. Two Pointers
        int left = j + 1;
        int right = n - 1;
        while (left < right) {
          // 1. Process current elements
          long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

          // 2. Update pointers based on condition
          if (sum == target) {
            resultList.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
            left++;
            right--;
            while (left < right && nums[left] == nums[left - 1]) left++; // Skip duplicate from left
            while (left < right && nums[right] == nums[right + 1]) right--; // Skip duplicate from right
          } else if (sum < target){
            left++;
          } else {
            right--;
          }
        }
      }
    }

    return resultList; 
  }

}
