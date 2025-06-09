package com.kunal.leetcode.math.easy._412_fizz_buzz;

//https://leetcode.com/problems/fizz-buzz/
//https://leetcode.com/problems/fizz-buzz/solutions/6826032/java-solution-beats-998-on-time-on-space-cvtw/

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> sol = new LinkedList<>();
        for(int i=1;i<=n;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sol.add("FizzBuzz");
            } else if(i % 3 == 0) {
                sol.add("Fizz");
            } else if(i % 5 == 0) {
                sol.add("Buzz");
            } else {
                sol.add(String.valueOf(i));
            }
        }
        return sol;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.fizzBuzz(3);
        solution.fizzBuzz(5);
        solution.fizzBuzz(15);
    }
}
