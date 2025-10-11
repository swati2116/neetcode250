package arrayandhashing;

import java.util.HashMap;

public class SubarraySumEqualsK {
    
	public int subarraySum(int[] nums, int k) {
		
		int count=0, prefixsum=0;
		HashMap<Integer, Integer> hm= new HashMap<>();
		hm.put(0,1);
		for(int no: nums)
		{
			prefixsum=prefixsum+no;
			int diff= prefixsum-k;
			count= count+hm.getOrDefault(diff, 0);
			hm.put(prefixsum, hm.getOrDefault(prefixsum, 0)+1);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarraySumEqualsK ssek= new SubarraySumEqualsK();
		int subarray=ssek.subarraySum(new int[] {2,-1,1,2}, 2);
		System.out.println(subarray);

	}

}

//*******************************************************//

/*
 * You are given an array of integers nums and an integer k, return the total
 * number of subarrays whose sum equals to k.
 * 
 * A subarray is a contiguous non-empty sequence of elements within an array.
 * 
 * Example 1:
 * 
 * Input: nums = [2,-1,1,2], k = 2
 * 
 * Output: 4 Explanation: [2], [2,-1,1], [-1,1,2], [2] are the subarrays whose
 * sum is equals to k.
 * 
 * Example 2:
 * 
 * Input: nums = [4,4,4,4,4,4], k = 4
 * 
 * Output: 6
 */
//----------------youtube Link---------------------------//
// https://www.youtube.com/watch?v=xvNwoz-ufXA
