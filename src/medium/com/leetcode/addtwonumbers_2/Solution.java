/*

2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.


Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.

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

package medium.com.leetcode.addtwonumbers_2;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/*
 * The trick to solve it is by iterating through both the list one
 * node at a time and calculating the sum of values of node from both list.
 * Ex. sum = l1.val + l2.val. 
 * This sum can be more than 9 i.e. double digit. So we will create the result
 * node with ones digit from sum and save the carry in an integer variable to add
 * it in next calculation.
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		/*
		 * Create two nodes one will act as head which will be returned as solution
		 * and other will be act as current node on which we are operating.
		 * Also declare an int variable to save the carry from sum of values from nodes
		 * l1 and l2.
		 */
		ListNode node=null,currNode=null;
		int carry=0;
		
		/*
		 * If one of the list is null then no point in calculating sum.
		 * Simply return the list which is not null.
		 */
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		
		while(true) {
			/*
			 * Create one node of result list and two int variable(initialized to 0) 
			 * to save l1.val and l2.val.
			 */
			ListNode nd = new ListNode();
			int num1=0,num2=0;
			
			/*
			 *If l1 or l2 are not null then save the node val in variables. 
			 */
			if(l1!=null)
				num1 = l1.val;
			if(l2!=null)
				num2 = l2.val;
			
			/*
			 * Save unit digit in resultList node and carry in variable carry.
			 */
			nd.val = (num1 + num2 + carry)%10;
			carry = (num1 + num2 + carry)/10;
			
			/*
			 * Go to next node if current node is not null. If next node does not
			 * exist then l1 or l2 will become null which helps in calculations.
			 */
			if(l1!=null)
				l1 = l1.next;
			if(l2!=null)
				l2 = l2.next;
			
			/*
			 * Initialize result list node(both current and head) if its null
			 * If head is not null then link currNode to new node and move
			 * currNode ahead.
			 */
			if(node==null) {
				node = nd;
				currNode = nd;
			} else {
				currNode.next = nd;
				currNode = currNode.next;
			}
			
			/*
			 * Since this is an infinite loop there must be break condition
			 * which is when l1, l2 and carry(becomes 0) all becomes null.
			 * This means there is no further processing needed.
			 */
			if(l1==null && l2==null && carry==0)
				break;
				
		}
		return node;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode node6 = new ListNode(9);
		ListNode node5 = new ListNode(9,node6);
		ListNode node4 = new ListNode(9,node5);
		ListNode node3 = new ListNode(9,node4);
		ListNode node2 = new ListNode(9,node3);
		ListNode node1 = new ListNode(9,node2);
		ListNode node7 = new ListNode(9,node1);
		ListNode node8 = new ListNode(9,node7);
		ListNode node9 = new ListNode(9,node8);
		ListNode node10 = new ListNode(1,node9);
		
		ListNode node11 = new ListNode(9);
		ListNode sumList = sol.addTwoNumbers(node10, node11);
		ListNode currNode = sumList;
		while (currNode != null) {
            System.out.print(currNode.val + " ");
            currNode = currNode.next;
        }
	}
}
