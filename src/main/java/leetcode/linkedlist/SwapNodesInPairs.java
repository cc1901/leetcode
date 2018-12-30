package leetcode.linkedlist;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pre = new ListNode(0);
        ListNode result = head.next;
        pre.next = head;
        while(pre.next != null && pre.next.next != null) {
            ListNode a = pre.next;
            ListNode b = pre.next.next;
            a.next = b.next;
            b.next = a;
            pre.next = b;
            pre = a;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        head.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode listNode = new SwapNodesInPairs().swapPairs(head);
        System.out.println(listNode);
    }
}
