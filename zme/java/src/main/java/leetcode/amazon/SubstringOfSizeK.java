// https://leetcode.com/discuss/interview-question/370112

package leetcode.amazon;

import java.util.HashSet;
import java.util.Set;

public class SubstringOfSizeK {
  
  public static Set<String> find(String s, int k) {
    Set<String> set = new HashSet<>();
    Set<Character> window = new HashSet<>();
    int start = 0;
    for (int end = 0; end < s.length(); end++) {
      char c = s.charAt(end);
      while (window.contains(c)) {
        window.remove(s.charAt(start));
        start++;
      }

      window.add(c);

      if (window.size() == k) {
        set.add(s.substring(start, end + 1));
        window.remove(s.charAt(start));
        start++;
      }
    }
    return set;
  }

}
