// https://leetcode.com/problems/reorder-list/
package leetcode;

import leetcode.object.ListNode;

public class ReorderList {

  public static ListNode find(ListNode head) {
    if (head == null || head.next == null || head.next.next == null) return head;
    
    ListNode first = head;
    ListNode mid = getMid(head);
    ListNode second = reverse(mid.next);
    mid.next = null;
    while (second != null) {
      ListNode firstNext = first.next;
      ListNode secondNext = second.next;
      first.next = second;
      second.next = firstNext;

      first = firstNext;
      second = secondNext;
    }
    return head;
  }

  private static ListNode getMid(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  private static ListNode reverse(ListNode head) {
    ListNode current = head;
    ListNode prev = null;
    ListNode next = null;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }

}
