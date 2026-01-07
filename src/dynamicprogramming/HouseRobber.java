package dynamicprogramming;

public class HouseRobber {
	public int rob(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int[] totalrob = new int[nums.length];
		totalrob[0] = nums[0];
		totalrob[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			totalrob[i] = Math.max(totalrob[i - 2] + nums[i], totalrob[i - 1]);
		}
		return totalrob[totalrob.length - 1];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//----------------------------------------------------------------------------------//

/*
 * You are given an integer array nums where nums[i] represents the amount of
 * money the ith house has. The houses are arranged in a straight line, i.e. the
 * ith house is the neighbor of the (i-1)th and (i+1)th house.
 * 
 * You are planning to rob money from the houses, but you cannot rob two
 * adjacent houses because the security system will automatically alert the
 * police if two adjacent houses were both broken into.
 * 
 * Return the maximum amount of money you can rob without alerting the police.
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,3,3]
 * 
 * Output: 4 Explanation: nums[0] + nums[2] = 1 + 3 = 4.
 */

//-----------------------------------------------------------------------------------//
/*
 * Time & Space Complexity Time complexity: O ( n ) O(n) Space complexity: O ( n
 * ) O(n)
 */