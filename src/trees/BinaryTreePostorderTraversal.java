package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
	List<Integer> res;

	public List<Integer> postorderTraversal(TreeNode root) {
		res = new ArrayList<Integer>();
		postorder(root);
		return res;
	}

	public void postorder(TreeNode node) {
		if (node == null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		res.add(node.val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: root = [1,2,3,4,5,6,7]

		//Output: [4,5,2,6,7,3,1]
	}

}

//------------------------------------------------------------------------------//
/*
 * Time complexity: O ( n ) O(n) Space complexity: O ( n ) O(n) space for the
 * recursion stack. O ( n ) O(n) space for the output array.
 */
//----------------------------------------------------------------------------//
