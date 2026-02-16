//https://leetcode.com/discuss/interview-question/313719/Amazon-or-Online-Assessment-2019-or-Movies-on-Flight
package leetcode.amazon;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MoviesOnFlight {
  
  public static List<Integer> find(int[] durations, int d) {
    d = d - 30;
    List<Integer> list = new ArrayList<>();
    list.add(-1);
    list.add(-1);

    // store original indexes int 2D array
    int[][] movies = new int[durations.length][2];
    for (int i = 0; i < durations.length; i++) {
      movies[i][0] = durations[i];
      movies[i][1] = i;
    }
    // sort new 2D array
    Arrays.sort(movies, (a, b) -> a[0] - b[0]);

    // find max sum less than d
    int max = -1;
    int start = 0, end = movies.length - 1;
    while (start < end) {
      int sum = movies[start][0] + movies[end][0];
      if (sum < d) {
        if (sum > max) {
          max = sum;
          list.set(0, movies[start][1]);
          list.set(1, movies[end][1]);
        }
        start++;
      } else {
        end--;
      }
    }
    return list;
  }

}
