/*

242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

*/

package easy.com.leetcode.validanagram;

import java.util.Arrays;

public class Solution {
	public boolean isAnagram(String s, String t) {
		if(s==null || t == null || s.length()!=t.length()) {
			return false;
		}
		if(s.equals(t))
			return true;
		
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        s = String.valueOf(ch);
        
        ch = t.toCharArray();
        Arrays.sort(ch);
        t= String.valueOf(ch);
        
        if(s.equals(t))
        	return true;
		return false;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.isAnagram("anagram", "nagaram"));
		System.out.println(sol.isAnagram("rat", "car"));
	}
}
