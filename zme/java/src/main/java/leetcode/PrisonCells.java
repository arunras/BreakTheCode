// https://leetcode.com/problems/prison-cells-after-n-days/

package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrisonCells {
	
	public static int[] prisonAfterNDays(int[] cells, int N) {
		Set<String> set = new HashSet<>();
		boolean cycle = false;
		int size = 0;
		for (int i = 0; i < N; i++) {
			int[] next = nextDay(cells);
			String key = Arrays.toString(next);
			if (set.contains(key)) {
				cycle = true;
				break;
			}
			set.add(key);
			size++;
			cells = next;
		}
		if (cycle) {
			cells = prisonAfterNDays(cells, N % size);
		}
		return cells;
	}
	
	public static int[] nextDay(int[] cells) {
		int[] next = new int[cells.length];
		for (int i = 1; i < cells.length - 1; i++) {
			next[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
		}
		return next;
	}
	
	/* Brute Force
	public static int[] prisonAfterNDays(int[] cells, int N) {
    for (int i = 0; i < N; i++) {
      cells = nextDayState(cells);
    }
    return cells;
  }
  
  public static int[] nextDayState(int[] cells) {
    int[] next = new int[cells.length];
    for (int i = 1; i < cells.length - 1; i++) {
      next[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
    }
    return next;
  }
  */

}
