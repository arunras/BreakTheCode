// https://leetcode.com/problems/partition-labels/
package leetcode.amazon;

import java.util.List;
import java.util.ArrayList;

public class PartitionLabels {

  public static List<Integer> find(String S) {
    // last indexes of each char
    int[] last = new int[26];
    for (int i = 0; i < S.length(); i++) {
    	char c = S.charAt(i);
    	int index = c - 'a';
      last[index] = i;
    }

    List<Integer> list = new ArrayList<>();
    int start = 0, end = 0;
    for (int i = 0; i < S.length(); i++) {
    	char c = S.charAt(i);
    	int index = c - 'a';
      end = Math.max(end, last[index]);
      if (i == end) {
        list.add(i - start + 1);
        start = i + 1;
      }
    }
    return list;
  }

}
