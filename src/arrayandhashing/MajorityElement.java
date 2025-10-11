package arrayandhashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MajorityElement me= new MajorityElement();
		int m=me.majorityElement(new int[] {5,5,1,1,1,5,5});
		System.out.println(m);
	}

public int majorityElement(int[] nums) {
    HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
    int maxcount=0;
    if(nums.length==1)
    {
        return nums[0];
    }
    for(int i=0; i<nums.length ; i++)
    {
        if(hm.containsKey(nums[i]))
        {
            hm.put(nums[i],(hm.get(nums[i])) + 1);
            if(maxcount<hm.get(nums[i]))
            {
            	maxcount= nums[i];
            }
        }
        else
        {
            hm.put(nums[i],1);
        }
    }

     
      return maxcount;
    }
}

//*******************************************//
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times in the array. You may assume that the majority element always exists in the array.
//
//Example 1:
//
//Input: nums = [5,5,1,1,1,5,5]
//
//Output: 5
//Example 2:
//
//Input: nums = [2,2,2]
//
//Output: 2

//******************************************//