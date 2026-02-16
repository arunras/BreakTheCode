import leetcode.ReorderList;
import leetcode.object.ListNode;

public class Main {
	
//swap() doesn't swap i and j
  public static void swap(Integer i, Integer j) 
  {
     Integer temp = i;//new Integer(i);
     i = j;
     j = temp;
  }
	
	public static void test(Integer n) {
		if (n > 0) {
			System.out.print(n);
			test(n - 1);
		}
	}
	
	 public static boolean check2Strings(String s1, String s2) {
     if (s1.length() != s2.length()) return false;
     String concatString = s1 + s1;
     return concatString.contains(s2);
}
	
	
	public static void main(String[] args) {
		
		Integer i = new Integer(10);
    Integer j = new Integer(20);
    swap(i, j);
    System.out.println("i = " + i + ", j = " + j);
    
		//System.out.print(check2Strings("ab", "aa"));
		
		
		
		
		
		
		
		
		/*
    double start = System.currentTimeMillis(); 
//====TEST===============================================
    ListNode head = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);

    head.next = node2;
    node2.next = node3;
    node3.next = node4;
    
    ListNode node1 = head;
  
    System.out.print("Input : "); 
    while (node1 != null) {
    	System.out.print("->" + node1.val);
    	node1 = node1.next;
    }

    System.out.print("\nOutput : "); 
    ReorderList.find(head);
    while (head != null) {
    	System.out.print("->" + head.val);
    	head = head.next;
    }

//====TEST==============================================
    double end = System.currentTimeMillis();
    System.out.println("\nTime: " + ((end - start) / 1000) + "s");
	*/
	}

}
