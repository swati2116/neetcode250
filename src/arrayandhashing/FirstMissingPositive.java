package arrayandhashing;

import java.util.Arrays;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
		int missing = 1;
		Arrays.sort(nums);
		for (int num : nums) {
			if (num > 0 && missing == num) {
				missing++;
			}
		}
		return missing;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstMissingPositive fmp = new FirstMissingPositive();
		int missing = fmp.firstMissingPositive(new int[] { 1, 2, 4 });
		System.out.println(missing);
	}

}

//***************************************************************//
/*
 * First Missing Positive Solved You are given an unsorted integer array nums.
 * Return the smallest positive integer that is not present in nums.
 * 
 * You must implement an algorithm that runs in O(n) time and uses O(1)
 * auxiliary space.
 * 
 * Example 1:
 * 
 * Input: nums = [-2,-1,0]
 * 
 * Output: 1 Example 2:
 * 
 * Input: nums = [1,2,4]
 * 
 * Output: 3 Example 3:
 * 
 * Input: nums = [1,2,4,5,6,3,1]
 * 
 * Output: 7
 */

//-----------------------coding explanation-------------//
//consider 1st missing number as 1(as 1 is the first positive number) if array ccontains 1 inrease missing number
