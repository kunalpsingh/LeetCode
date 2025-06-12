package com.kunal.leetcode.array_and_string.medium._75_sort_colors;

//https://leetcode.com/problems/sort-colors/
//https://leetcode.com/problems/sort-colors/solutions/6837559/java-solution-beats-100-time-o-n-space-o-1-explained/

import java.util.Arrays;

public class Solution {
    public void sortColors(int[] nums) {
        int[] numCount = new int[3];
        for(int num : nums) {
            numCount[num]++;
        }
        int j = 0;
        Arrays.fill(nums, 0, numCount[0], 0);
        Arrays.fill(nums, numCount[0], numCount[0] + numCount[1], 1);
        Arrays.fill(nums, numCount[0] + numCount[1], numCount[0] + numCount[1] + numCount[2], 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sortColors(new int[]{2,0,2,1,1,0});
        solution.sortColors(new int[]{2,0,1});
    }
}
