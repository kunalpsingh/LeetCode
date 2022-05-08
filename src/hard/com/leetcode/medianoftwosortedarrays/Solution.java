/*

4. Median of Two Sorted Arrays
 
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 
*/

package hard.com.leetcode.medianoftwosortedarrays;

import java.util.Arrays;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] nums3 = new int[nums1.length+nums2.length];
		int i=0, j=0, k=0;
		while(nums1.length>0 && nums2.length>0 && i<nums1.length && j<nums2.length) {
			if(nums1[i]<nums2[j])
				nums3[k++] = nums1[i++];
			else
				nums3[k++] = nums2[j++];
		}
		while(i<nums1.length)
			nums3[k++] = nums1[i++];
		
		while(j<nums2.length)
			nums3[k++] = nums2[j++];
		double median=0;
		if(nums3.length%2==1)
			return (double)nums3[(nums3.length/2)];
		else
			return ((double)nums3[(nums3.length/2)-1] + (double)nums3[(nums3.length/2)])/2;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int nums1[] = {1,3,5,7,9,11};
		int nums2[] = {2,4,6,8,10,12};
		System.out.println(sol.findMedianSortedArrays(nums1, nums2));
	}
}
