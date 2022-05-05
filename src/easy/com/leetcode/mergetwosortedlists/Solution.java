/*

21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.

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

package easy.com.leetcode.mergetwosortedlists;
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Solution {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode ans = null;
        ListNode temp = null;
        while(list1!=null&&list2!=null){
            ListNode curr = list1.val<list2.val?list1:list2;
            if(list1==curr) list1 = list1.next;
            if(list2==curr) list2 = list2.next;
            if(ans==null){
                ans = temp = curr;
            }else{
                temp.next = curr;
                temp = temp.next;
            }
        }
        if(temp!=null) temp.next = list1==null?list2:list1;
        else temp = ans = list1==null?list2:list1;
        return ans;
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		ListNode node3List1 = new ListNode(4);
		ListNode node2List1 = new ListNode(2,node3List1);
		ListNode node1List1 = new ListNode(1,node2List1);
		
		ListNode node3List2 = new ListNode(4);
		ListNode node2List2 = new ListNode(3,node3List2);
		ListNode node1List2 = new ListNode(1,node2List2);
		
		ListNode mergedList = sol.mergeTwoLists(node1List1, node1List2);
		ListNode currNode = mergedList;
		while (currNode != null) {
            System.out.print(currNode.val + " ");
            currNode = currNode.next;
        }
	}
}
