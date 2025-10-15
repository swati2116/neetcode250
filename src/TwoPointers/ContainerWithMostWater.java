package TwoPointers;

public class ContainerWithMostWater {
	public int maxArea(int[] heights) {
		int r = heights.length - 1, res = 0, l = 0;
		while (l < r) {
			int minheight = Math.min(heights[l], heights[r]);
			res = Math.max(minheight * (r - l), res);
			if (heights[l] <= heights[r]) {
				l++;
			} else {
				r--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainerWithMostWater cmw = new ContainerWithMostWater();
		int maxarea = cmw.maxArea(new int[] { 1, 7, 2, 5, 4, 7, 3, 6 });
		System.out.println(maxarea);

	}

}

//********************************************************//

/*
 * Container With Most Water Solved You are given an integer array heights where
 * heights[i] represents the height of the i t h i th bar.
 * 
 * You may choose any two bars to form a container. Return the maximum amount of
 * water a container can store.
 * 
 * Example 1:
 * 
 * Input:height=[1,7,2,5,4,7,3,6]
 * 
 * Output:36 Example 2:
 * 
 * Input:height=[2,2,2]
 * 
 * Output:4
 */

//----------------solution------------//
// Neetcode solution video 


