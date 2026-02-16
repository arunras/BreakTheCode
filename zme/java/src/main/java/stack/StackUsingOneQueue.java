// Link: https://leetcode.com/problems/implement-stack-using-queues/
package stack;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingOneQueue {
  Queue<Integer> q = new LinkedList<Integer>();

  public void push(int data) {
    q.add(data);
    int i = q.size();
    while (i > 1) {
      q.add(q.remove());
      i--;
    }
  }

  public int pop() {
    return q.remove();
  }

  public int top() {
    return q.peek();
  }

  public boolean isEmpty() {
    return q.isEmpty();
  }
}

