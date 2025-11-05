package binarysearch;

public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
     int targetrow=searchPotentialRow(matrix,target);
     if(targetrow!=-1)
     {
       int low=0;
       int high=matrix[targetrow].length-1;
       while(low<=high)
       {
    	   int mid= low+(high-low)/2;
    	   if(matrix[targetrow][mid]==target)
    	   {
    		   return true;
    	   }
    	   else if(matrix[targetrow][mid]<target)
    	   {
    		   low=mid+1;
    	   }
    	   else
    	   {
    		   high=mid-1;
    	   }
       }
       
     }
     
      return false;  
    }
    public int searchPotentialRow(int[][] matrix, int target)
    {
    	int low=0;
    	int high= matrix.length-1;
    	while(low<=high)
    	{
    		int mid= low+(high-low)/2;
    		if(matrix[mid][0]<=target && target<=matrix[mid][matrix[high].length-1])
    		{
    			return mid;
    		}
    		else if(matrix[mid][0]<target)
    		{
    			low= mid+1;
    		}
    		else
    		{
    			high=mid-1;
    		}
    	}
    	 
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Searcha2DMatrix sm= new Searcha2DMatrix();
		boolean res=sm.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},3);
		System.out.println(res);

	}

}

//--------------------------------------------------------------//
/*
 * You are given an m x n 2-D integer array matrix and an integer target.
 * 
 * Each row in matrix is sorted in non-decreasing order. The first integer of
 * every row is greater than the last integer of the previous row. Return true
 * if target exists within matrix or false otherwise.
 * 
 * Can you write a solution that runs in O(log(m * n)) time?
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 10
 * 
 * Output: true Example 2:
 * 
 * 
 * 
 * Input: matrix = [[1,2,4,8],[10,11,12,13],[14,20,30,40]], target = 15
 * 
 * Output: false
 */

//------------------youtube link--------//
// https://www.youtube.com/watch?v=RhPqIIOUiS8
