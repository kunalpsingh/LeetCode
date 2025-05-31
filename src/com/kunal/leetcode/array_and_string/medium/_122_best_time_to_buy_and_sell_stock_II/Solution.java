package com.kunal.leetcode.array_and_string.medium._122_best_time_to_buy_and_sell_stock_II;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

public class Solution {
    public int maxProfit(int[] prices) {
        int price = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i]>price) {
                profit = profit + prices[i] - price;
            }
            price = prices[i];
        }
        return profit;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(solution.maxProfit(new int[]{1,2,3,4,5}));
        System.out.println(solution.maxProfit(new int[]{7,6,4,3,1}));
    }
}
