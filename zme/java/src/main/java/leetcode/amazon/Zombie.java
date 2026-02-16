// https://leetcode.com/discuss/interview-question/411357/
package leetcode.amazon;

import java.util.Queue;
import java.util.LinkedList;

public class Zombie {
  
  public static int minHours(int[][] grid) {
    int rows = grid.length, cols = grid[0].length;
    Queue<int[]> q = new LinkedList<>();
    int countHuman = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (grid[i][j] == 1) {
          q.offer(new int[] {i, j});
        } else {
          countHuman++;
        }
      }
    }

    int[][] directions = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int hours = 0; 
    while (!q.isEmpty() && countHuman > 0) {
      int size = q.size();
      for (int i = 0; i < size; i++) {
        int[] current = q.poll();
        for (int[] dir : directions) {
          int nextX = current[0] + dir[0];
          int nextY = current[1] + dir[1];
          if (nextX < 0 || nextX >= rows || nextY < 0 || nextY >= cols || grid[nextX][nextY] != 0) {
            continue;
          }

          grid[nextX][nextY] = 1;
          q.offer(new int[] {nextX, nextY});
          countHuman--;
        }
      }
      hours++;
    }
    return countHuman == 0 ? hours : -1;
  }

}
