/*

136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
 
*/
package easy.com.leetcode.singlenumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int singleNumber(int[] nums) {
//        int num=0;
//        if(nums.length>0) {
//        	Map<Integer, Integer> m = new HashMap<>(); 
//            for(int n : nums) {
//            	if(m.get(n)!=null)
//            		m.put(n, 2);
//            	else
//            		m.put(n, 1);
//            }
//            for(int key : m.keySet()) {
//            	if(m.get(key)==1)
//            		num = key;
//            }
//        }
//        return num;
		
		int num = 0;
		if(nums.length>0) {
			for(int n: nums) {
				num = num^n;
			}
		}
		return num;
    }
	public static void main(String[] args) {
		Solution sol = new Solution();
		int nums[] = {4,1,2,1,2};
		System.out.println(sol.singleNumber(nums));
	}
}
