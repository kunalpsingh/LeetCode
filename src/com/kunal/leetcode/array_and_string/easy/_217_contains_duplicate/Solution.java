package com.kunal.leetcode.array_and_string.easy._217_contains_duplicate;

//https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;
import java.util.Set;
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums) {
            if(!numsSet.add(num))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(solution.containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
