package com.kunal.leetcode.hashmap.easy._1_two_sum;

//https://leetcode.com/problems/two-sum/
//https://leetcode.com/problems/two-sum/solutions/6820302/java-solution-beats-100-on-time-on-space-z9mi/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            numsMap.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++) {
            int complement = target-nums[i];
            if(numsMap.containsKey(complement) && numsMap.get(complement)!=i) {
                sol[0] = i;
                sol[1] = numsMap.get(complement);
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
