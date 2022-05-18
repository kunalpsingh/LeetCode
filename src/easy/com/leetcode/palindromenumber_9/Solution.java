/*
9. Palindrome Number

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1

Follow up: Could you solve it without converting the integer to a string?
 */

package easy.com.leetcode.palindromenumber_9;

public class Solution {
	public boolean isPalindrome(int x) {
		int num = x;
		if(num<0)
			return false;
		else {
			int revNum=0;
			while(num!=0) {
				revNum = revNum*10 + num%10;
				num=num/10;
			}
			if(x==revNum) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		System.out.println(sol.isPalindrome(121));
//		System.out.println(sol.isPalindrome(12321));
//		System.out.println(sol.isPalindrome(1234321));
//		System.out.println(sol.isPalindrome(-1234321));
//		System.out.println(sol.isPalindrome(123));
	}
}
