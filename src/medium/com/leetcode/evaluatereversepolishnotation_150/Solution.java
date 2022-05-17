/*

150. Evaluate Reverse Polish Notation

Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, and /. Each operand may be an integer or another expression.

Note that division between two integers should truncate toward zero.

It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.

 

Example 1:

Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
Example 2:

Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
Example 3:

Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
Output: 22
Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
 

Constraints:

1 <= tokens.length <= 104
tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].

*/

package medium.com.leetcode.evaluatereversepolishnotation_150;

import java.util.Stack;

public class Solution {
	public int evalRPN(String[] tokens) {
        int result = 0;
        Stack<String> st = new Stack<String>();
        if(tokens.length==0) {
        	return 0;
        } else if(tokens.length==1)
        	return Integer.parseInt(tokens[0]);
        else {
        	for(int i=0;i<tokens.length;i++) {
        		if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
        			st.push(tokens[i]);
        		} else {
        			String operator = tokens[i];
        			int num1 = Integer.parseInt(st.pop());
        			int num2 = Integer.parseInt(st.pop());
        			if(operator.equals("+")) {
        				result = num2 + num1;
        				st.push(String.valueOf(result));
        			}
        			else if(operator.equals("-")) {
        				result = num2 - num1;
        				st.push(String.valueOf(result));
        			}
        			else if(operator.equals("*")) {
        				result = num2 * num1;
        				st.push(String.valueOf(result));
        			}
        			else if(operator.equals("/")) {
        				result = num2 / num1;
        				st.push(String.valueOf(result));
        			}
        		}
        	}
        }
		return result;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		//String[] tokens = {"2","1","+","3","*"};
		//String[] tokens = {"4","13","5","/","+"};
		String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		System.out.println(sol.evalRPN(tokens));
	}
}
