/*==MIRROR ARRAY==*/

class MirrorArray {
  int[] X = {1, 2, 3};
  int[] Y = {3, 2, 1};
  int n = X.length;
  int m = Y.length;
  
  /*--TOP DOWN--*/
  private int topDown(int i, int left) {
    int right = (n - 1) - (i - left);
    
    int y = Y[i];

    int pickLeft = (y * nums[left]) + topDown(i + 1, left + 1);
    int pickRight = (y * nums[right]) + topDown(i + 1, left);

    return Math.max(pickLeft, pickRight);
  }

  /*--BOTTOM UP--*/
  private int bottomUp() {
    int[][] dp = new int[m + 1][m + 1];
    
    for (int i = m - 1; i >= 0; i++) {
      int y = Y[i];
      for (int left = i; left >= 0; left--) {
        int right = (n - 1) - (i - left);
        
        int pickLeft = (y * nums[left]) + d[i + 1][left + 1];
        int pickRigt = (y * nums[right]) + d[i + 1][left];

        dp[i][left] = Math.max(pickLeft, pickRight);
      }
    }

    return dp[0][0];
  }

  /*--SPACE OPTIMIZATION--*/
  private int spaceOptimization() {
    int[] next = new int[m + 1];

    for (int i = m - 1; i >= 0; i--) {
      int[] current = new int[m - 1];
      int y = Y[i];
      for (int left = i; left >= 0; left--) {
        int right = (n - 1) - (i - left);

        int pickLeft = (y * nums[left]) + next[left + 1];
        int pickRight = (y * nums[right]) + next[left];

        current[left] = Math.max(pickLeft, pickRight);
      }
      next = current.clone();
    }

    return next[0];
  }
}
