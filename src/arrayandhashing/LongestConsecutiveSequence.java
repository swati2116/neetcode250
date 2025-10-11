package arrayandhashing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {
	HashSet<Integer> longSequenceCount = new HashSet<Integer>();
	int longsequence = 1;

	public int longestConsecutive(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		for (int i : nums) {
			longSequenceCount.add(i);
		}
		for (int no : longSequenceCount) {
			int count = 1;
			int local = no;
			while (count <= nums.length) {

				if (longSequenceCount.contains(local + 1)) {
					local = local + 1;
					count++;
					;
				} else {
					if (longsequence < count) {
						longsequence = count;
					}
					break;
				}

			}
		}
		return longsequence;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
		// int max= lcs.longestConsecutive(new int[] {2,20,4,10,3,4,5});
		int max = lcs.longestConsecutive(new int[] { 0, -1 });
		System.out.println(max);

	}

}
//*********************************************************************//

/*
 * Longest Consecutive Sequence Solved Given an array of integers nums, return
 * the length of the longest consecutive sequence of elements that can be
 * formed.
 * 
 * A consecutive sequence is a sequence of elements in which each element is
 * exactly 1 greater than the previous element. The elements do not have to be
 * consecutive in the original array.
 * 
 * You must write an algorithm that runs in O(n) time.
 * 
 * Example 1:
 * 
 * Input: nums = [2,20,4,10,3,4,5]
 * 
 * Output: 4 Explanation: The longest consecutive sequence is [2, 3, 4, 5].
 * 
 * Example 2:
 * 
 * Input: nums = [0,3,2,5,4,6,1,1]
 * 
 * Output: 7
 */

//*************************************************************//