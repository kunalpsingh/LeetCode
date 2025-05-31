package com.kunal.leetcode.array_and_string.easy._27_remove_element;

//https://leetcode.com/problems/remove-element/

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j=0;j<nums.length;j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(solution.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
