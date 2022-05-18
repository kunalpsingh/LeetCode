/*

11. Container With Most Water

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104

 */

package medium.com.leetcode.containerwithmostwater_11;

public class Solution {
	public int maxArea(int[] height) {
        int maxArea=0, i=0,j=height.length-1;
		if(height.length<2)
			return 0;
		
		while(i<j) {
			maxArea = Math.max(maxArea, Math.min(height[i], height[j])*(j-i));
			if(height[i]<height[j])
				i++;
			else
				j--;
		}
		
		return maxArea;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		//int[] height = {1,8,6,2,5,4,8,3,7};
		//int[] height = {1,1};
		//int[] height = {2,3,10,5,7,8,9};
		int[] height = {2,3,4,5,18,17,6};
		System.out.println(sol.maxArea(height));
	}
}
