/*

49. Group Anagrams

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 

Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.

*/

package medium.com.leetcode.groupanagrams_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		if(strs==null || strs.length==0) return null;
		Map<String, List<String>> map = new HashMap<>();
		for(String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String str = String.valueOf(ch);
			if(!map.containsKey(str)) map.put(str, new ArrayList<String>());
			map.get(str).add(s);
		}
		return new ArrayList<List<String>>(map.values());
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String str[] = {"eat","tea","tan","ate","nat","bat"};
		sol.groupAnagrams(str);
	}
}
