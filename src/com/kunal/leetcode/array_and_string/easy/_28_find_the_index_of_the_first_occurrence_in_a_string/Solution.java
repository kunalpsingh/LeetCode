package com.kunal.leetcode.array_and_string.easy._28_find_the_index_of_the_first_occurrence_in_a_string;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())
            return -1;
        if(haystack.equals(needle))
            return 0;
        for(int i = 0; i <= haystack.length()-needle.length(); i++) {
            if(haystack.substring(i, needle.length()+i).equals(needle))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("sadbutsad", "sad"));
        System.out.println(solution.strStr("leetcode", "leeto"));
        System.out.println(solution.strStr("mississippi", "issip"));
    }
}
