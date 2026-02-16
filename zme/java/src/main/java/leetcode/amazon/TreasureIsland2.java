package leetcode.amazon;

import java.util.Queue;
import java.util.LinkedList;

public class TreasureIsland2 {

    public static int find(char[][] grid) {
      int rows = grid.length, cols = grid[0].length;
      Queue<int[]> q = new LinkedList<>();
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
          if (grid[i][j] == 'S') {
            q.offer(new int[] {i, j});
          }
        }
      }

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
            grid[nextX][nextY] = 'D';
            q.offer(new int[] {nextX, nextY});
          }
        }
        step++;
      }
      return -1;
    }

}
