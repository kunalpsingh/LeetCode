package com.kunal.leetcode.array_and_string.medium._8_string_to_integer;

//https://leetcode.com/problems/string-to-integer-atoi/
//https://leetcode.com/problems/string-to-integer-atoi/solutions/6825448/java-solution-on-time-o1-space-explained-54vt/

public class Solution {
    public int myAtoi(String s) {
        long num = 0;
        s = s.trim();
        if(s==null || s.equals(""))
            return 0;
        int i=0;
        if(s.charAt(0)=='-' || s.charAt(0)=='+') {
            i++;
        }
        for(;i<s.length();i++) {
            if(Character.isDigit(s.charAt(i))) {
                int numFromChar = Integer.parseInt(String.valueOf(s.charAt(i)));
                if(s.charAt(0)=='-')
                    num = num*10 - numFromChar;
                else
                    num = num*10 + numFromChar;
                if(num>Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if(num<Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }
            else
                break;
        }
        return (int)num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("21474836460"));
        System.out.println(solution.myAtoi("-91283472332"));
        System.out.println(solution.myAtoi("42"));
        System.out.println(solution.myAtoi("-042"));
    }
}
