/*

322. Coin Change

You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

 

Example 1:

Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
Example 3:

Input: coins = [1], amount = 0
Output: 0
 

Constraints:

1 <= coins.length <= 12
1 <= coins[i] <= 231 - 1
0 <= amount <= 104

*/

package medium.com.leetcode.coinchange_322;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
	public int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
	       Arrays.fill(dp, amount + 1); 
	       dp[0] = 0; 
	       for(int j = 0; j < coins.length; j++){
	         for(int i = 0; i <= amount; i++){
	           if(i - coins[j] >= 0) dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1); 
	         } 
	       } 
	       return dp[amount] > amount ? -1 : dp[amount];
    }
	public static void main(String[] args) {
		Solution sol = new Solution();
//		int coins[] = {1,2,5};
//		System.out.println(sol.coinChange(coins, 11));
//		int coins[] = {2};
//		System.out.println(sol.coinChange(coins, 3));
//		int coins[] = {1};
//		System.out.println(sol.coinChange(coins, 2));
		int coins[] = {186,419,83,408};
		System.out.println(sol.coinChange(coins, 6249));
	}
}
