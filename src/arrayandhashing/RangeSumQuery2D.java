package arrayandhashing;

public class RangeSumQuery2D {
	private int[][] prefixSum;

	public RangeSumQuery2D(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return;
		}

		int rows = matrix.length;
		int cols = matrix[0].length;

		prefixSum = new int[rows + 1][cols + 1];

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1]
						+ matrix[i - 1][j - 1];
			}
		}

	}

	public int sumRegion(int row1, int col1, int row2, int col2) {
		return prefixSum[row2 + 1][col2 + 1] - prefixSum[row1][col2 + 1] - prefixSum[row2 + 1][col1]
				+ prefixSum[row1][col1];
	}

	public static void main(String args[]) {
		RangeSumQuery2D rsqd = new RangeSumQuery2D(new int[][] { { 3, 0, 1, 4, 2 }, { 5, 6, 3, 2, 1 },
				{ 1, 2, 0, 1, 5 }, { 4, 1, 0, 1, 7 }, { 1, 0, 3, 0, 5 } });
		int sum = rsqd.sumRegion(2, 1, 4, 3);
		System.out.println(sum);
	}

}

//[[0, 0, 0, 0, 0, 0], [0, 3, 3, 4, 8, 10], [0, 8, 14, 18, 24, 27], [0, 9, 17, 21, 28, 36], [0, 13, 22, 26, 34, 49], [0, 14, 23, 30, 38, 58]]
 //[0,0, 0, 0, 0, 0]
// [0,3, 0, 1, 4, 2]
// [0,5, 6, 3, 2, 1]
// [0,1, 2, 0, 1, 5]
// [0,4, 1, 0, 1, 7]
// [0,1, 0, 3, 0, 5]
//[3, 3, 4, 8, 10]      [0, 0, 0, 0, 0, 0]   
//[8, 14, 18, 24, 27]   [0, 3, 3, 4, 8, 10]     0+0-0+3=0, 
//[9, 17, 21, 28, 36]   [0, 8, 14, 18, 24, 27]
//[13, 22, 26, 34, 49]	[0, 9, 17, 21, 28, 36]	
//[14, 23, 30, 38, 58]  [0, 13, 22, 26, 34, 49]
//                      [0, 14, 23, 30, 38, 58]

// Follow youtube link https://www.youtube.com/watch?v=tk0Twx2VQy8 to understand the logics

//---------------------problem description------------------
/*
 * You are given a 2D matrix matrix, handle multiple queries of the following
 * type:
 * 
 * Calculate the sum of the elements of matrix inside the rectangle defined by
 * its upper left corner (row1, col1) and lower right corner (row2, col2).
 * Implement the NumMatrix class:
 * 
 * NumMatrix(int[][] matrix) Initializes the object with the integer matrix
 * matrix. int sumRegion(int row1, int col1, int row2, int col2) Returns the sum
 * of the elements of matrix inside the rectangle defined by its upper left
 * corner (row1, col1) and lower right corner (row2, col2). You must design an
 * algorithm where sumRegion works on O(1) time complexity. Example 1:
 * 
 * Input: ["NumMatrix", "sumRegion", "sumRegion", "sumRegion"] [[[[3, 0, 1, 4,
 * 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]], [2,
 * 1, 4, 3], [1, 1, 2, 2], [1, 2, 2, 4]]
 * 
 * Output: [null, 8, 11, 12] Explanation: NumMatrix numMatrix = new
 * NumMatrix([[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1,
 * 7], [1, 0, 3, 0, 5]]); numMatrix.sumRegion(2, 1, 4, 3); // return 8 (i.e sum
 * of the red rectangle) numMatrix.sumRegion(1, 1, 2, 2); // return 11 (i.e sum
 * of the green rectangle) numMatrix.sumRegion(1, 2, 2, 4); // return 12 (i.e
 * sum of the blue rectangle)
 */