/*

58. Length of Last Word

Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
 
*/

package easy.com.leetcode.lengthoflastword;

import java.util.Arrays;

public class Solution {
	public int lengthOfLastWord(String s) {
		if(s==null)
			return 0;
        String[] strArray = s.split(" ");
        if(strArray.length>0)
        	return strArray[strArray.length-1].length();
        else
        	return 0;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.lengthOfLastWord("Hello World"));
		System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  "));
		System.out.println(sol.lengthOfLastWord("luffy is still joyboy"));
	}
}
