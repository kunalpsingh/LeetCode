package com.kunal.leetcode.math.easy._9_palindrome_number;

//https://leetcode.com/problems/palindrome-number/
//https://leetcode.com/problems/palindrome-number/solutions/6820334/java-solution-beats-100-ologn-time-o1-sp-sxy4/

public class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        if(num<0)
            return false;
        int rev = 0;
        while(num>0) {
            rev = rev*10 + num%10;
            num = num/10;
        }
        return rev == x;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
    }
}
