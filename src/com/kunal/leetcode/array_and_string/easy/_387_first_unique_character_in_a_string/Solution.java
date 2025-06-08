package com.kunal.leetcode.array_and_string.easy._387_first_unique_character_in_a_string;

//https://leetcode.com/problems/first-unique-character-in-a-string/
//https://leetcode.com/problems/first-unique-character-in-a-string/solutions/6824270/java-solution-alphabet-array-based-solut-ta39/

public class Solution {
    public int firstUniqChar(String s) {
        int uniqCharIdx=-1;
        int[] freqArr = new int[26];
        for(int i=0; i<s.length(); i++) {
            freqArr[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length(); i++) {
            if(freqArr[s.charAt(i)-'a']==1) {
                uniqCharIdx = i;
                break;
            }
        }
        return uniqCharIdx;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("leetcode"));
        System.out.println(solution.firstUniqChar("loveleetcode"));
        System.out.println(solution.firstUniqChar("aabb"));
    }
}
