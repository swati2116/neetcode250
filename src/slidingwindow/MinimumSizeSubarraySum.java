package slidingwindow;

import java.util.HashMap;

public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int target, int[] nums) {
		int length = Integer.MAX_VALUE, prefixsum = 0, l = 0;
		for (int r = 0; r < nums.length; r++) {
			prefixsum = prefixsum + nums[r];
			if (prefixsum >= target) {

				length = Math.min(length, r - l + 1);

				l++;
				r = l - 1;
				prefixsum = 0;
			}
		}

		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumSizeSubarraySum ms = new MinimumSizeSubarraySum();
		int length = ms.minSubArrayLen(10, new int[] { 2, 1, 5, 1, 5, 3 });
		System.out.println(length);
	}

}
//**************************************//

/*
 * Minimum Size Subarray Sum Solved You are given an array of positive integers
 * nums and a positive integer target, return the minimal length of a subarray
 * whose sum is greater than or equal to target. If there is no such subarray,
 * return 0 instead.
 * 
 * A subarray is a contiguous non-empty sequence of elements within an array.
 * 
 * Example 1:
 * 
 * Input: target = 10, nums = [2,1,5,1,5,3]
 * 
 * Output: 3 Explanation: The subarray [5,1,5] has the minimal length under the
 * problem constraint.
 * 
 * Example 2:
 * 
 * Input: target = 5, nums = [1,2,1]
 * 
 * Output: 0
 */