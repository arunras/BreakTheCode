/* Find the length of the longest substring without repeating characters
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1. 
 * Given "pwwkew", the answer is "wke", with the length of 3. 
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

package lc;

import java.util.Set;
import java.util.HashSet;

public class LengthOfLongestSubstring {
  public int lengthOfLongestSubstring(String s) {
    int maxLen = 0;
    int i = 0, j = 0;
    Set <Character> set = new HashSet<> ();
    while (j < s.length()) {
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j));
        j++;
        maxLen = Math.max(maxLen, j-i);
      } else {
        set.remove(s.charAt(i));
        i++;
      }
    }
    return maxLen;
  }

  public static void main(String[] args) {
    LengthOfLongestSubstring ls = new LengthOfLongestSubstring();
    String str = "pwwkew";
    System.out.println("Answer: " + ls.lengthOfLongestSubstring(str));
  }
}

