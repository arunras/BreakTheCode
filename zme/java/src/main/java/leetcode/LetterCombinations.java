package leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class LetterCombinations {
  static Map<String, String> phone = new HashMap<String, String>() {{
    put("2", "abc"); 
    put("3", "def"); 
    put("4", "ghi"); 
    put("5", "jkl"); 
    put("6", "mno"); 
    put("7", "pqrs"); 
    put("8", "tuv"); 
    put("9", "wxyz"); 
  }};
  static List<String> list = new ArrayList<>();

  public static List<String> letterCombinations(String digits) {
    if (digits.length() != 0) {
      backtrack("", digits);
    }
    return list;
  }

  private static void backtrack(String combination, String nextDigits) {
    if (nextDigits.length() == 0) {
      list.add(combination);
    } else {
      String digit = nextDigits.substring(0, 1);
      String letters = phone.get(digit);
      for (int i = 0; i < letters.length(); i++) {
        String letter = letters.substring(i, i + 1);
        backtrack(combination + letter, nextDigits.substring(1));
      }   
    }
  }
}
