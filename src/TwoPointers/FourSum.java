package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Set<List<Integer>> hs = new HashSet<>();
		Arrays.sort(nums);
		if (nums[0] > target) {
			return new ArrayList();
		}
		for (int i = 0; i < nums.length - 3; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int r = nums.length - 1, l = j + 1;
				while (l < r) {
					int sum = nums[i] + nums[j] + nums[l] + nums[r];
					if (sum > target) {
						r--;
					} else if (sum < target) {
						l++;
					} else {
						hs.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
						l++;
						r--;
					}
				}
			}
		}
		return new ArrayList<>(hs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourSum fs = new FourSum();
		List<List<Integer>> r = fs.fourSum(new int[] { 1, -1, 1, -1, 1, -1 }, 2);
		for (int i = 0; i < r.size(); i++) {
			for (int j = 0; j < r.get(i).size(); j++) {
				System.out.println(r.get(i).get(j));
			}
		}
	}

}

//****************************************************************//

/*
 * 4Sum Solved You are given an integer array nums of size n, return an array of
 * all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 * 
 * 0 <= a, b, c, d < n a, b, c, and d are distinct. nums[a] + nums[b] + nums[c]
 * + nums[d] == target You may return the answer in any order.
 * 
 * Note: [1,0,3,2] and [3,0,1,2] are considered as same quadruplets.
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,3,-3,1,0], target = 3
 * 
 * Output: [[-3,0,3,3],[-3,1,2,3]] Example 2:
 * 
 * Input: nums = [1,-1,1,-1,1,-1], target = 2
 * 
 * Output: [[-1,1,1,1]]
 */
//**************************************************************//
