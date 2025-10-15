package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				break;
			}
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int l = i + 1, r = nums.length - 1;
			while (l < r) {
				int sum = nums[i] + nums[r] + nums[l];
				if (sum > 0) {
					r--;
				} else if (sum < 0) {
					l++;
				} else {
					res.add(Arrays.asList(nums[i], nums[l], nums[r]));
					l++;
					r--;
					while (l < r && nums[l - 1] == nums[l]) {
						l++;
					}
				}
			}
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSum threesum = new ThreeSum();
		List<List<Integer>> r = threesum.threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
		for (int i = 0; i < r.size(); i++) {
			for (int j = 0; j < r.get(i).size(); j++) {
				System.out.println(r.get(i).get(j));
			}
		}
	}
}
//*********************************************//

/*
 * 3Sum Solved Given an integer array nums, return all the triplets [nums[i],
 * nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0, and the indices i,
 * j and k are all distinct.
 * 
 * The output should not contain any duplicate triplets. You may return the
 * output and the triplets in any order.
 * 
 * Example 1:
 * 
 * Input: nums = [-1,0,1,2,-1,-4]
 * 
 * Output: [[-1,-1,2],[-1,0,1]]
 */
//***************************youtube video link**********************************//
//https://www.youtube.com/watch?v=cRBSOz49fQk
