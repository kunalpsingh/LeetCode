package com.kunal.leetcode.linked_list.medium._237_delete_node_in_a_linked_list;

//https://leetcode.com/problems/delete-node-in-a-linked-list/
//https://leetcode.com/problems/delete-node-in-a-linked-list/solutions/6827060/java-solution-easiest-solution-beats-100-60rx/

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
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

        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.print("Original list: ");
        solution.printList(head);

        ListNode nodeToDelete = head.next;  //node with val 5
        solution.deleteNode(nodeToDelete);

        System.out.print("After deletion: ");
        solution.printList(head);
    }
}
