package slidingwindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindKClosestElements {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int l = 0, r = arr.length - 1;
		List<Integer> ans = new ArrayList<>();
		while (l < r) {
			int mid = (l + r) / 2;
			if (arr[mid] < x) {
				l = mid + 1;

			} else {

				r = mid;
			}
		}
		l = l - 1;
		r = l + 1;

		while (r - l - 1 < k)

		{
			if (l < 0) {
				r++;

				// ans.add(arr[r]);
			} else if (r >= arr.length) {
				l--;

			} else if (Math.abs(arr[l] - x) <= Math.abs(arr[r] - x)) {
				l--;

			} else {
				r++;

			}
		}
		for (int i = l + 1; i < r; i++) {
			ans.add(arr[i]);
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindKClosestElements fce = new FindKClosestElements();
		List<Integer> result = fce.findClosestElements(new int[] { 2,4,5,8 }, 2, 6);
		for (int no : result) {
			System.out.println(no);
		}

	}

}

//**********************************************************************//

/*
 * Find K Closest Elements Solved You are given a sorted integer array arr, two
 * integers k and x, return the k closest integers to x in the array. The result
 * should also be sorted in ascending order.
 * 
 * An integer a is closer to x than an integer b if:
 * 
 * |a - x| < |b - x|, or |a - x| == |b - x| and a < b Example 1:
 * 
 * Input: arr = [2,4,5,8], k = 2, x = 6
 * 
 * Output: [4,5] Example 2:
 * 
 * Input: arr = [2,3,4], k = 3, x = 1
 * 
 * Output: [2,3,4]
 */

//--------------------youtube link----------------------//
//https://www.youtube.com/watch?v=vYTkx-tB6xI