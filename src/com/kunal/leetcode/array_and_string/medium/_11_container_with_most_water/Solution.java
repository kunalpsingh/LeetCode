package com.kunal.leetcode.array_and_string.medium._11_container_with_most_water;

//https://leetcode.com/problems/container-with-most-water/
//https://leetcode.com/problems/container-with-most-water/solutions/6820913/java-solution-on-time-on-space-explained-4qqt/

public class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int maxArea = 0, area = 0;
        while(i<j) {
            area = Math.min(height[i], height[j])*(j-i);
            maxArea = Math.max(maxArea, area);
            if(height[i]>=height[j])
                j--;
            else
                i++;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(solution.maxArea(new int[]{1,1}));
    }
}
