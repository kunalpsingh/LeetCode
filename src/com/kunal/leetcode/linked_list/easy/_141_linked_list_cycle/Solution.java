package com.kunal.leetcode.linked_list.easy._141_linked_list_cycle;

//https://leetcode.com/problems/linked-list-cycle/
//https://leetcode.com/problems/linked-list-cycle/solutions/6833871/java-solution-beats-100-fast-and-slow-po-2lbr/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head, fast = head.next;
        while(fast!=null && fast.next!=null) {
            if(slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(3,
                new ListNode(2,
                        new ListNode(0,
                                new ListNode(-4))));
        listNode1.next.next.next.next = listNode1.next; // Creating a cycle
        System.out.println(solution.hasCycle(listNode1)); // Should return true

        ListNode listNode2 = new ListNode(1,
                new ListNode(2));
        System.out.println(solution.hasCycle(listNode2)); // Should return false
    }

}
