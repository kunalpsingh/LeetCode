/*
20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

*/

package easy.com.leetcode.validparentheses_20;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		boolean check = false;
		char[] strArray = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(char c : strArray) {
			if(c=='(' || c=='{' || c=='[')
				stack.push(c);
			else {
				if(stack.size()>0) {
					char poppedChar = stack.pop();
					if((poppedChar=='(' && c==')') || (poppedChar=='{' && c=='}') || (poppedChar=='[' && c==']'))
						check = true;
					else {
						check = false;
						break;
					}
				} else {
					check = false;
					break;
				}
			}
		}
		if(stack.isEmpty())
			return check;
		else
			return false;
    }
	
	public static void main(String args[]) {
		Solution sol = new Solution();
		System.out.println(sol.isValid("()"));
		System.out.println(sol.isValid("()[]{}"));
		System.out.println(sol.isValid("(]"));
		System.out.println(sol.isValid("}}}}"));
		System.out.println(sol.isValid("([]){"));
	}
}
