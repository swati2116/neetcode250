package binarysearch;

public class FindInMountainArray {
	public int findInMountainArray(int target, int[] mountainArr) {
		int peak = 0, left = 0, right = mountainArr.length - 1, res = -1;

		while (left <= right) {
			int m = (left + right) / 2;
			int mid = mountainArr[m];
			int leftval = mountainArr[m - 1];
			int rightval = mountainArr[m + 1];
			if (leftval <= mid && rightval <= mid) {
				peak = m;
				break;
			} else if (leftval <= mid && rightval >= mid) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		System.out.println("the peak index value is :" + peak);
		res = searchInLeft(mountainArr, 0, peak - 1, target);
		System.out.println("found in left:" + res);
		if (res == -1) {
			return searchInRight(mountainArr, peak, mountainArr.length - 1, target);
		}

		return res;
	}

	public int searchInLeft(int[] mountainArr, int left, int right, int target) {
		System.out.println("enter in left search");
		while (left <= right) {
			int mid = (left + (right - left)) / 2;
			if (mountainArr[mid] < target) {
				left = mid + 1;
			} else if (mountainArr[mid] > target) {
				right = mid - 1;
			} else {
				return mid;
			}

		}
		return -1;
	}

	public int searchInRight(int[] mountainArr, int left, int right, int target) {
		System.out.println("enter in right search");
		while (left <= right) {
			int mid = (left + (right - left)) / 2;
			if (mountainArr[mid] > target) {
				left = mid + 1;
			} else if (mountainArr[mid] < target) {
				right = mid - 1;
			} else {
				System.out.println("found in right:" + mid);
				return mid;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindInMountainArray fima = new FindInMountainArray();
		int ans = fima.findInMountainArray(6, new int[] { 1, 2, 3, 4, 2, 1 });
		System.out.println(ans);
	}

}

//--------------------------------------------------------------------------------------//
/*
 * (This problem is an interactive problem.)
 * 
 * An array arr is called a mountain array if and only if:
 * 
 * arr.length >= 3 There exists some index i with 0 < i < arr.length - 1 such
 * that: arr[0] < arr[1] < ... < arr[i - 1] < arr[i] arr[i] > arr[i + 1] > ... >
 * arr[arr.length - 1] You are given a mountain array mountainArr and an integer
 * target, return the minimum index such that mountainArr.get(index) == target.
 * If such an index does not exist, return -1.
 * 
 * You cannot access the mountain array directly. You may only access the array
 * using a MountainArray interface:
 * 
 * MountainArray.get(k) returns the element of the array at index k (0-indexed).
 * MountainArray.length() returns the length of the array. You can only make at
 * most 100 calls to the function get(). Submissions making more than 100 calls
 * will be judged as Wrong Answer. Also, any solutions that attempt to
 * circumvent the judge will result in disqualification.
 * 
 * Example 1:
 * 
 * Input: mountainArr = [2,4,5,2,1], target = 2
 * 
 * Output: 0 Example 2:
 * 
 * Input: mountainArr = [1,2,3,4,2,1], target = 6
 * 
 * Output: -1
 */

//--------------------------------------------------------------------------------------//