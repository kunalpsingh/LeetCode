package com.kunal.leetcode.linked_list.easy._21_merge_two_sorted_Lists;

//https://leetcode.com/problems/merge-two-sorted-lists/
//https://leetcode.com/problems/merge-two-sorted-lists/solutions/6833075/java-solution-beats-100-omn-time-o1-spac-i1b9/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode head = new ListNode(-1);
        ListNode node = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        node.next = list1 != null ? list1 : list2;
        return head.next;
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
        ListNode list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));
        ListNode list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));
        ListNode mergedList = solution.mergeTwoLists(list1, list2);
        solution.printList(mergedList);
    }
}
