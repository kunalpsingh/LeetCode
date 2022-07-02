package easy.com.leetcode.besttimetobuyandsellstock_121;

public class Solution {
	public int maxProfit(int[] prices) {
		int max = 0, left = 0, right=1;
		if(prices.length==1)
			return 0;
		while(right<prices.length) {
			int currentProfit = prices[right]-prices[left];
			if(prices[right]>prices[left]) {
				max = Math.max(max, currentProfit);
			} else {
				left=right;
			}
			right++;
		}
        return max;
    }
	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4};
		//int arr[] = {7,6,4,3,1};
		//int arr[] = {1,2,4};
		Solution sol = new Solution();
		System.out.println(sol.maxProfit(arr));
		//System.out.println(sol.maxProfit(arr1));
	}
}
