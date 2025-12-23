package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
	List<Integer> res;

	public List<Integer> inorderTraversal(TreeNode root) {
		res = new ArrayList<Integer>();
		inorder(root);
		return res;

	}

	public void inorder(TreeNode root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		res.add(root.val);
		inorder(root.right);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Input: root = [1,2,3,4,5,6,7]

// Output: [4,2,5,1,6,3,7]

	}

}

//--------------------------------------------------------------//
// You are given the root of a binary tree, return the inorder traversal of its nodes' values.

/*
 * Time complexity: O ( n ) O(n) Space complexity: O ( n ) O(n) space for the
 * recursion stack. O ( n ) O(n) space for the output array.
 */

//-------------------------------------------------------------//		
