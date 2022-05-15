/*

347. Top K Frequent Elements

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
 

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 
*/

package medium.com.leetcode.topkfrequentelements_347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> numsMap = new HashMap<>();
		ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
        	if(numsMap.get(nums[i])==null)
        		numsMap.put(nums[i], 1);
        	else
        		numsMap.put(nums[i], (numsMap.get(nums[i])+1));
        }
        numsMap.entrySet().stream().sorted((k1,k2) -> -k1.getValue().compareTo(k2.getValue())).forEach(n -> arr.add(n.getKey()));
        int[] res = new int[k];
        int count = 0;
        while(count<k) {
        	res[count] = arr.get(count);
        	count++;
        }
        return res;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums  = {3,1,1,2,2,3,4,4,4,4,4,4,4,1,1,2};
		sol.topKFrequent(nums, 2);
	}
}
