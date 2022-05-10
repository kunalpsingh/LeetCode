/*

2264. Largest 3-Same-Digit Number in String

You are given a string num representing a large integer. An integer is good if it meets the following conditions:

It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.

Note:

A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.
 

Example 1:

Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".
Example 2:

Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.
Example 3:

Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.
 

Constraints:

3 <= num.length <= 1000
num only consists of digits.

*/

package contest.com.leetcode.weeklycontest292.largest3samedigitnumberinstring;

public class Solution {
	public String largestGoodInteger(String num) {
        int goodNum = 0;
        boolean goodNumExist=false;
        for(int i=0;i<num.length()-2;i++) {
            String s = num.substring(i, i+3);
            if(goodNum<=Integer.parseInt(s) && s.charAt(0)==s.charAt(1) && s.charAt(0)==s.charAt(2)) {
            	goodNum = Integer.parseInt(s);
            	goodNumExist = true;
            }
            	
        }
        if(goodNumExist)
        	return goodNum==0?"000":Integer.toString(goodNum);
        else
        	return "";
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.largestGoodInteger("2300019"));
	}
}
