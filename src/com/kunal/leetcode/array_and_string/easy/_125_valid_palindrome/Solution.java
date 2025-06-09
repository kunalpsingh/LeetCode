package com.kunal.leetcode.array_and_string.easy._125_valid_palindrome;

//https://leetcode.com/problems/valid-palindrome/


public class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuffer rev = new StringBuffer(s).reverse();
        if(s.equals(rev.toString()))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome("race a car"));
    }
}
