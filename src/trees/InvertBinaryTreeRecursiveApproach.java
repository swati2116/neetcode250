package trees;

public class InvertBinaryTreeRecursiveApproach {
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		root.left = right;
		root.right = left;
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: root = [1,2,3,4,5,6,7]

		//	Output: [1,3,2,7,6,5,4]
	}

}
