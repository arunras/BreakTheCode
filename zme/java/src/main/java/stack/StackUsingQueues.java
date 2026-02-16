// Link: https://leetcode.com/problems/implement-stack-using-queues/
package stack;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueues {
  private Queue<Integer> q1 = new LinkedList<Integer>();
  private Queue<Integer> q2 = new LinkedList<Integer>();
  private int top;

  public void push1(int data) {
    top = data;
    q1.add(top);
  }

  public int pop1() {
    while(q1.size() > 1) {
      q2.add(q1.remove());
    }
    int t = top;
    q1.remove();
    Queue<Integer> temp = q2;
    q2 = q1;
    q1 = temp;
    return t;
  }

  public int top() {
    return top;
  }

  public boolean isEmpty() {
    return q1.isEmpty();
  }

  public void push2(int data) {
    top = data;
    q2.add(top);
    while (!q1.isEmpty()) {
      q2.add(q1.remove());
    }
    Queue<Integer> temp = q2;
    q2 = q1;
    q1 = temp;
  }

  public int pop2() {
    int t = top;
    q1.remove();
    if (!q1.isEmpty()) {
      top = q1.peek();
    }
    return t;
  }

}
