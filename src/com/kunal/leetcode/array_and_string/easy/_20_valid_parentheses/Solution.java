package com.kunal.leetcode.array_and_string.easy._20_valid_parentheses;

//https://leetcode.com/problems/valid-parentheses/
//https://leetcode.com/problems/valid-parentheses/solutions/6836574/java-solution-on-time-on-space-explained-1etv/

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution
{
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        for (char c : s.toCharArray()) {
            if (bracketMap.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != bracketMap.get(c)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("[])"));
        System.out.println(solution.isValid("(])"));
        System.out.println(solution.isValid("(){}}{"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([])"));
        System.out.println(solution.isValid("}([])"));
    }
}
