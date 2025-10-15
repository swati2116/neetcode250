package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBestOptimal {

	public List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> hs = new HashSet<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int l = i + 1, r = nums.length - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (sum > 0) {
					r--;
				} else if (sum < 0) {
					l++;
				} else {
					hs.add(Arrays.asList(nums[i], nums[l], nums[r]));
					l++;
					r--;
				}
			}
		}
		return new ArrayList<>(hs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSumBestOptimal threesum = new ThreeSumBestOptimal();
		List<List<Integer>> r = threesum.threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
		for (int i = 0; i < r.size(); i++) {
			for (int j = 0; j < r.get(i).size(); j++) {
				System.out.println(r.get(i).get(j));
			}
		}
	}

}
