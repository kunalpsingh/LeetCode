package com.kunal.leetcode.array_and_string.easy._88_merge_sorted_array;

//https://leetcode.com/problems/merge-sorted-array/
//https://leetcode.com/problems/merge-sorted-array/solutions/6799567/java-solution-space-o-1-explained/

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1;
        int j = n -1;
        int k = m + n - 1;
        while(i>=0 && j>=0) {
            if(nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while(j>=0) {
            nums1[k--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        solution.merge(new int[]{1}, 1, new int[]{}, 0);
        solution.merge(new int[]{0}, 0, new int[]{1}, 1);
    }
}
