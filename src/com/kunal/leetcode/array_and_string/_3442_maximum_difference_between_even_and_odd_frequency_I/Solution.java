package com.kunal.leetcode.array_and_string._3442_maximum_difference_between_even_and_odd_frequency_I;

//https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/
//https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/solutions/6830953/java-solution-on-time-o1-space-explained-8qqc/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxDifference(String s) {
        if(s==null || s.isEmpty()) {
            return 0;
        }
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();
        for(char c : s.toCharArray()) {
            characterFrequencyMap.merge(c, 1 , Integer::sum);
        }
        int minEvenFrequency = Integer.MAX_VALUE, maxOddFrequency = Integer.MIN_VALUE;
        for(Map.Entry e : characterFrequencyMap.entrySet()) {
            if((Integer)e.getValue()%2==0)
                minEvenFrequency = Math.min(minEvenFrequency, (Integer) e.getValue());
            else
                maxOddFrequency = Math.max(maxOddFrequency, (Integer) e.getValue());
        }
        return maxOddFrequency - minEvenFrequency;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxDifference("mmsmsym"));
        System.out.println(solution.maxDifference("aaaaabbc"));
        System.out.println(solution.maxDifference("abcabcab"));
        System.out.println(solution.maxDifference(""));
    }
}
