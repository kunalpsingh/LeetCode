package com.kunal.leetcode.array_and_string.easy._3423_maximum_difference_between_adjacent_elements_in_a_circular_array;

//https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/
//https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/solutions/6837365/java-solution-beats-99-o-n-time-o-1-space-explained/?envType=daily-question&envId=2025-06-12

public class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDistance = Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++) {
            maxDistance = Math.max(Math.abs(nums[i]-nums[i+1]), maxDistance);
        }
        maxDistance = Math.max(Math.abs(nums[0]-nums[nums.length-1]), maxDistance);
        return maxDistance;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxAdjacentDistance(new int[]{1,2,4}));
        System.out.println(solution.maxAdjacentDistance(new int[]{-5,-10,-5}));
    }
}
