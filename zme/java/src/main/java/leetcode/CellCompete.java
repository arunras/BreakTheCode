package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CellCompete {
	
	public static List<Integer> cellCompete(int[] states, int days) {
		Set<String> set = new HashSet<>();
		boolean cycle = false;
		int size = 0;
		for (int i = 0; i < days; i++) {
			int[] next = nextDay(states);
			String key = Arrays.toString(next);
			if (set.contains(key)) {
				cycle = true;
				break;
			}
			set.add(key);
			size++;
			states = next;
		}
		
		if (cycle) {
			states = cellCompete(states, days % size).stream().mapToInt(Integer::intValue).toArray();
		}
		
		return Arrays.stream(states).boxed().collect(Collectors.toList());
	}
	
	public static int[] nextDay(int[] states) {
		int[] next = new int[states.length];
		next[0] = states[1] ^ 0;
		next[states.length - 1] = states[states.length - 2] ^ 0;

		for (int i = 1; i < states.length - 1; i++) {
			next[i] = states[i - 1] ^ states[i + 1];
		}
		return next;
	}
  
}
