package TwoPointers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArrayOptimal {

	 public int removeDuplicates(int[] nums) {
		 int l=1;
	       for(int i=1; i<nums.length; i++)
	       {
	         if(nums[i-1]!=nums[i])
	         {
	            nums[l]=nums[i];
	            l++;
	         }
	       }
	       return l;
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			RemoveDuplicatesFromSortedArrayOptimal rdsa= new RemoveDuplicatesFromSortedArrayOptimal();
			int returnValue= rdsa.removeDuplicates(new int[] {1,1,2,3,4});
			System.out.println(returnValue);
		}

}
