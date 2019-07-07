package leetcode.linkedlist;


class MyLinkedList {
    public static void main(String[] args) {
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.addAtHead(8);
//        myLinkedList.addAtTail(81);
//        myLinkedList.get(1);
//        myLinkedList.addAtIndex(1, 2);
//        int get1 = myLinkedList.get(1);
//        int get0 = myLinkedList.get(0);
//        int get2 = myLinkedList.get(2);
//        System.out.println(get1);
//        System.out.println(get0);
//        System.out.println(get2);
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;

        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == a + b);
        System.out.println(g.equals(a + b));
    }
    private static class ListNode {
        private int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }
    private ListNode head;
    private ListNode tail;
    private int length;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        length = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        ListNode node = getAt(index);
        return node == null ? -1 : node.val;
    }

    private ListNode getAt(int index) {
        ListNode cur = head;
        while(cur != null && index > 0) {
            cur = cur.next;
            index--;
        }

        return index > 0 ? null : cur;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val);
        if (head == null) {
            tail = newHead;
        }
        newHead.next = head;
        head = newHead;
        length++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode newTail = new ListNode(val);
        if(tail == null) {
            tail = newTail;
            head = newTail;
        } else {
            tail.next = newTail;
            tail = newTail;
        }
        length++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(length == index){
            addAtTail(val);
        } else {
            ListNode prev = getAt(index - 1);
            if (prev == null) return;
            ListNode node = new ListNode(val);
            node.next = prev.next;
            prev.next = node;
            length++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        ListNode prev = getAt(index - 1);
        if(prev == null || prev.next == null) return;
        prev.next = prev.next.next;
        length--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */