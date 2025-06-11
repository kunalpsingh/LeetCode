package com.kunal.leetcode.linked_list.easy._234_palindrome_linked_list;

//https://leetcode.com/problems/palindrome-linked-list/
//https://leetcode.com/problems/palindrome-linked-list/solutions/6833847/java-solution-beats-997-on-time-o1-space-hicl/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, prev, temp;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(1))));
        ListNode listNode2 = new ListNode(1,
                new ListNode(2, null));
        System.out.println(solution.isPalindrome(listNode1));
        System.out.println(solution.isPalindrome(listNode2));
    }
}
