/*
1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.*/


package easy.com.leetcode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numsMap = new HashMap<>();
		int[] result = new int[2];
		for(int i=0;i<nums.length;i++) {
			int diff = target - nums[i];
			if(numsMap.containsKey(diff)) {
				result[0] = numsMap.get(diff);
				result[1] = i;
			} else {
				numsMap.put(nums[i], i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		
//		int[] nums = {3,2,4};
//		int target = 6;
//		
//		int[] nums = {3,3};
//		int target = 6;
		
		Solution sol = new Solution();
		System.out.println(Arrays.toString(sol.twoSum(nums,target)));
	}
}
