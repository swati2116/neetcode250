package binarysearch;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (nums[mid] < target) {
				l = mid + 1;
			} else if (nums[mid] > target) {
				r = mid - 1;
			} else {
				return mid;
			}
		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchInsertPosition sip = new SearchInsertPosition();
		int res = sip.searchInsert(new int[] { -1, 0, 2, 4, 6, 8 }, 5);
		System.out.println(res);
	}

}
//-------------------------------------------------//
/*
 * You are given a sorted array of distinct integers and a target value, return
 * the index if the target is found. If not, return the index where it would be
 * if it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Example 1:
 * 
 * Input: nums = [-1,0,2,4,6,8], target = 5
 * 
 * Output: 4 Example 2:
 * 
 * Input: nums = [-1,0,2,4,6,8], target = 10
 * 
 * Output: 6
 */
//--------------------------------------------------//