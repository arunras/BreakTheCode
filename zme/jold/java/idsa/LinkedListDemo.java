package idsa;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    for (int i = 0; i < 10; i++) {
      list.insertAtHead(i+1);
    }

    list.deleteFromHead();

    System.out.println(list);
    System.out.println("Length: " + list.length());

    System.out.print("Found: " + list.find(3));
  }
}
