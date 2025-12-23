package trees;

public class BinaryTreeMaximumPathSum {

	public int maxPathSum(TreeNode root) {
		int[] max = new int[1];
		maxPathSum(root, max);
		return max[0];
	}

	public int maxPathSum(TreeNode root, int[] max) {
		if (root == null) {
			return 0;
		}
		int leftmax = Math.max(0, maxPathSum(root.left, max));
		int rightmax = Math.max(0, maxPathSum(root.right, max));
		max[0] = Math.max(max[0], root.val + leftmax + rightmax);
		return Math.max(leftmax, rightmax) + root.val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: root = [1,2,3]

			//	Output: 6
	}

}

//---------------------------------------------------------------------------------------//
/*
 * Given the root of a non-empty binary tree, return the maximum path sum of any
 * non-empty path.
 * 
 * A path in a binary tree is a sequence of nodes where each pair of adjacent
 * nodes has an edge connecting them. A node can not appear in the sequence more
 * than once. The path does not necessarily need to include the root.
 * 
 * The path sum of a path is the sum of the node's values in the path.
 */
//------------------------------------------------------------------------------------------//
/*
 * Time & Space Complexity Time complexity: O ( n ) O(n) Space complexity: O ( n
 * ) O(n)
 */