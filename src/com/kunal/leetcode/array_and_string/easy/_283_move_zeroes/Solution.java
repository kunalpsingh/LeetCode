package com.kunal.leetcode.array_and_string.easy._283_move_zeroes;

//https://leetcode.com/problems/move-zeroes/
//https://leetcode.com/problems/move-zeroes/solutions/6819851/java-solution-on-time-o1-space-explained-0vij/

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        int curr = 0;
        int temp;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
                curr++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.moveZeroes(new int[]{0,1,0,3,12});
        solution.moveZeroes(new int[]{0});
    }
}
