package trees;

public class SameBinaryTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p != null && q != null && p.val == q.val) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: p = [1,2,3], q = [1,2,3]

		//Output: true
	}

}

//---------------------------------------------------------------------------//

//Given the roots of two binary trees p and q, return true if the trees are equivalent, otherwise return false.

//Two binary trees are considered equivalent if they share the exact same structure and the nodes have the same values.

/*
 * Time complexity: O ( n ) O(n) Space complexity: O ( n ) O(n) Best Case
 * (balanced tree): O ( l o g ( n ) ) O(log(n)) Worst Case (degenerate tree): O
 * ( n ) O(n) Where n n is the number of nodes in the tree an
 */
//---------------------------------------------------------------------------//
