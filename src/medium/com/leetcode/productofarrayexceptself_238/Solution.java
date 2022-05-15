/*

238. Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)

*/

package medium.com.leetcode.productofarrayexceptself_238;

import java.math.BigInteger;
import java.util.Arrays;

public class Solution {
	public int[] productExceptSelf(int[] nums) {
		int[] res = new int[nums.length];
		Arrays.fill(res, 1);
		
		int left = 1;
		for(int i=0;i<nums.length;i++) {
			res[i]*=left;
			left*=nums[i];
		}
		
		int right = 1;
		for(int i=nums.length-1;i>=0;i--) {
			res[i]*=right;
			right*=nums[i];
		}
		return res;
    }
	public static void main(String[] args) {
		Solution sol = new Solution();
		//int[] nums = {1,2,3,4};
		int[] nums = {-1,1,0,-3,3};
		int[] res = sol.productExceptSelf(nums);
		System.out.println(Arrays.toString(res));
	}
}
