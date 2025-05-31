package com.kunal.leetcode.array_and_string.easy._58_length_of_last_word;

//https://leetcode.com/problems/length-of-last-word/

public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        if(lastSpaceIndex == -1) {
            return s.length();
        }
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy")); // Output: 6
    }
}
