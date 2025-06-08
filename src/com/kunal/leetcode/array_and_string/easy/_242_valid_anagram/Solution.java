package com.kunal.leetcode.array_and_string.easy._242_valid_anagram;

//https://leetcode.com/problems/valid-anagram/
//https://leetcode.com/problems/valid-anagram/solutions/6824323/java-solution-beats-90-o-n-logn-time-space-o-n-explained/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        //Solution using HashMap
        /*if(s.length()!=t.length())
            return false;
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        int letterCount = s.length();
        for(Character c : s.toCharArray()) {
            characterIntegerMap.merge(c, 1, Integer::sum);
        }
        for(Character c : t.toCharArray()) {
            if(characterIntegerMap.get(c)!=null && characterIntegerMap.get(c)!=0) {
                characterIntegerMap.put(c, characterIntegerMap.get(c)-1);
                letterCount--;
            }
        }
        if(letterCount==0)
            return true;
        else
            return false;*/

        //Solution by string character sort
        if(s==null || t == null || s.length()!=t.length()) {
            return false;
        }
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        s = String.valueOf(ch);
        ch = t.toCharArray();
        Arrays.sort(ch);
        t= String.valueOf(ch);
        if(s.equals(t))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram","nagaram"));
        System.out.println(solution.isAnagram("rat","car"));
        System.out.println(solution.isAnagram("aacc","ccac"));
    }
}
