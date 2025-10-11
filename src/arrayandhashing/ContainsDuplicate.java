package arrayandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsDuplicate cd= new ContainsDuplicate();
		int nums[]= {2,1,5,4,4};
		boolean duplicate=cd.hasDuplicateOptimal(nums);
		System.out.println("Does array have duplicate value "+duplicate);
	}
	public boolean hasDuplicate(int[] nums) {
		boolean flag=false;

	     
	     Map<Integer, Long> mp=(Map<Integer, Long>)Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	     Set s= mp.entrySet();
	     Iterator itr= s.iterator();
	     long check=1;
	     while(itr.hasNext())
	     {
	    	 Map.Entry me = (Map.Entry)itr.next();
	    	 System.out.println(me.getKey().toString());
	    	System.out.println(me.getValue());
	     }
	     Set s1= mp.entrySet();
	     Iterator itr1= s1.iterator();
	     while(itr1.hasNext())
	     {
	    	 Map.Entry me = (Map.Entry)itr1.next();
	    	if((Long)me.getValue()>check)
	    	{
	    		flag = true;
	    		break;
	    	}
	     }
	     
	     return flag;
	    }
	
	public boolean hasDuplicateOptimal(int[] nums) {
		
		//boolean flag=false;
		Arrays.sort(nums);
		int r=0;
		while(r<nums.length-1)
		{
			if(nums[r]==nums[r+1])
			{
				return true;
			}
			r++;
		}
		return false;
	}

}


//**********************************************************
//Contains Duplicate
//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
//
//Example 1:
//
//Input: nums = [1, 2, 3, 3]
//
//Output: true
//
//Example 2:
//
//Input: nums = [1, 2, 3, 4]
//
//Output: false



//public boolean hasDuplicate(int[] nums) {
//    HashSet hs= new HashSet();
//    for(int no:nums)
//    {
//       hs.add(no);
//    }
//    if(hs.size()==nums.length)
//    {
//       return false;
//    }
//    else{
//    return true;
//    }
//   }

//***************************//