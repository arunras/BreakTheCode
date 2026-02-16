// https://leetcode.com/discuss/interview-question/542597/
package leetcode.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class TopKFrequentlyMentionedKeywords {
    
  public static List<String> find(String[] keywords, String[] reviews, int k) {
    Map<String, Integer> map = new HashMap<>();
    //List<String> listKeywords = Arrays.asList(keywords);
    /*
    List<String> listKeywords = Arrays.asList(keywords).stream()
    																									 .map(String::toLowerCase)
    																									 .collect(Collectors.toList());
    */

    for (String s : keywords) {
      map.put(s.toLowerCase(), map.getOrDefault(s, 0));
    }
    
    for (String words : reviews) {
      for (String word : words.split("\\s+")) {
        word = word.toLowerCase();
        //if (map.containsKey(word)) {
          map.put(word, map.getOrDefault(word, 0) + 1);    
        //}
      }
    } 

    List<String> list = new ArrayList<>(map.keySet());
    Collections.sort(list, (a, b) -> {
      return map.get(a).equals(map.get(b)) ? a.compareTo(b) : map.get(b) - map.get(a); 
    });

    return list.subList(0, k);
  }
}
