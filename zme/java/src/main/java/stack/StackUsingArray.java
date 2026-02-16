package stack;

public class StackUsingArray {
  int size; 
  int top;
  int A[];

  public StackUsingArray(int size) {
    this.size = size;
    this.top = -1;
    this.A = new int[size];
  }

  public void push(int e) {
    if (!isFull()) {
      top++;
      A[top] = e;
      System.out.println("Pushed: " + e);
    } else {
      System.out.println("Stack is full.");
    }
  }

  public int pop() {
    if (!isEmpty()) {
      int t = top--;
      System.out.println("Poped: " + A[t]);
      return A[t];
    } else {
      System.out.println("Stack is empty.");
      return -1;
    }
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public boolean isFull() {
    return (top == size - 1);
  }

  public int peek() {
    if (!isEmpty()) {
      System.out.println("Top is: " + A[top]);
      return A[top];
    } else {
      System.out.println("Stack is empty.");
      return -1;
    }

  }
}
