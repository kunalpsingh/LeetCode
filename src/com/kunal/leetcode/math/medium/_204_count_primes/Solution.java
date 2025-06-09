package com.kunal.leetcode.math.medium._204_count_primes;

//https://leetcode.com/problems/count-primes/
//https://leetcode.com/problems/count-primes/solutions/6826590/java-solution-on-log-logn-time-on-space-80pfg/

import java.util.Arrays;

public class Solution {
    public int countPrimes(int n) {
        /*
        The Map solution gives TLE exception so implemented a new solution
        Map<Integer, Boolean> compositeMap = new HashMap<>();
        if(n<3) {
            return 0;
        }
        for(int i=2; i<n; i++) {
            compositeMap.put(i, false);
        }
        for(int i=2; i<=(int)Math.sqrt(n); i++) {
            int num = 2;
            while(num*i<=n) {
                compositeMap.put(num*i, true);
                num++;
            }
        }
        return (int) compositeMap.entrySet().stream().filter(ele -> ele.getValue().equals(false)).count();

         */
        if(n<=2)return 0;
        boolean[]isPrime=new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for(int p=2;p*p<n;p++){
            if(isPrime[p]){
                for(int multiple=p*p;multiple<n;multiple+=p){
                    isPrime[multiple]=false;
                }
            }
        }
        int count=0;
        for(boolean prime:isPrime){
            if(prime)count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        //System.out.println(solution.countPrimes(5));
        System.out.println(solution.countPrimes(3));
        System.out.println(solution.countPrimes(20));
        System.out.println(solution.countPrimes(0));
        System.out.println(solution.countPrimes(1));
    }
}
