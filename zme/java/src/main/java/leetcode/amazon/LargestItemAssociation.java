// https://leetcode.com/discuss/interview-question/782606/
package leetcode.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestItemAssociation {

  static class PairString {
    String first;
    String second;

    PairString(String first, String second) {
      this.first = first;
      this.second = second;
    }
  }

  public List<String> largestItemAssociation(List<PairString> items) {
    Map<String, String> map = new HashMap<>();
    Map<String, String> revMap = new HashMap<>();
    List<String> result = new ArrayList<>();

    for (PairString item : items) {
      map.put(item.first, item.second);
      revMap.put(item.second, item.first);
    }

    for(Map.Entry<String, String> entry : map.entrySet()) {
      if (revMap.get(entry.getKey()) == null) {
        List<String> list = new ArrayList<>();
        list.add(entry.getKey());
        //list = dfs(entry.getKey(), list);

        if (list.size() > result.size()) {
          result = list;
        }
      }
    }
    return result;
  }

}
