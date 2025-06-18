package com.kunal.leetcode.array_and_string.medium._34_find_first_and_last_position_of_element_in_sorted_array;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/post-solution/6858020/

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) {
            return new int[]{-1, -1};
        }
        if(nums.length==1) {
            if(nums[0] == target)
                return new int[]{0, 0};
            else
                return new int[]{-1, -1};
        }
        int idx=Integer.MIN_VALUE;
        int low = 0, high = nums.length-1;
        int mid = (low + high)/2;
        while(low<=high) {
            mid = (low + high)/2;
            if(nums[mid]==target) {
                idx = mid;
                break;
            } else if(nums[mid]<target) {
                low = mid + 1;
            } else {
                high = mid-1;
            }
        }
        if(idx == Integer.MIN_VALUE)
            return new int[]{-1, -1};
        int i = idx, j = idx;
        while(i>0 && (nums[i-1]==target)) {
            i--;
        }
        while(j<nums.length-1 && (nums[j+1]==target)) {
            j++;
        }
        return new int[]{i, j};
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] sol = new int[2];
        sol = solution.searchRange(new int[]{5,7,7,8,8,10}, 8);
        System.out.println(sol[0] + " " + sol[1]);
        sol = solution.searchRange(new int[]{5,7,7,8,8,10}, 6);
        System.out.println(sol[0] + " " + sol[1]);
        sol = solution.searchRange(new int[]{}, 0);
        System.out.println(sol[0] + " " + sol[1]);
    }
}
