// Link: https://www.hackerrank.com/challenges/arrays-ds/problem

package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {

  public static int[] compute(int[] data) {
   int array[] = new int[data.length];
   int j=0;
   for (int i = data.length - 1; i >= 0; i--) {
     array[j] = data[i];
     j++;
   }
   return array;
  }

  public static int[] swap(int[] data) {
    for (int i = 0; i < data.length / 2; i++) {
     int temp = data[data.length - i - 1];
     data[data.length - i - 1] = data[i];
     data[i] = temp; 
    }
    return data;
  }

  public static int[] listCollection(int[] data) {
    List<Integer> list = Arrays.stream(data).boxed().collect(Collectors.toList());
    Collections.reverse((list));
    return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
  }

}
