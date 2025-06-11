package com.kunal.leetcode.linked_list.easy._206_reverse_linked_list;

//https://leetcode.com/problems/reverse-linked-list/
//https://leetcode.com/problems/reverse-linked-list/solutions/6832727/java-solution-beats-100-on-time-o1-space-d60r/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
        ListNode reverseListNode = solution.reverseList(listNode);
        solution.printList(reverseListNode);
    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }
}
