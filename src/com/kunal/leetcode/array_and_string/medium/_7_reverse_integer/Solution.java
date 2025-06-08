package com.kunal.leetcode.array_and_string.medium._7_reverse_integer;

//https://leetcode.com/problems/reverse-integer/
//https://leetcode.com/problems/reverse-integer/solutions/6824141/java-solution-unique-solution-using-stri-a18j/


public class Solution {
    public int reverse(int x) {
        int revNum;
        String str = Integer.toString(x);
        StringBuffer sb = new StringBuffer();
        if(str.contains("-")) {
            sb.append(str.substring(1));
            sb.reverse();
            sb.insert(0, '-');
        } else {
            sb.append(str);
            sb.reverse();
        }
        try {
            revNum = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        return revNum;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120));
        System.out.println(solution.reverse(1534236469));
    }
}
