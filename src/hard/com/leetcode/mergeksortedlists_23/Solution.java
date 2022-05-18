/*

23. Merge k Sorted lists

You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

 

Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output: []
 

Constraints:

k == lists.length
0 <= k <= 104
0 <= lists[i].length <= 500
-104 <= lists[i][j] <= 104
lists[i] is sorted in ascending order.
The sum of lists[i].length will not exceed 104.

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


package hard.com.leetcode.mergeksortedlists_23;

import java.util.PriorityQueue;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists==null||lists.length==0) return null;
        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(lists.length ,(a,b) -> a.val-b.val);
        ListNode finalSortedList = new ListNode(0);
        ListNode tail=finalSortedList;
        
        for (ListNode node:lists)
            if (node!=null)
                queue.add(node);
            
        while (!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;
            
            if (tail.next!=null)
                queue.add(tail.next);
        }
        return finalSortedList.next;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		ListNode node3List1 = new ListNode(5);
		ListNode node2List1 = new ListNode(4,node3List1);
		ListNode node1List1 = new ListNode(1,node2List1);
		
		ListNode node3List2 = new ListNode(4);
		ListNode node2List2 = new ListNode(3,node3List2);
		ListNode node1List2 = new ListNode(1,node2List2);
		
		ListNode node3List3 = new ListNode(8);
		ListNode node2List3 = new ListNode(6,node3List3);
		ListNode node1List3 = new ListNode(2,node2List3);
		
		ListNode[] lists = new ListNode[3];
		lists[0] = node1List1;
		lists[1] = node1List2;
		lists[2] = node1List3;
		
		ListNode mergedList = sol.mergeKLists(lists);
		ListNode currNode = mergedList;
		while (currNode != null) {
            System.out.print(currNode.val + " ");
            currNode = currNode.next;
        }
	}
}
