package trees;

import java.util.HashMap;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		HashMap<Integer, Integer> inmap = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			inmap.put(inorder[i], i);
		}
		TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inmap);
		return root;
	}

	public TreeNode buildTree(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend,
			HashMap<Integer, Integer> inmap) {
		if (prestart > preend || instart > inend) {
			return null;
		}
		TreeNode root = new TreeNode(preorder[prestart]);
		int inroot = inmap.get(root.val);
		int numsleft = inroot - instart;
		root.left = buildTree(preorder, prestart + 1, prestart + numsleft, inorder, instart, inroot - 1, inmap);
		root.right = buildTree(preorder, prestart + numsleft + 1, preend, inorder, inroot + 1, inend, inmap);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: preorder = [1,2,3,4], inorder = [2,1,3,4]

			//	Output: [1,2,3,null,null,null,4]
	}

}

//-----------------------------------------------------------------------------------//
/*
 * You are given two integer arrays preorder and inorder.
 * 
 * preorder is the preorder traversal of a binary tree inorder is the inorder
 * traversal of the same tree Both arrays are of the same size and consist of
 * unique values. Rebuild the binary tree from the preorder and inorder
 * traversals and return its root.
 */
//-------------------------------------------------------------------------------------//
/*
 * Time & Space Complexity Time complexity: O ( n ) O(n) Space complexity: O ( n
 * ) O(n)
 */


