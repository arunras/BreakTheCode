// https://leetcode.com/problems/number-of-islands/
package leetcode.amazon;

public class NumberOfIslands {

  public static int find(char[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }

    int islands = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == '1') {
          islands += dfs(grid, i, j);
        }
      }
    }
    return islands;
  }
  
  private static int dfs(char[][] grid, int x, int y) {
    if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != '1') {
      return 0;
    }
    
    grid[x][y] = '2';
    dfs(grid, x - 1, y);
    dfs(grid, x + 1, y);
    dfs(grid, x, y - 1);
    dfs(grid, x, y + 1);

    return 1;
  }

}
