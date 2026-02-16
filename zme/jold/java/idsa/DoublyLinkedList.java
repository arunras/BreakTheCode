package idsa;

public class DoublyLinkedList {
  private DoublyLinkedNode head;

  public void insertAtHead(int data) {
    DoublyLinkedNode newNode = new DoublyLinkedNode(data);
    newNode.setNextNode(this.head);
    if (this.head != null) {
      this.head.setPrevNode(newNode);
    }
    this.head = newNode; 
  }
/*
  public DoublyLinkedNode[] sortDoublyLinkedList(DoublyLinkedNode[] list) {
    
    DoublyLinkedNode current = this.head;
    DoublyLinkedNode nodeA = current;
    DoublyLinkedNode nodeB = current.getNextNode();
    DoublyLinkedNode nodeC = nodeB.getNextNode();
    DoublyLinkedNode nodeD = nodeC.getNextNode();

    while (current.getNextNode != null) {
      if (current.getPrevNode == null) {
        if (current.data > current.nextNode.data) {
          current.getNextNode = current.getNextNode().getNextNode();
          current.getNextNode().getPrevNode() = current;
          current.getnextNode().prevNode() = null;
          current.getNextNode().getNextNode() = current
        }
      } else {

      }
    }
  }
*/
  public int length() {
    if (head == null) {
      return 0;
    }
    int length = 0;
    DoublyLinkedNode current = this.head;
    while (current.getNextNode() != null) {
      length++;
      current = current.getNextNode();
    }
    return length;
  }

  @Override
  public String toString() {
    String result = "";
    DoublyLinkedNode current = this.head;
    while (current != null) {
      result += current.toString() + "\n";      current = current.getNextNode(); 
    } 
    return result;
  }

}
