/*

5. Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.

*/

package medium.com.leetcode.longestpalindromicsubstring;


public class Solution {
	public String longestPalindrome(String s) {
		int[] maxStart = new int[1], maxEnd = new int[1]; // use array in order to pass by reference instead of pass by value
        
        for (int i = 0; i < s.length()-1; i++) {
            extend(s, i, i, maxStart, maxEnd);    
            extend(s, i, i+1, maxStart, maxEnd);
        }
        return s.substring(maxStart[0], maxEnd[0]+1);
    }
	
	private void extend(String s, int i, int j, int[] maxStart, int[] maxEnd) {
        // loop until meet invalid match
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--; j++; 
        }
        i++; j--; // back to the last valid match
        if (j - i + 1 > maxEnd[0] - maxStart[0] + 1) {
            maxStart[0] = i;
            maxEnd[0] = j;
        }
        
    }
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.longestPalindrome("babad"));
		System.out.println(sol.longestPalindrome("cbbd"));
	}
}
