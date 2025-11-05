package binarysearch;

public class SplitArrayLargestSum {
	public int splitArray(int[] nums, int k) {
		int low = 0, high = 0, res = 0;
		for (int no : nums) {
			low = Math.max(low, no);
			high = high + no;
		}
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (canSplit(nums, k, mid)) {
				res = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return res;
	}

	public boolean canSplit(int[] nums, int k, int largest) {
		int subarray = 1, sum = 0;
		for (int num : nums) {
			sum = sum + num;
			if (sum > largest) {
				subarray++;
				if (subarray > k) {
					return false;
				}
				sum = num;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitArrayLargestSum sa = new SplitArrayLargestSum();
		int max = sa.splitArray(new int[] { 2, 4, 10, 1, 5 }, 2);
		System.out.println(max);
	}

}

//----------------------------------------------------------------------------//
/*
 * You are given an integer array nums and an integer k, split nums into k
 * non-empty subarrays such that the largest sum of any subarray is minimized.
 * 
 * Return the minimized largest sum of the split.
 * 
 * A subarray is a contiguous part of the array.
 * 
 * Example 1:
 * 
 * Input: nums = [2,4,10,1,5], k = 2
 * 
 * Output: 16 Explanation: The best way is to split into [2,4,10] and [1,5],
 * where the largest sum among the two subarrays is only 16.
 * 
 * Example 2:
 * 
 * Input: nums = [1,0,2,3,5], k = 4
 * 
 * Output: 5 Explanation: The best way is to split into [1], [0,2], [3] and [5],
 * where the largest sum among the two subarrays is only 5.
 */
//----------------------------------------------------------------------------//

/*
 * here low value is largest value from array high value is sum of all element
 * from array. Now the answer lies between low and high
 * 
 * if the addition of element reaches more that k times it means we have to
 * increase low value else high value.
 * 
 * This problem is similar to painter's problem and book and Allocate book
 * problem
 */