package stack;

public class StackUsingLinkedList {
  private class Node {
    int data;
    Node next;
  }

  private Node head;

  public void push(int data) {
    Node node = new Node();
    node.data = data;
    node.next = head;
    head = node;
  }

  public int pop() {
    if (head != null) {
      int data = head.data;
      head = head.next;
      return data;
    }
    return -1;
  }

  public void printList(Node head) {
    Node node = head;
    while (node != null) {
      System.out.println(node.data);
      node = node.next;
    }
  }
}
