package com.kunal.leetcode.math.easy._326_power_of_three;

//https://leetcode.com/problems/power-of-three/
//https://leetcode.com/problems/power-of-three/solutions/6826878/java-solution-best-mathematical-solution-o-1-time-o-1-space-explained/

public class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(27));
        System.out.println(solution.isPowerOfThree(0));
        System.out.println(solution.isPowerOfThree(-1));
    }
}
