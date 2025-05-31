package com.kunal.leetcode.array_and_string.easy._13_roman_to_integer;

//https://leetcode.com/problems/roman-to-integer/

public class Solution {
    public int romanToInt(String s) {
        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            } else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "MCMXCIV"; // Example input
        int result = solution.romanToInt(s);
        System.out.println("The integer value of the Roman numeral " + s + " is: " + result);
    }
}
