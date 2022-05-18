/*

83. Remove Duplicates from Sorted List

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
 
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

package easy.com.leetcode.removeduplicatefromsortedlist_83;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null || head.next==null) {
			return head;
		}
		ListNode currNode = head;
		ListNode nextNode = head.next;
		while(nextNode!=null) {
			if(currNode.val==nextNode.val) {
				currNode.next=nextNode.next;
				nextNode = nextNode.next;
			} else {
				currNode = currNode.next;
				nextNode = nextNode.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode node6 = new ListNode(3);
		ListNode node5 = new ListNode(3,node6);
		ListNode node4 = new ListNode(2,node5);
		ListNode node3 = new ListNode(2,node4);
		ListNode node2 = new ListNode(1,node3);
		ListNode node1 = new ListNode(1,node2);
		
		ListNode sortedList = sol.deleteDuplicates(node1);
		ListNode currNode = sortedList;
		while (currNode != null) {
            System.out.print(currNode.val + " ");
            currNode = currNode.next;
        }
	}
}
