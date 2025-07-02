package com.kunal.leetcode.stack.medium._739_daily_temperatures;

//https://leetcode.com/problems/daily-temperatures/
//https://leetcode.com/problems/daily-temperatures/solutions/6912804/java-solution-stack-based-solution-on-ti-pu3k/

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] output = new int[size];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<size; i++) {
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                output[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return output;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] temperatures = new int[] {73,74,75,71,69,72,76,73};
        Arrays.stream(solution.dailyTemperatures(temperatures)).forEach(System.out::println);

    }
}
