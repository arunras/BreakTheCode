package idsa;

public class DoublyLinkedNode {
  private int data;
  private DoublyLinkedNode nextNode;
  private DoublyLinkedNode prevNode;

  public DoublyLinkedNode(int data) {
    this.data = data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public void setNextNode(DoublyLinkedNode nextNode) {
    this.nextNode = nextNode;
  }

  public void setPrevNode(DoublyLinkedNode prevNode) {
    this.prevNode = prevNode;
  }

  public int getData() {
    return this.data;
  }

  public DoublyLinkedNode getNextNode() {
    return this.nextNode;
  }

  public DoublyLinkedNode getPrevNode() {
    return this.prevNode;
  }

  @Override
  public String toString() {
    return "Data: " + this.data;
  }

}
