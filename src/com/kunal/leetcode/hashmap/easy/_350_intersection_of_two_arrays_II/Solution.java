package com.kunal.leetcode.hashmap.easy._350_intersection_of_two_arrays_II;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
//https://leetcode.com/problems/intersection-of-two-arrays-ii/solutions/6820140/java-solution-hash-map-omn-time-omk-spac-7us7/

import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Map = new HashMap<>();
        List<Integer> solList = new ArrayList<>();
        for (int num : nums1) {
            nums1Map.merge(num, 1, Integer::sum);
        }
        for(int num : nums2) {
            if(nums1Map.get(num)!=null && nums1Map.get(num)>0) {
                solList.add(num);
                nums1Map.put(num, nums1Map.get(num)-1);
            }
        }
        return solList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.intersect(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(solution.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
