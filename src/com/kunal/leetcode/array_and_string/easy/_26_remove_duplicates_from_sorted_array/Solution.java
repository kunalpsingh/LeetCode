package com.kunal.leetcode.array_and_string.easy._26_remove_duplicates_from_sorted_array;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1;j<nums.length; j++) {
            if(nums[i]!=nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(new int[]{1, 1, 2})); // Output: 2
        System.out.println(solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4})); // Output: 5
    }
}
