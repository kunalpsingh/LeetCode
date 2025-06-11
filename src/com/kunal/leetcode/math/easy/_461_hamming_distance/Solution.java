package com.kunal.leetcode.math.easy._461_hamming_distance;

//https://leetcode.com/problems/hamming-distance/
//https://leetcode.com/problems/hamming-distance/solutions/6834038/java-solution-beats-100-o-1-time-o-1-space-explained/

public class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int distance = 0;

        while (xor != 0) {
            distance += xor & 1;
            xor >>= 1;
        }

        return distance;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingDistance(1, 4)); // Output: 2
        System.out.println(solution.hammingDistance(3, 1)); // Output: 1
        System.out.println(solution.hammingDistance(0, 0)); // Output: 0
    }
}
