package arrayandhashing;

public class ConcatenationofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcatenationofArray obj= new ConcatenationofArray();
		int ans[]=obj.getConcatenationOptimal(new int[] {1,2,3, 4});

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}
	 public int[] getConcatenation(int[] nums) {
	       int[] ans= new int[2 * nums.length];  
	       System.out.println("length of ans ="+ ans.length);
	       int k=0;
	        for(int i=0; i<2; i++)
	        {
	        	for(int j=0; j<nums.length; j++)
	            ans[k++]= nums[j];

	        }
	       
	       return ans;
	    }
	 
	 public int[] getConcatenationOptimal(int[] nums) {
	       int[] ans= new int[2 * nums.length];  
	       System.out.println("length of ans ="+ ans.length);
	        	for(int j=0; j<nums.length; j++)
	        	{
	        		
	            ans[j]= nums[j];
	            ans[nums.length+j]=nums[j];
	            
	        	}

	        
	       
	       return ans;
	    }
}


//*************************************//
///*Concatenation of Array
//Solved 
//You are given an integer array nums of length n. Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Return the array ans.
//
//Example 1:
//
//Input: nums = [1,4,1,2]
//
//Output: [1,4,1,2,1,4,1,2]
//Example 2:
//
//Input: nums = [22,21,20,1]
//
//Output: [22,21,20,1,22,21,20,1]*/
//**********************************************//


