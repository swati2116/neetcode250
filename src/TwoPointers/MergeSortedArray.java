 package TwoPointers;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i : nums2)
        {
            nums1[m]=i;
            m++;
        }
        Arrays.sort(nums1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedArray msa= new MergeSortedArray();
		msa.merge(new int[] {10,20,20,40,0,0}, 4, new int[] {1,2}, 2);

	}

}
//**********************************************//
//--------------------------MySolution---------------------------//
/*
 * public void merge(int[] nums1, int m, int[] nums2, int n)
 *  {
 *   for(int i :nums2) 
 *   { 
 *      nums1[m]=i;
 *      m++; 
 *   } 
 *   Arrays.sort(nums1); 
 *   }
 */
//----------------------------------------------------------------//