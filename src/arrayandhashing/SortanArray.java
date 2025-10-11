package arrayandhashing;

public class SortanArray {

	public static void main(String[] args) {
		SortanArray sa= new SortanArray();
	int result[]=	sa.sortArray(new int[] {10,9,1,1,1,2,3,1});
	 for(int i: result)
	 {
		 System.out.print(i);
	 }
	}
	 public int[] sortArray(int[] nums) {
	        
	        for(int i =0; i<nums.length; i++)
	        {
	           for(int j=i+1; j<nums.length;j++)
	           {
	            if(nums[i]>nums[j])
	            {
	                int temp=nums[i];
	                nums[i]=nums[j];
	                nums[j]=temp;
	            }
	           }
	            
	        }
	        return nums;
	    }

}
