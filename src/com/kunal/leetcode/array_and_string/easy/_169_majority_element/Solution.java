package com.kunal.leetcode.array_and_string.easy._169_majority_element;

//https://leetcode.com/problems/majority-element/

public class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Found a new candidate
            }
            count += (num == candidate) ? 1 : -1; // Increment or decrement count
        }
        return candidate; // Return the majority element
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{3, 2, 3})); // Output: 3
        System.out.println(solution.majorityElement(new int[]{2, 2, 1, 1, 2, 2, 2, 3, 3, 2})); // Output: 2
    }
}
