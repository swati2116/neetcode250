package arrayandhashing;

public class BesttimetoBuyandSellStockII {
	 public int maxProfit(int[] prices) {
	        int profit=0;
	        for(int i =1 ; i< prices.length ; i++)
	        {
	            if(prices[i]>prices[i-1])
	              profit=profit+(prices[i]-prices[i-1]);
	        }

	        return profit;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesttimetoBuyandSellStockII bts= new BesttimetoBuyandSellStockII();
		int maxprofit=bts.maxProfit(new int[] {7,1,5,3,6,4});
		System.out.println(maxprofit);
	}

}

//*****************************************************//

/*
 * Best Time to Buy and Sell Stock II Solved You are given an integer array
 * prices where prices[i] is the price of a given stock on the ith day.
 * 
 * On each day, you may decide to buy and/or sell the stock. However, you can
 * buy it then immediately sell it on the same day. Also, you are allowed to
 * perform any number of transactions but can hold at most one share of the
 * stock at any time.
 * 
 * Find and return the maximum profit you can achieve.
 * 
 * Example 1:
 * 
 * Input: prices = [7,1,5,3,6,4]
 * 
 * Output: 7 Explanation: Buy on day 2 (price = 1) and sell on day 3 (price =
 * 5), profit = 5-1 = 4. Then buy on day 4 (price = 3) and sell on day 5 (price
 * = 6), profit = 6-3 = 3. Total profit is 4 + 3 = 7.
 * 
 * Example 2:
 * 
 * Input: prices = [1,2,3,4,5]
 * 
 * Output: 4 Explanation: Buy on day 1 (price = 1) and sell on day 5 (price =
 * 5), profit = 5-1 = 4. Total profit is 4.
 */

//-----------------------------explain logic--------------

//compare i indexx with previous index for each index in the array and if i index is greater that i-1 index than add profit;
