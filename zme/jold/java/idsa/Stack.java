package idsa;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Stack {
  private int[] items = new int[10];
  private int top = -1;

  public boolean isEmpty() {
    return top < 0;
  }

  public void push(int item) {
    if (top == items.length-1) {
      throw new RuntimeException("Stack is full"); 
    }
    items[++top] = item;
  }

  public int pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    int item = items[top];
    items = ArrayUtils.remove(items, top--);
    return item;
  }

  public int peek() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    return items[top];
  } 

  public static void main(String[] args) {
    Stack stack = new Stack();
    System.out.println("Stack empty?: " + stack.isEmpty());
    for (int i = 0; i < stack.items.length; i++) {
      stack.push(i+1);
    }

    System.out.println("Stack: " + Arrays.toString(stack.items));
    System.out.println("Stack empty?: " + stack.isEmpty());
    System.out.println("Peek: " + stack.peek());
    System.out.println("Pop: " + stack.pop());
    System.out.println("Peek: " + stack.peek());
    System.out.println("Pop: " + stack.pop());
    System.out.println("Peek: " + stack.peek());
    System.out.println("Stack: " + Arrays.toString(stack.items));
  }
}
