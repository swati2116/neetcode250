package trees;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		return dfsHeight(root) != -1;

	}

	public int dfsHeight(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int lh = dfsHeight(node.left);
		if (lh == -1) {
			return -1;
		}
		int rh = dfsHeight(node.right);
		if (rh == -1) {
			return -1;
		}
		if (Math.abs(lh - rh) > 1) {
			return -1;
		}
		return Math.max(lh, rh) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Input: root = [1,2,3,null,null,4,null,5]

		// Output: false
	}

}


//---------------------------------------------------------------------------//
//Given a binary tree, return true if it is height-balanced and false otherwise.

//A height-balanced binary tree is defined as a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
/*
 * Time complexity: O ( n ) O(n) Space complexity: O ( h ) O(h) Best Case
 * (balanced tree): O ( l o g ( n ) ) O(log(n)) Worst Case (degenerate tree): O
 * ( n ) O(n)
 */
