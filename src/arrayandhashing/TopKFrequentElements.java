package arrayandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopKFrequentElements tke= new TopKFrequentElements();
		int no[]= tke.topKFrequent(new int[] {1,2,2,3,3,3}, 2);
		for(int i : no)
		{
			System.out.println(i);
		}
     
	}
	 public int[] topKFrequent(int[] nums, int k) {
	      int [] frequency= new int[k];
		    Map<Integer, Long> mp=(Map<Integer, Long>)Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		    ArrayList<Map.Entry<Integer, Integer>> al=(ArrayList) mp.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());

              for(int i=0;i<k;i++)
              {
            	  frequency[i]= (int) al.get(i).getKey();
              }
		     return frequency;   
		    }
}

//*************************************************************//
/*
 * Given an integer array nums and an integer k, return the k most frequent
 * elements within the array.
 * 
 * The test cases are generated such that the answer is always unique.
 * 
 * You may return the output in any order.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,2,3,3,3], k = 2
 * 
 * Output: [2,3] Example 2:
 * 
 * Input: nums = [7,7], k = 1
 * 
 * Output: [7]
 */

//****************************************//
