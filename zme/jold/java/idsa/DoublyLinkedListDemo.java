package idsa;

public class DoublyLinkedListDemo {
  public static void main(String[] args) {
    DoublyLinkedList integers = new DoublyLinkedList();

    for (int i = 0; i < 10; i++ ) {
      integers.insertAtHead(i+1);
    }
    System.out.println(integers);
  }
}
