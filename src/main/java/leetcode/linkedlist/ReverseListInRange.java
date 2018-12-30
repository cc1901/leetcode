package leetcode.linkedlist;

public class ReverseListInRange {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m >= n) {
            return head;
        }
        ListNode prev = head;
        int count = 1;
        while (count < m-1){
            prev = prev.next;
            count++;
        }
        ListNode mNodePrev = prev;
        ListNode current = prev.next;
        ListNode mNode = prev;
        if(m > 1) {
            mNode = current;
        }
        while(count < n) {
            ListNode tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
            count++;
        }
        mNodePrev.next = prev;
        mNode.next = current;
        if (m == 1) {
            return prev;
        }
        return head;
    }

    public static void main(String[] args) {
        ReverseListInRange reverseListInRange = new ReverseListInRange();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
//        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
        listNode3.next = listNode5;
        ListNode head = reverseListInRange.reverseBetween(listNode3, 1, 2);
        System.out.println(head);
    }
}
