package trees;

public class DiameterofBinaryTree {
	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int lh = maxHeight(root.left);
		int rh = maxHeight(root.right);
		int diameter = lh + rh;
		int sub = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
		return Math.max(diameter, sub);

	}

	public int maxHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input: root = [1,null,2,3,4,5]

		// Output: 3
	}

}

//--------------------------------------------------------------------------//
/*
 * The diameter of a binary tree is defined as the length of the longest path
 * between any two nodes within the tree. The path does not necessarily have to
 * pass through the root.
 * 
 * The length of a path between two nodes in a binary tree is the number of
 * edges between the nodes. Note that the path can not include the same node
 * twice.
 * 
 * Given the root of a binary tree root, return the diameter of the tree.
 * 
 * Time complexity: O ( n ) O(n) Space complexity: O ( h ) O(h) Best Case
 * (balanced tree): O ( l o g ( n ) ) O(log(n)) Worst Case (degenerate tree): O
 * ( n ) O(n) Where n n is the number of nodes in the tree and h h is the height
 * of the tree.
 */
//-----------------------------------------------------------------------------//