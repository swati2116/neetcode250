package TwoPointers;

public class TrappingRainWater {
    public int trap(int[] height) {
        int l=0, r= height.length-1, ans=0,lmax=0,rmax=0;
        while(l<r)  
        {
          lmax= Math.max(lmax,height[l]);
          rmax= Math.max(rmax,height[r]);
          if(lmax<rmax)
          {
            ans= ans+(lmax-height[l]);
            l++;
          }
          else
          {
            ans= ans+(rmax-height[r]);
            r--;
          }
         
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrappingRainWater trw= new TrappingRainWater();
		int ans= trw.trap(new int[] {0,2,0,3,1,0,1,3,2,1});
		System.out.println(ans);
	}

}

//******************************************************//

/*
 * Trapping Rain Water Solved You are given an array of non-negative integers
 * height which represent an elevation map. Each value height[i] represents the
 * height of a bar, which has a width of 1.
 * 
 * Return the maximum area of water that can be trapped between the bars.
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: height = [0,2,0,3,1,0,1,3,2,1]
 * 
 * Output: 9
 */

//----------------youtube link------------------------//
//  https://www.youtube.com/watch?v=UHHp8USwx4M
