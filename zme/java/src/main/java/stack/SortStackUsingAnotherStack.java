package stack;

import java.util.Stack;

public class SortStackUsingAnotherStack {
  
  public static Stack<Integer> sort(Stack<Integer> s1) {
    Stack<Integer> s2 = new Stack<Integer>();
    while (!s1.isEmpty()) {
      int pop1 = s1.pop();
      while (!s2.isEmpty() && pop1 < s2.peek()) {
        s1.push(s2.pop());
      }
      s2.push(pop1);
    }
    return s2;
  } 

}
