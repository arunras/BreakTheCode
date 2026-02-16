package idsa;

public class Queue {
  private int[] items = new int[5];
  private int head = -1;
  private int tail = -1;
  private int numOfItems = 0;

  public Queue() {}

  public Queue(int size) {
    this.items = new int[size];
  }

  public void enqueue(int item) {
    if (isFull()) {
      throw new RuntimeException("Queu is full");
    }
    if (tail == items.length-1) {
      tail = -1;
    }
    items[++tail] = item;
    numOfItems++;
  }

  public int dequeue() {
    if (isEmpty()) {
      throw new RuntimeException("Queu is Empty");
    }
    if (head == items.length-1) {
      head = -1;
    }
    numOfItems--;
    return items[++head];
  }

  public int peek() {
    return items[head+1];
  }

  public boolean isFull() {
    return numOfItems == items.length;
  }

  public boolean isEmpty() {
    return numOfItems == 0;
  }
  
  public static void main(String[] args) {
		Queue q = new Queue();
		System.out.println(q.isEmpty());
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(10);
		q.enqueue(46);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(2);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(8);
		q.enqueue(10);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}

