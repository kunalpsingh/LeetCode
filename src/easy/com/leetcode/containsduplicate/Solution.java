/*

217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109

*/

package easy.com.leetcode.containsduplicate;

import java.util.HashMap;

public class Solution {
	public boolean containsDuplicate(int[] nums) {
		if(nums.length==0) {
			return false;
		}
        HashMap<Integer, Integer> numMap = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
        	if(numMap.get(nums[i])==null) {
        		numMap.put(nums[i], 1);
        	} else {
        		return true;
        	}
        }
		return false;
    }
	public static void main(String[] args) {
		Solution sol = new Solution();
		//int arr[] = {1,2,3,1};
		//int arr[] = {1,2,3,4};
		int arr[] = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(sol.containsDuplicate(arr));
	}
}
