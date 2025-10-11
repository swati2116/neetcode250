package arrayandhashing;

public class ProductsofArrayExceptSelf {
	public int result[], left[],right[];
	ProductsofArrayExceptSelf()
	{
		
	}
	
	public int[] productArray(int[] nums)
	{ 
		result =new int[nums.length];
		left= new int[nums.length];
		right=new int[nums.length];
		left[0]=1;
		right[nums.length-1]=1;
		for(int i=1; i<nums.length ; i++)
		{
			left[i]=nums[i-1]*left[i-1];
		}
		for(int j=nums.length-2; j>=0; j--)
		{
			right[j]= nums[j+1]*right[j+1];
		}
		
		for(int i=0; i<nums.length ;i++)
		{
			result[i]= left[i]*right[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductsofArrayExceptSelf paes= new ProductsofArrayExceptSelf();
			int result[]=paes.productArray(new int[] {1,2,4,6});
			for(int no: result)
			{
				System.out.println(no);
			}
	}

}

//***************************************************************//
/*
 * Given an integer array nums, return an array output where output[i] is the
 * product of all the elements of nums except nums[i].
 * 
 * Each product is guaranteed to fit in a 32-bit integer.
 * 
 * Follow-up: Could you solve it in O ( n ) O(n) time without using the division
 * operation?
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,4,6]
 * 
 * Output: [48,24,12,8] Example 2:
 * 
 * Input: nums = [-1,0,1,2,3]
 * 
 * Output: [0,-6,0,0,0]
 */
