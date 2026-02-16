// https://leetcode.com/discuss/interview-question/347457
package leetcode.amazon;

import java.util.Queue;
import java.util.LinkedList;

public class TreasureIsland {
  
  public static int find(char[][] grid) {
    Queue<int[]> q = new LinkedList<>();
    q.offer(new int[] {0, 0});
    return bfs(grid, q);
  }

  private static int bfs(char[][] grid, Queue<int[]> q) {
    int rows = grid.length, cols = grid[0].length;
    int[][] directions = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int step = 1;

    while (!q.isEmpty()) {
      int size = q.size();
      for (int i = 0; i < size; i++) {
        int[] current = q.poll();


        for (int[] dir : directions) {
          int nextX = current[0] + dir[0];
          int nextY = current[1] + dir[1];
          if (nextX < 0 || nextX >= rows || nextY < 0 || nextY >= cols || grid[nextX][nextY] == 'D') {
            continue;
          }
          if (grid[nextX][nextY] == 'X') return step;
          q.offer(new int[] {nextX, nextY});
          grid[nextX][nextY] = 'D';
        }
      }
      step++;
    }
    return -1;
  }

}
