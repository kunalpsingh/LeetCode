package com.kunal.leetcode.array_and_string.easy._344_reverse_string;

//https://leetcode.com/problems/reverse-string/
//https://leetcode.com/problems/reverse-string/solutions/6824022/java-solution-beats-100-on-time-o1-space-j8nk/

public class Solution {
    public void reverseString(char[] s) {
        int start=0, last=s.length-1;
        char temp;
        while(start<last) {
            temp = s[start];
            s[start] = s[last];
            s[last] = temp;
            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseString(new char[]{'h','e','l','l','o'});
        solution.reverseString(new char[]{'H','a','n','n','a','h'});
    }
}
