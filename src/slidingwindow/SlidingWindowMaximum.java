package slidingwindow;

public class SlidingWindowMaximum {
	public int[] maxSlidingWindow(int[] nums, int k) {
		int windowsize = 0, l = 0, max = -1, i = 0;
		int[] res = new int[nums.length - k + 1];
		for (int r = 0; r < nums.length; r++) {
			windowsize = r - l + 1;
			max = Math.max(max, nums[r]);
			if (windowsize >= k) {
				res[i] = max;
				l++;
				r = l - 1;
				i++;
				max = -1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlidingWindowMaximum swm = new SlidingWindowMaximum();
		int res[] = swm.maxSlidingWindow(new int[] { 1, 2, 1, 0, 4, 2, 6 }, 3);
		for (int no : res) {
			System.out.println(no);
		}
	}

}

//-------------------------------------------------------------//
/*
 * Sliding Window Maximum Solved You are given an array of integers nums and an
 * integer k. There is a sliding window of size k that starts at the left edge
 * of the array. The window slides one position to the right until it reaches
 * the right edge of the array.
 * 
 * Return a list that contains the maximum element in the window at each step.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,1,0,4,2,6], k = 3
 * 
 * Output: [2,2,4,4,6]
 * 
 */
//---------------------------------------------------------------//