package com.kunal.leetcode.linked_list.medium._19_remove_nth_node_from_end_of_list;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/solutions/6827164/java-solution-beats-100-on-time-o1-space-6nyv/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;}
}
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode slow = dummy;

        for(int i=0; i<n; i++) {
            fast = fast.next;
        }
        while(fast.next!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        System.out.print("Original list: ");
        solution.printList(head);

        ListNode result = solution.removeNthFromEnd(head, 2);

        System.out.print("After removal: ");
        solution.printList(result);
    }
}
