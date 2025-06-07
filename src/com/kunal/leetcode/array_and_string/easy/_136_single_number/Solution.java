package com.kunal.leetcode.array_and_string.easy._136_single_number;

//https://leetcode.com/problems/single-number/description/
//https://leetcode.com/problems/single-number/solutions/6819384/java-solution-beats-99-9-o-n-time-o-1-space/

public class Solution {
    public int singleNumber(int[] nums) {
        int num=0;
        for(int n : nums) {
            num = num ^ n;
        }
        return num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(new int[]{2,2,1}));
        System.out.println(solution.singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(solution.singleNumber(new int[]{1}));
    }
}
