package com.kunal.leetcode.array_and_string.easy._66_plus_one;

//https://leetcode.com/problems/plus-one/
//https://leetcode.com/problems/plus-one/solutions/6819690/java-solution-beats-100-on-timeworst-cas-6y3r/

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        int lstIdx = digits.length-1;
        if(digits[lstIdx]!=9){
            digits[lstIdx] = digits[lstIdx] + 1;
            return digits;
        } else {
            for(int i=lstIdx; i>=0;i--) {
                if(digits[i]!=9) {
                    digits[i] = digits[i]+1;
                    for(int j=i+1;j<=lstIdx;j++) {
                        digits[j]=0;
                    }
                    return digits;
                }
            }
        }
        int[] solForAll9 = new int[digits.length+1];
        solForAll9[0] = 1;
        return solForAll9;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Arrays.stream(solution.plusOne(new int[]{1, 2, 3})).forEach(System.out::print);
        System.out.println("");
        Arrays.stream(solution.plusOne(new int[]{4,3,2,1})).forEach(System.out::print);
        System.out.println("");
        Arrays.stream(solution.plusOne(new int[]{9})).forEach(System.out::print);
        System.out.println("");
        Arrays.stream(solution.plusOne(new int[]{9,9})).forEach(System.out::print);
        System.out.println("");
        Arrays.stream(solution.plusOne(new int[]{8,9,9,9})).forEach(System.out::print);
    }
}
