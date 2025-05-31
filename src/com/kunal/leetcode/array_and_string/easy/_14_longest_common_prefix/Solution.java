package com.kunal.leetcode.array_and_string.easy._14_longest_common_prefix;

//https://leetcode.com/problems/longest-common-prefix/

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix)!=0) {
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // Output: "fl"
        System.out.println(solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"})); // Output: ""
        System.out.println(solution.longestCommonPrefix(new String[]{"a"})); // Output: "a"
        System.out.println(solution.longestCommonPrefix(new String[]{})); // Output: ""
    }
}
