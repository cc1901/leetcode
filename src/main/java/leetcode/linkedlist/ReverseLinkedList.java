package leetcode.linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = pre;
            pre = current;
            current = nextTemp;
        }
        return pre;
    }
}
