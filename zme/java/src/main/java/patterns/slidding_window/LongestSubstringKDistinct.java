package patterns.slidding_window;

import java.util.Map;
import java.util.HashMap;

public class LongestSubstringKDistinct {

  public static int findLength(String str, int k) {
    if (str == null || str.length() == 0 || str.length() < k) 
      return -1;
    int start = 0;
    int maxLength = 0;
    Map<Character, Integer> map = new HashMap<Character, Integer>();

    for (int i = 0; i < str.length(); i++) {
      char rightChar = str.charAt(i);
      int charValue = map.get(rightChar) != null ? map.get(rightChar) : 0;
      map.put(rightChar, charValue + 1);
      //map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
      
      while (map.size() > k) {
        char leftChar = str.charAt(start);
        map.put(leftChar, map.get(leftChar) - 1);
        if (map.get(leftChar) == 0) 
          map.remove(leftChar);
        start++;
      }
      maxLength = Math.max(maxLength, i - start + 1);
    }
    return maxLength;

  }
}
