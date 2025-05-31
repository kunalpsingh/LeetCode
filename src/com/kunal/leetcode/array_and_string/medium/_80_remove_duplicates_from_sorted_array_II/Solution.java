package com.kunal.leetcode.array_and_string.medium._80_remove_duplicates_from_sorted_array_II;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int i = 2;
        for (int j = 2; j < nums.length; j++) {
            // If the current element is not a duplicate of the last two elements
            if (nums[j] != nums[i - 2]) {
                nums[i++] = nums[j]; // Place it in the next position
            }
        }
        return i; // Return the new length of the array
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(new int[]{1,1,1,2,2,3})); // Output: 5
        System.out.println(solution.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3})); // Output: 7
    }
}
