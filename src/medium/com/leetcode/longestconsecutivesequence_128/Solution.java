/*

128. Longest Consecutive Sequence

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
 
*/

package medium.com.leetcode.longestconsecutivesequence_128;

import java.util.Arrays;

public class Solution {
	public int longestConsecutive(int[] nums) {
        int length = 1, maxLength = 1;
		if(nums.length==0)
        	return 0;
        else {
        	Arrays.sort(nums);
        	for(int i=0;i<nums.length-1;i++) {
        		if(nums[i+1]-nums[i]==1) {
        			length = length + 1;
        			if(length>=maxLength)
            			maxLength = length;
        		} else if(nums[i+1]==nums[i])
        			continue;
        		else {
        			length = 1;
        		}
        	}
        }
		return maxLength;
    }
	public static void main(String[] args) {
		Solution sol = new Solution();
		//int nums[] = {100,4,200,1,3,2};
		//int nums[] = {0,3,7,2,5,8,4,6,0,1};
		int nums[] = {1,2,0,1};
		System.out.println(sol.longestConsecutive(nums));
	}
}
