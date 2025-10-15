package arrayandhashing;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum ts= new TwoSum();
		int result[]=ts.twoSumOptimal(new int[]{3,4,5,6}, 7);
		System.out.print(result[0]);
		System.out.println(" "+result[1]);
	}
	 public int[] twoSum(int[] nums, int target) {
	        int []result= new int[2];
	        for(int i=0; i<nums.length; i++)
	        {
	            int indexValue= nums[i];
	            int targetcheck= target-indexValue;
	            for(int j=i+1; j<nums.length; j++)
	            {
	                if(nums[j]==targetcheck)
	                {
	                    result[0]=i;
	                    result[1]=j;
	                    break;
	                }
	            }
	        }
	        return result;
	    }
	 
	 public int[] twoSumOptimal(int[] nums, int target) {
		 int []result= new int[2];
		 int l=0, r=1;
		 while(r<nums.length)
		 {
			 if(nums[l]+nums[r]==target)
			 {
				 result[0]=nums[l];
				 result[1]=nums[r];
				 break;
			 }
			 else
			 {
				 r++;
			 }
			 l++;
		 }
		return result; 
	 }

}

//************************************************************//
//Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
//
//You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
//
//Return the answer with the smaller index first.
//
//Example 1:
//
//Input: 
//nums = [3,4,5,6], target = 7
//
//Output: [0,1]
//Explanation: nums[0] + nums[1] == 7, so we return [0, 1].
//
//Example 2:
//
//Input: nums = [4,5,6], target = 10
//
//Output: [0,2]
//Example 3:
//
//Input: nums = [5,5], target = 10
//
//Output: [0,1]
//Constraints:
//
//2 <= nums.length <= 1000
//-10,000,000 <= nums[i] <= 10,000,000
//-10,000,000 <= target <= 10,000,000

//Using hashmap
//public int[] twoSum(int[] nums, int target) {
//    Map<Integer, Integer> indices = new HashMap<>();  // val -> index
//
//    for (int i = 0; i < nums.length; i++) {
//        indices.put(nums[i], i);
//    }
//
//    for (int i = 0; i < nums.length; i++) {
//        int diff = target - nums[i];
//        if (indices.containsKey(diff) && indices.get(diff) != i) {
//            return new int[]{i, indices.get(diff)};
//        }
//    }
//
//    return new int[0];
//}

//*********************************************************//
