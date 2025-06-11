package com.kunal.leetcode.math.easy._191_number_of_1_bits;

//https://leetcode.com/problems/number-of-1-bits/
//https://leetcode.com/problems/number-of-1-bits/solutions/6834003/java-solution-beats-100-o-n-time-o-1-space-explained/

public class Solution {
    public int hammingWeight(int n) {
        int num=0;
        while(n!=0) {
            if(n%2==1)
                num++;
            n=n/2;
        }
        return num;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(11));
        System.out.println(solution.hammingWeight(128));
        System.out.println(solution.hammingWeight(2147483645));
    }
}
