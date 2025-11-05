package binarysearch;

public class MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
			return findMedianSortedArrays(nums2, nums1);
		}
		int l = 0;
		int r = nums1.length;
		while (l <= r) {
			int m1 = (l + r) / 2;
			int m2 = ((nums1.length + nums2.length + 1) / 2) - m1;

			int l1 = (m1 == 0) ? Integer.MIN_VALUE : nums1[m1 - 1];
			int r1 = (m1 == nums1.length) ? Integer.MAX_VALUE : nums1[m1];
			int l2 = (m2 == 0) ? Integer.MIN_VALUE : nums2[m2 - 1];
			int r2 = (m2 == nums2.length) ? Integer.MAX_VALUE : nums2[m2];
			if (l1 <= r2 && l2 <= r1) {
				if ((nums1.length + nums2.length) % 2 == 0) {
					return (float) (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
				} else {
					return (float) Math.max(l1, l2);
				}
			} else {
				if (l2 > r1) {
					l = m1 + 1;
				} else {
					r = m1 - 1;
				}
			}
		}
		return 0.0f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedianofTwoSortedArrays mts = new MedianofTwoSortedArrays();
		double ans = mts.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 });
		System.out.println(ans);

	}

}
 //---------------------------------------------//
	/*
	 * You are given two integer arrays nums1 and nums2 of size m and n
	 * respectively, where each is sorted in ascending order. Return the median
	 * value among all elements of the two arrays.
	 * 
	 * Your solution must run in O ( l o g ( m + n ) ) O(log(m+n)) time.
	 * 
	 * Example 1:
	 * 
	 * Input: nums1 = [1,2], nums2 = [3]
	 * 
	 * Output: 2.0 Explanation: Among [1, 2, 3] the median is 2.
	 * 
	 * Example 2:
	 * 
	 * Input: nums1 = [1,3], nums2 = [2,4]
	 */
 //Output: 2.5
//---------------------------------------------------------------------------------------//