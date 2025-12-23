package trees;

public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
		int leftlength = 0, rightlength = 0;
		if (root == null) {
			return 0;
		}
		leftlength = 1 + maxDepth(root.left);

		rightlength = 1 + maxDepth(root.right);

		return Math.max(leftlength, rightlength);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input: root = [1,2,3,null,null,4]

		// Output: 3
	}

}
