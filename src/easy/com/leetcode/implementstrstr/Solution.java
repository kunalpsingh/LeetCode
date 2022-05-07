/*

28. Implement strStr()

Implement strStr().

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 
*/

package easy.com.leetcode.implementstrstr;

public class Solution {
	public int strStr(String haystack, String needle) {
		int index=0;
		int ctr=0;
        if(needle.length()<=0)
        	return 0;
        else {
        	int i=0;
        	for(i=0;i<haystack.length();i++) {
        		if(ctr==needle.length())
        			break;
        		if(needle.charAt(ctr)==haystack.charAt(i))
        			ctr++;
        		else {
        			i-=ctr;
        			ctr=0;
        		}
        	}
        	if(ctr!=needle.length())
        		return -1;
        	else
        		index = i-ctr;
        }
        return index;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.strStr("mississippi", "issip"));
	}
}
