/*
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.

*/

package easy.com.leetcode.longestcommonprefix_14;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder();
		boolean check = false;
		sb.append("");
		for(int i=0;i<strs[0].length();i++) {
			check = false;
			for(String str : strs) {
				if(i<str.length() && str.charAt(i) == strs[0].charAt(i)) {
					check = true;
				}
				else {
					check = false;
					return sb.toString();
				}
			}
			if(check==true)
				sb.append(strs[0].charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] strs = {"flower", "flow", "flight"};
//		String[] strs = {"dog", "racecar", "car"};
//		String[] strs = {"ab", "a"};
		System.out.println(sol.longestCommonPrefix(strs));
	}
}
