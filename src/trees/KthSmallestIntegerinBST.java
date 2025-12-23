package trees;

public class KthSmallestIntegerinBST {
	int count = -1, res = -1;

	public int kthSmallest(TreeNode root, int k) {

		return inorderDFS(root, k);
	}

	public int inorderDFS(TreeNode node, int k) {
		if (node == null) {
			return -1;
		}

		inorderDFS(node.left, k);
		count++;
		if (count == k - 1) {
			res = node.val;
		}
		inorderDFS(node.right, k);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthSmallestIntegerinBST ksib= new KthSmallestIntegerinBST();
		    TreeNode root = new TreeNode(2);
	        root.left = new TreeNode(1);
	        root.right = new TreeNode(3);
	        ksib.kthSmallest(root, 1);

	}

}

/*
 * //---------------------------------------------------------------------------
 * ------// Given the root of a binary search tree, and an integer k, return the
 * kth smallest value (1-indexed) in the tree.
 * 
 * A binary search tree satisfies the following constraints:
 * 
 * The left subtree of every node contains only nodes with keys less than the
 * node's key. The right subtree of every node contains only nodes with keys
 * greater than the node's key. Both the left and right subtrees are also binary
 * search trees.
 */

//----------------------------------------------------------------------------------//

/*
 * Time & Space Complexity Time complexity: O ( n ) O(n) Space complexity: O ( 1
 * ) O(1)
 */
