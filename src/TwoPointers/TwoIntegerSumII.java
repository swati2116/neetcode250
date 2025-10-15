package TwoPointers;

public class TwoIntegerSumII {
	public int[] twoSum(int[] numbers, int target) {
		int l = 0, r = numbers.length - 1;
		while (l < r) {
			int total = numbers[l] + numbers[r];
			if (total > target) {
				r--;
			} else if (total < target) {
				l++;
			} else {
				return new int[] { l + 1, r + 1 };
			}

		}
		return new int[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoIntegerSumII tis = new TwoIntegerSumII();
		int index[] = tis.twoSum(new int[] { 1, 2, 3, 4 }, 3);
		for (int no : index)
			System.out.println(no);

	}

}

//******************************************************//
/*
 * Two Integer Sum II Solved Given an array of integers numbers that is sorted
 * in non-decreasing order.
 * 
 * Return the indices (1-indexed) of two numbers, [index1, index2], such that
 * they add up to a given target number target and index1 < index2. Note that
 * index1 and index2 cannot be equal, therefore you may not use the same element
 * twice.
 * 
 * There will always be exactly one valid solution.
 * 
 * Your solution must use O ( 1 ) O(1) additional space.
 * 
 * Example 1:
 * 
 * Input: numbers = [1,2,3,4], target = 3
 * 
 * Output: [1,2]
 */
		
//*************************************************************//
