package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
	List<Integer> res;

	public List<Integer> preorderTraversal(TreeNode root) {
		res = new ArrayList<Integer>();
		preorder(root);
		return res;
	}

	public void preorder(TreeNode node) {
		if (node == null) {
			return;
		}
		res.add(node.val);
		preorder(node.left);
		preorder(node.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: root = [1,2,3,4,5,6,7]

			//	Output: [1,2,4,5,3,6,7]
	}

}

//------------------------------------------------------------------------//
/*
 * Time & Space Complexity Time complexity: O ( n ) O(n) Space complexity: O ( n
 * ) O(n) space for the recursion stack. O ( n ) O(n) space for the output
 * array.
 * //---------------------------------------------------------------------------
 * //
 */