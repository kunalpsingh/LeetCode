/*

3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

*/

package medium.com.leetcode.longestsubstringwithoutrepeatingcharacters_3;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		String subStr = "";
		String longestSubStr = "";
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				if(subStr.indexOf(s.charAt(j))==-1) {
					subStr = subStr + s.charAt(j);
				} else {
					if(subStr.length()>longestSubStr.length()) {
						longestSubStr = subStr;
						subStr = "";
					}
					break;
				}
			}
			if(subStr.length()>longestSubStr.length())
				longestSubStr = subStr;
			subStr = "";
		}
		return longestSubStr.length()>=subStr.length()? longestSubStr.length() : subStr.length();
		
		//Alternate solution
		
//		int result = 0;
//        int[] cache = new int[256];
//        for (int i = 0, j = 0; i < s.length(); i++) {
//            j = (cache[s.charAt(i)] > 0) ? Math.max(j, cache[s.charAt(i)]) : j;
//            cache[s.charAt(i)] = i + 1;
//            result = Math.max(result, i - j + 1);
//        }
//        return result;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		//System.out.println(sol.lengthOfLongestSubstring("abcabcbb"));
		//System.out.println(sol.lengthOfLongestSubstring("bbbbb"));
		//System.out.println(sol.lengthOfLongestSubstring("pwwkew"));
		//System.out.println(sol.lengthOfLongestSubstring("dvdf"));
		System.out.println(sol.lengthOfLongestSubstring("jbpnbwwd"));
	}
}
