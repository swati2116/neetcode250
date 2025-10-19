package slidingwindow;

import java.util.Arrays;
import java.util.HashMap;

public class BestTimetoBuyandSellStock {

	public int maxProfit(int[] prices) {
		int maxprofit = 0, l = 0, r = 1, profit;
		while (r < prices.length) {
			if (prices[l] < prices[r]) {
				maxprofit = Math.max(maxprofit, prices[r] - prices[l]);
			} else {
				l = r;
			}
			r++;
		}

		return maxprofit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestTimetoBuyandSellStock mp = new BestTimetoBuyandSellStock();
		int profit = mp.maxProfit(new int[] { 10, 1, 5, 6, 7, 1 });
		System.out.println(profit);

	}

}

//****************************************************************************************//
/*
 * Best Time to Buy and Sell Stock You are given an integer array prices where
 * prices[i] is the price of NeetCoin on the ith day.
 * 
 * You may choose a single day to buy one NeetCoin and choose a different day in
 * the future to sell it.
 * 
 * Return the maximum profit you can achieve. You may choose to not make any
 * transactions, in which case the profit would be 0.
 * 
 * Example 1:
 * 
 * Input: prices = [10,1,5,6,7,1]
 * 
 * Output: 6 Explanation: Buy prices[1] and sell prices[4], profit = 7 - 1 = 6.
 * 
 * Example 2:
 * 
 * Input: prices = [10,8,7,5,2]
 * 
 * Output: 0
 */

//****************************code explaination********************************************//
 //compare i index with i+1, if i value is less than i+1 than calculate profit else move i index to i+1 and repeat;