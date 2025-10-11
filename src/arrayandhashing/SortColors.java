package arrayandhashing;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortColors sc = new SortColors();
		sc.sortColors(new int[] { 5,6,5,7});

	}

	public void sortColors(int[] nums) {
       int i=0, l=0,r=nums.length-1;
       while(i<=r)
       {
    	   if(nums[i]==5)
    	   {
    		   swap(nums, l,i);
    		   l++;
    	   }
    	   else if(nums[i]==7)
    	   {
    		   swap(nums, i,r);
    		   r--;
    		   i--;
    	   }
    	   i++;
       }
		

		for (int no : nums) {
			System.out.println(no);
		}

	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}

//****************************************************//
/*
 * You are given an array nums consisting of n elements where each element is an
 * integer representing a color:
 * 
 * 0 represents red 1 represents white 2 represents blue Your task is to sort
 * the array in-place such that elements of the same color are grouped together
 * and arranged in the order: red (0), white (1), and then blue (2).
 * 
 * You must not use any built-in sorting functions to solve this problem.
 * 
 * Example 1:
 * 
 * Input: nums = [1,0,1,2]
 * 
 * Output: [0,1,1,2] Example 2:
 * 
 * Input: nums = [2,1,0]
 * 
 * Output: [0,1,2]
 * 
 * It can be solved using bucket sort as well.
 */
//*********************************************//