/*

7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1

*/

package medium.com.leetcode.reverseinteger_7;

public class Solution {
	public int reverse(int x) {
		int revNum = 0;
        String str = Integer.toString(x);
        StringBuffer sb = new StringBuffer();
        if(str.contains("-")) {
        	sb.append(str.substring(1));
        	sb.reverse();
        	sb.insert(0, "-");
        } else {
        	sb.append(str);
        	sb.reverse();
        }
        try {
        	revNum = Integer.parseInt(sb.toString());
        	return revNum;
        }catch(NumberFormatException e) {
        	return 0;
        }
    }
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.reverse(123));
		System.out.println(sol.reverse(-123));
		System.out.println(sol.reverse(120));
		System.out.println(sol.reverse(2147483647));
	}
}
