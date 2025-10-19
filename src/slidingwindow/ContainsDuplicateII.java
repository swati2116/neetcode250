package slidingwindow;

import java.util.HashMap;

public class ContainsDuplicateII {
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {

    	HashMap<Integer,Integer> hm= new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length ; i++)
        {
        	if(hm.containsKey(nums[i]))
        	{
        		if(i - hm.get(nums[i])<= k)
        			return true;   		
        	}
        		hm.put(nums[i], i);
        }
    	
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsDuplicateII cd=new ContainsDuplicateII();
		boolean flag=cd.containsNearbyDuplicate(new int[] {1,0,1,1}, 1);
		if(flag)
		{
			System.out.println(flag);
		}
		else
		{
			System.out.println(flag);
		}
	}

}

//***************************************************************//

/*
 * Contains Duplicate II Solved You are given an integer array nums and an
 * integer k, return true if there are two distinct indices i and j in the array
 * such that nums[i] == nums[j] and abs(i - j) <= k, otherwise return false.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,1], k = 3
 * 
 * Output: true Example 2:
 * 
 * Input: nums = [2,1,2], k = 1
 * 
 * Output: false
 */

//*******************************************************************//
