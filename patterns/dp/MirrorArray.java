/*==MIRROR ARRAY==*/

class MirrorArray {
  int[] X = {1, 2, 3};
  int[] Y = {3, 2, 1};
  int n = X.length;
  int m = Y.length;
  int[][] cache = new int[m][m];
  
  /*--TOP DOWN--*/
  private int topDown(int i, int left) {
    // Base case: All Y used
    if (i == m) return 0;

    // Cache: return if available
    if (cache[i][left]) return cache[i][left];

    // Calculate right index dynamically
    int right = (n - 1) - (i - left);
    
    // Values: get values from X and Y
    int y = Y[i];
    int xyLeft = X[left] * y;
    int xyRight = X[right] * y;

    // Option 1: Pick from left
    int pickLeft = xyLeft + topDown(i + 1, left + 1);
    // Option 2: Pick from right
    int pickRight = xyRight + topDown(i + 1, left);
    
    // Pick: left or right
    int max = Math.max(pickLeft, pickRight);

    // Cache: save result
    cache[i][left] = max; 

    // Return: current result
    return max;
  }

  /*--BOTTOM UP--*/
  private int bottomUp() {
    int[][] dp = new int[m + 1][m + 1];
    
    for (int i = m - 1; i >= 0; i++) {
      for (int left = i; left >= 0; left--) {
        int right = (n - 1) - (i - left);

        int y = Y[i];
        int xyLeft = X[left] * y;
        int xyRight = X[right] * y;
        
        int pickLeft = xyLeft + d[i + 1][left + 1];
        int pickRigt = xyRight + d[i + 1][left];

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
      for (int left = i; left >= 0; left--) {
        int right = (n - 1) - (i - left);

        int y = Y[i];
        int xyLeft = X[left] * y;
        int xyRight = X[right] * y;

        int pickLeft = xyLeft + next[left + 1];
        int pickRight = xyRight + next[left];

        current[left] = Math.max(pickLeft, pickRight);
      }
      next = current.clone();
    }

    return next[0];
  }
}
