package com.kunal.leetcode.array_and_string.medium._735_asteroid_collision;

//https://leetcode.com/problems/asteroid-collision/
//https://leetcode.com/problems/asteroid-collision/solutions/6821295/java-solution-beats-85-on-time-on-space-re1xk/

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : asteroids) {
            boolean destroyed = false;

            // Process potential collisions only if num is moving left and top is moving right
            while (!stack.isEmpty() && num < 0 && stack.peekLast() > 0) {
                if (stack.peekLast() < -num) {
                    stack.pollLast(); // Top asteroid is smaller, pop and continue
                } else if (stack.peekLast() == -num) {
                    stack.pollLast(); // Both destroy each other
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; // Incoming asteroid is smaller, it's destroyed
                    break;
                }
            }

            if (!destroyed) {
                stack.offerLast(num);
            }
        }

        // Convert deque to array
        return stack.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.asteroidCollision(new int[]{5,10,-5})));
        System.out.println(Arrays.toString(solution.asteroidCollision(new int[]{8,-8})));
        System.out.println(Arrays.toString(solution.asteroidCollision(new int[]{10,2,-5})));
        System.out.println(Arrays.toString(solution.asteroidCollision(new int[]{-2,-1,1,2})));
    }
}
