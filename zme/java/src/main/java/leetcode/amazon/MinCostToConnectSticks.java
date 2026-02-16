// https://leetcode.com/problems/minimum-cost-to-connect-sticks/
package leetcode.amazon;

import java.util.PriorityQueue;

public class MinCostToConnectSticks {
  
  public static int find(int[] sticks) {
    int cost = 0;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for (int stick : sticks) {
      minHeap.add(stick);
    }

    while (minHeap.size() > 1) {
      int sum = minHeap.poll() + minHeap.poll();
      cost += sum;
      minHeap.add(sum);
    }
    return cost;
  }

}
