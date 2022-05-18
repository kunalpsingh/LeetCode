/*

206. Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
 

Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000

*/

package easy.com.leetcode.reverselinkedlist_206;


class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
	public ListNode reverseList(ListNode head) {
		ListNode reversedList = null;
		if(head==null)
			return null;
        while(head!=null) {
        	if(reversedList==null) {
        		reversedList = new ListNode(head.val);
        		reversedList.next = null;
        	} else {
        		ListNode node = new ListNode(head.val);
        		node.next = reversedList;
        		reversedList = node;
        	}
        	head = head.next;
        }
        return reversedList;
    }
	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3,node4);
		ListNode node2 = new ListNode(2,node3);
		ListNode node1 = new ListNode(1,node2);
		
		ListNode reversedList = sol.reverseList(node1);
		ListNode currNode = reversedList;
		while (currNode != null) {
            System.out.print(currNode.val + " ");
            currNode = currNode.next;
        }
	}
}
