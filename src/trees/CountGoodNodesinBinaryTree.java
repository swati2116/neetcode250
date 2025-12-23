package trees;

public class CountGoodNodesinBinaryTree {
	int goodCountNodes = 0;

	public int goodNodes(TreeNode root) {

		dfs(root, root.val);
		return goodCountNodes;
	}

	public void dfs(TreeNode node, int max) {
		if (node == null) {
			return;
		}
		if (node.val >= max) {
			max = node.val;
			goodCountNodes += 1;

		}
		if (node.left != null)
			dfs(node.left, max);

		if (node.right != null)
			dfs(node.right, max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input: root = [2,1,1,3,null,1,5]

		// Output: 3

	}

}

//--------------------------------------------------------------------------------//
/*
 * Within a binary tree, a node x is considered good if the path from the root
 * of the tree to the node x contains no nodes with a value greater than the
 * value of node x
 * 
 * Given the root of a binary tree root, return the number of good nodes within
 * the tree.
 */
 //--------------------------------------------------------------------------------//
