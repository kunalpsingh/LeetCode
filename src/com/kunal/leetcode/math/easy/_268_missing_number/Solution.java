package com.kunal.leetcode.math.easy._268_missing_number;

//https://leetcode.com/problems/missing-number/
//https://leetcode.com/problems/missing-number/solutions/6837119/java-solution-beats-100-using-xor-on-tim-zou1/

public class Solution {
    public int missingNumber(int[] nums) {
        int missingNumber = 0;
        for(int i = 0; i<nums.length; i++) {
            missingNumber = missingNumber^(i+1)^nums[i];
        }
        return missingNumber;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(new int[]{3,0,1}));
        System.out.println(solution.missingNumber(new int[]{0,1}));
        System.out.println(solution.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
