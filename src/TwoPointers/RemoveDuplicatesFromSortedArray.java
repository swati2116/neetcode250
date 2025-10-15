package TwoPointers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i=0;
    	List<Integer> list=Arrays.stream(nums).boxed().distinct().collect(Collectors.toList());
        java.util.Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
        {
        	nums[i]= (int)itr.next();
        	i++;
        }
		return list.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDuplicatesFromSortedArray rdsa= new RemoveDuplicatesFromSortedArray();
		int returnValue= rdsa.removeDuplicates(new int[] {1,1,2,3,4});
		System.out.println(returnValue);
	}

}
//***********************************************************//
/*
 * Remove Duplicates From Sorted Array Solved You are given an integer array
 * nums sorted in non-decreasing order. Your task is to remove duplicates from
 * nums in-place so that each element appears only once.
 * 
 * After removing the duplicates, return the number of unique elements, denoted
 * as k, such that the first k elements of nums contain the unique elements.
 * 
 * Note:
 * 
 * The order of the unique elements should remain the same as in the original
 * array. It is not necessary to consider elements beyond the first k positions
 * of the array. To be accepted, the first k elements of nums must contain all
 * the unique elements. Return k as the final result.
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,2,3,4]
 * 
 * Output: [1,2,3,4] Explanation: You should return k = 4 as we have four unique
 * elements.
 * 
 * Example 2:
 * 
 * Input: nums = [2,10,10,30,30,30]
 * 
 * Output: [2,10,30]
 */
//*****************************************************//		
