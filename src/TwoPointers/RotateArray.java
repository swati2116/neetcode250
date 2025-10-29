package TwoPointers;

public class RotateArray {
	public int[] rotate(int[] nums, int k) {
		k %= nums.length; // k= k%nums.length
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);

		return nums;
	}

	public void reverse(int[] nums, int l, int r) {
		while (l < r) {
			int tmp = nums[l];
			nums[l] = nums[r];
			nums[r] = tmp;
			l++;
			r--;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RotateArray ra = new RotateArray();
		int[] result = ra.rotate(new int[] { 1,2,3,4,5,6,7,8}, 4);
		for (int no : result) {
			System.out.print(no + ",");
		}

	}

}
//***************************************************//
/*
 * Rotate Array Solved You are given an integer array nums, rotate the array to
 * the right by k steps, where k is non-negative.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4,5,6,7,8], k = 4
 * 
 * Output: [5,6,7,8,1,2,3,4] Explanation: rotate 1 steps to the right:
 * [8,1,2,3,4,5,6,7] rotate 2 steps to the right: [7,8,1,2,3,4,5,6] rotate 3
 * steps to the right: [6,7,8,1,2,3,4,5] rotate 4 steps to the right:
 * [5,6,7,8,1,2,3,4]
 * 
 * Example 2:
 * 
 * Input: nums = [1000,2,4,-3], k = 2
 * 
 * Output: [4,-3,1000,2] Explanation: rotate 1 steps to the right: [-3,1000,2,4]
 * rotate 2 steps to the right: [4,-3,1000,2]
 */
//*****************youtube video*********************

// https://www.youtube.com/watch?v=kNYUEuXlNO0