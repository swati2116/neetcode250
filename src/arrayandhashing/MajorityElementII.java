package arrayandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElementII {
	public List<Integer> majorityElement(int[] nums) {
		ArrayList al = new ArrayList();

		HashMap<Integer, Long> hm = (HashMap<Integer, Long>) Arrays.stream(nums).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry me = (Entry) itr.next();
			if ((long) me.getValue() > (long) nums.length / 3)
				al.add(me.getKey());
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MajorityElementII me = new MajorityElementII();
		List<Integer> element = me.majorityElement(new int[] { 5, 2, 3, 2, 2, 2, 2, 5, 5, 5 });
		for (int i : element) {
			System.out.println(i);
		}
	}

}

//************************************************************//
/*
 * Majority Element II Solved You are given an integer array nums of size n,
 * find all elements that appear more than ⌊ n/3 ⌋ times. You can return the
 * result in any order.
 * 
 * Example 1:
 * 
 * Input: nums = [5,2,3,2,2,2,2,5,5,5]
 * 
 * Output: [2,5] Example 2:
 * 
 * Input: nums = [4,4,4,4,4]
 * 
 * Output: [4] Example 3:
 * 
 * Input: nums = [1,2,3]
 * 
 * Output: []
 */
//************************************************************************//
