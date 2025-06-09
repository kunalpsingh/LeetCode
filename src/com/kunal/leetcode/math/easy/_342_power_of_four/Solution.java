package com.kunal.leetcode.math.easy._342_power_of_four;

//https://leetcode.com/problems/power-of-four/
//https://leetcode.com/problems/power-of-four/solutions/6826953/java-solution-best-mathematical-solution-o-1-time-o-1-space-explained/

public class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 && 1073741824 % n == 0 && n%3==1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfFour(16));
        System.out.println(solution.isPowerOfFour(5));
        System.out.println(solution.isPowerOfFour(1));
        System.out.println(solution.isPowerOfFour(2));
    }
}
