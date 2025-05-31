package com.kunal.leetcode.array_and_string.easy._121_best_time_to_buy_and_sell_stock;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price;
            } else if(price - minPrice > maxProfit){
                    maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4})); // Output: 5
        System.out.println(solution.maxProfit(new int[]{7,6,4,3,1})); // Output: 0
    }
}
