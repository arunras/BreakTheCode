/*==GRID 3D==*/

class Grid3D {
  int[][] grid = {{1, 2, 3}, {4,5, 6}, {7, 8, 9}};

  int R = grid.length;
  int C = grid[0].length;

  Integer[][][] cache = new Integer[R][C][C];

  int[][] nextRow; // For Space Optimization

  /*--TOP DOWN--*/
  public int topDown(int r, int c1, int c2) {
    // 1. Boundary Check: are the robots still on the grid
    if (!isValidCell(c1, c2)) return 0;

    // 2. Cache: return if available
    if (cache[r][c1][c2] != null) return cache[r][c1][c2]; 

    // 3. Values: get value from current cells
    int cherries = (c1 == c2) ? grid[r][c1] : grid[r][c1] + grid[r][c2];

    // 4. Base Case: reached the last row
    if (r == R - 1) return cherries;

    // 5. Explore all 9 combinations (3 moves from Robot1 * 3 moves from Robot2)
    int maxNext = moveNext(r, c1, c2);

    // 6. Cache: save result
    int sum = cherries + maxNext;
    cache[r][c1][c2] = sum;
  
    // 7. Return: current result
    return sum;

  }

  /*--BOTTOM UP--*/
  public int bottomUp() {
    // 1. Initialize Base Case: The bottom row
    for (int c1 = 0; c1 < C; c1++) {
      for (int c2 = 0; c2 < C; c2++) {
        cache[R - 1][c1][c2] = (c1 == c2) ? grid[R - 1][c1] : grid[R - 1][c1] + grid[R - 1][c2];
      }
    }

    // 2. Fill up the table from bottom-to-top (starting from the second-to-last row
    for (int r = R - 2; r >= 0; r--) {
      for (int c1 = 0; c1 < C; c1++) {
        for (int c2 = 0; c2 < C; c2++) {
          int cherries = (c1 == c2) ? grid[r][c1] : grid[r][c1] + grid[r][c2];  
          int maxNext = moveNext(r, c1, c2);
          cache[r][c1][c2] = cherries + maxNext;
        }
      }
    }

    return cache[0][0][C - 1];
  }

  /*--SPACE OPTIMIZATION--*/
  public int spaceOptimization() {
    this.nextRow = new int[C][C];

    // 1. Initialize Base Case: The bottom row
    for (int c1 = 0; c1 < C; c1++) {
      for (int c2 = 0; c2 < C; c2++) {
        nextRow[c1][c2] = (c1 == c2) ? grid[R - 1][c1] : gird[R - 1][c1] + grid[R - 1][c2];
      }
    }

    // 2. Fil up the table
    for (int r = R - 2; r >= 0; r--) {
      int[][] currentRow = new int[C][C];
      for (int c1 = 0; c1 < C; c1++) {
        for (int c2 = 0; c2 < C; c2++) {
          int cherries = (c1 == c2) ? grid[r + 1][c1] : grid[r + 2][c1] + grid[r + 1][c2];
          int max = moveNextRow(c1, c2);
          currentRow[c1][c2] = cherries + max;  
        }
      }
      nextRow = currentRow.clone();
    }

    return nextRow[0][C - 1];
  }


  /*--HELPERS--*/
  private int moveNext(int r, int c1, int c2) {
    int max = 0;
    for (int d1 = -1; d1 <= 1; d1++) {
      for (int d2 = -1; d2 <= 1; d2++) {
        int nextC1 = c1 + d1;
        int nextC2 = c2 + d2;
        if (isValidCell(nextC1, nextC2) {
          int nextSum = cache[r + 1][nextC1][nextC2];
          max = Math.max(max, nextSum);
        }
      }
    }
    return max;
  }

  private int moveNextRow(int c1, int c2) {
    int max = 0;
    for (int d1 = -1; d1 <= 1; d1++) {
      for (int d2 = -1; d2 <= 1; d2++) {
        int nextC1 = c1 + d1;
        int nextC2 = c2 + d2;
        if (isValidCell(nextC1, nextC2) {
          int nextSum = nextRow[nextC1][nextC2];
          max = Math.max(max, nextSum);
        }
      }
    }
    return max;
  }

  private boolean isValidCell(int c1, int c2) {
    if (c1 >= 0 && c1 < C && c2 >= 0 && c2 < C) {
      return true;
    }
    return false;
  }

}
