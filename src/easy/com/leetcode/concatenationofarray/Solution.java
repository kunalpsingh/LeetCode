/*

1929. Concatenation of Array

Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

 

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 

Constraints:

n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000

*/

package easy.com.leetcode.concatenationofarray;

import java.util.Arrays;

public class Solution {
	public int[] getConcatenation(int[] nums) {
        if(nums.length<=0) {
        	return null;
        }
        int[] finalArray = new int[nums.length*2];
        int index=0;
        for(int i=1;i<3;i++) {
        	for(int num: nums) {
        		finalArray[index] = num;
        		index++;
        	}
        }
        return finalArray;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		//int[] arr = {1,2,1};
		int[] arr = {1,3,2,1};
		int[] result = sol.getConcatenation(arr);
		System.out.println(Arrays.toString(result));
	}
}
