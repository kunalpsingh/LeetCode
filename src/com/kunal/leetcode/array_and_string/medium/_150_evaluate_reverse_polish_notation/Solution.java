package com.kunal.leetcode.array_and_string.medium._150_evaluate_reverse_polish_notation;

//https://leetcode.com/problems/evaluate-reverse-polish-notation/
//https://leetcode.com/problems/evaluate-reverse-polish-notation/solutions/6855244/java-solution-beats-97-on-time-on-space-pprsx/

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();
        int result = 0, num1, num2;
        if(tokens.length==1) {
            result = Integer.parseInt(tokens[0]);
        } else {
            for(String token : tokens) {
                switch (token) {
                    case "+" :
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        result = num1 + num2;
                        numStack.push(result);
                        break;
                    case "-" :
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        result = num2 - num1;
                        numStack.push(result);
                        break;
                    case "*" :
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        result = num1 * num2;
                        numStack.push(result);
                        break;
                    case "/" :
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        result = num2 / num1;
                        numStack.push(result);
                        break;
                    default:
                        numStack.push(Integer.parseInt(token));
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(solution.evalRPN(new String[]{"4","13","5","/","+"}));
        System.out.println(solution.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
