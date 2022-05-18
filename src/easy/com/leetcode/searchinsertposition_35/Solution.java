/*

35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104

*/

package easy.com.leetcode.searchinsertposition_35;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		int idx=0, min=0, max=nums.length-1;
		if(nums[nums.length-1]<=target)
			return nums.length;
		if(nums[0]>target)
			return 0;
		if(nums[0]==target)
			return 1;
		while(min<=max) {
			idx = min + (max - min)/2;
			if(nums[idx]==target)
				return idx;
			else if(nums[idx]>target)
        		max = idx-1;
        	else
        		min = idx+1;
		}
        return min;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int nums[] = {1,3,5,7,9,11,13};
		System.out.println(sol.searchInsert(nums, 12));
	}
}
