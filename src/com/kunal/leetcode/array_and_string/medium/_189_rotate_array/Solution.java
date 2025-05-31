package com.kunal.leetcode.array_and_string.medium._189_rotate_array;

//https://leetcode.com/problems/rotate-array/

import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length>1) {
            k = k%nums.length;
            int[] nums2 = Arrays.copyOf(nums, nums.length);
            for(int i = 0; i < k; i++) {
                nums[i] = nums2[nums.length-k+i];
            }
            for(int i = k, j=0; i < nums.length; i++, j++) {
                nums[i] = nums2[j];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.rotate(new int[]{1,2,3,4,5,6,7}, 3);
        solution.rotate(new int[]{-1,-100,3,99}, 2);
        solution.rotate(new int[]{1,2}, 3);
    }
}
