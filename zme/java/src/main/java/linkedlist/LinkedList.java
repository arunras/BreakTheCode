package linkedlist;

public class LinkedList {
  private Node head;

  public boolean isEmpty() {
    return (head == null);
  }

  public void addFirst(Node node) {
    node.next = head;
    head = node;  
  }

  public void addLast(Node node) {
    if (head == null) {
      head = node;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = node;
    }
  }

  public Node deleteFirst() {
    Node temp = head;
    head = head.next;
    return temp;
  }

  public void deleteLast() {
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current = null;
  }

  public void deleteAfter(Node node) {
    Node current = head;
    while (current.next != null && current.data != node.data) {
      current = current.next;
    }
    if (current.next != null) {
      current.next = current.next.next;
    }
  }

  public void printList(Node head, String title) {
    System.out.println(title);
    Node current = head;
    while (current != null) {
      System.out.print("->" + current.data);
      current = current.next;
    }
    System.out.println("\n");
  }

//===Algorithms==========================================================
  // Link: https://leetcode.com/problems/reverse-linked-list/
  public Node reverseLinkedList(Node head) {
    Node prev = null;
    Node current = head;
    Node next = null;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }

  // Link: https://leetcode.com/problems/middle-of-the-linked-list/
  public Node findMiddleNode(Node head) {
    Node slow, fast;
    slow = fast = head;
    while (fast != null) {
      fast = fast.next;
      if (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next;
      }
    }
    return slow;
  }

  // Link: 
  public Node findNNodeFromEnd(Node head, int n) {
    Node first, second; 
    first = second = head;
    int i = 0;
    while (first != null) {
      first = first.next;
      if (i >= n) {
        second = second.next;
      } 
      i++;
    }
    return second;
  }

  // Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
  public Node removeNNodeFromEnd(Node head, int n) {
    Node dummy = new Node(0);
    dummy.next = head;
    Node first, second;
    first = second = dummy;
    Node connector = null;
    int i = 0;
    while (first != null) {
      first = first.next;
      connector = second;
      if (i >= n) {
        second = second.next;
      }
      i++;
    }
    connector.next = null;//second.next;
    return dummy.next;
  }

  // Link: https://leetcode.com/problems/linked-list-cycle/
  public boolean hasCycle(Node head) {
    Node slow, fast;
    slow = fast = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (slow == fast) 
        return true;
    }
    return false;
  }

  public Node findStartNodeOfLoop(Node head) {
    Node slow, fast;
    slow = fast = head;
    boolean isLoop = false;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (slow == fast) {
        isLoop = true;
        System.out.println("There is a loop.");
        break;
      }
    }
    if (isLoop) {
      slow = head;
      while (slow != fast) {
        slow = slow.next;
        fast = fast.next;
      }
      System.out.println("Start Node: " + slow.data);
    } else {
      System.out.println("There is no loop.");
      slow = null;
    }
    return slow;
  }

  // Link: https://leetcode.com/problems/remove-linked-list-elements/
  public Node removeNodes(Node head, int data) {
    Node dummy = new Node(0);
    dummy.next = head;
    Node current = dummy;
    while (current.next != null) {
      if (current.next.data == data) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
    return dummy.next;
  }

  public boolean isPalindrome(Node head) {
    Node middle = findMiddleNode(head);
    Node secondHead = middle.next;
    middle.next = null;
    Node reverseHead = reverseLinkedList(secondHead);
    while (head != null && reverseHead != null) {
      if (head.data == reverseHead.data) {
        head = head.next;
        reverseHead = reverseHead.next;
        continue;
      } else {
        return false;
      }
    }
    return true;
  }

  public Node findIntersectionNode(Node head1, Node head2) {
    int length1, length2;
    length1 = length2 = 0;
    Node temp1 = head1;
    Node temp2 = head2;
    while (temp1 != null) {
      length1++;
      temp1 = temp1.next;
    }
    while (temp2 != null) {
      length2++;
      temp2 = temp2.next;
    }
    int difference = 0;
    Node first = head1;
    Node second = head2;
    if (length1 > length2) {
      difference = length1 - length2;
      int i = 0;  
      while (i < difference) {
        first = first.next;
        i++;
      }
    }  
    if (length2 > length1) {
      difference = length2 - length1;
      int i = 0;  
      while (i < difference) {
        second = second.next;
        i++;
      }
    } 
    while (first != null && second !=null) {
      if (first == second) {
        return first;
      }
      first = first.next;
      second = second.next;
    }
    return null;
  }

  // leetcode: https://leetcode.com/problems/swap-nodes-in-pairs/
  public Node swapPairs(Node head) {
    if (head != null && head.next == null)
      return head;
    Node current = head;
    Node newHead = null;
    Node temp = null;
    while (current != null && current.next != null) {
      if (temp != null) 
        temp.next.next = current.next;
      temp = current.next;
      current.next = temp.next;
      temp.next = current;
      
      if (newHead == null)
        newHead = temp;
      current = current.next;
    }
    return newHead;
  }
//===algorithms==========================================================
}





















