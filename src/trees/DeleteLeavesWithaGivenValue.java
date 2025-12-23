package trees;

public class DeleteLeavesWithaGivenValue {
	public TreeNode removeLeafNodes(TreeNode root, int target) {
		if (root == null) {
			return null;
		}
		// go till the left of tree
		root.left = removeLeafNodes(root.left, target);
		//go till the right of tree
		root.right = removeLeafNodes(root.right, target);
		//if left is null , right is null and value is target then return null, it will make root as null.
		if (root.left == null && root.right == null && root.val == target) {
			return null;
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//------------------------------------------------------------------------------------//
/*
 * You are given a binary tree root and an integer target, delete all the leaf
 * nodes with value target.
 * 
 * Note that once you delete a leaf node with value target, if its parent node
 * becomes a leaf node and has the value target, it should also be deleted (you
 * need to continue doing that until you cannot).
 */
//-------------------------------------------------------------------------------//
/*Time & Space Complexity
Time complexity: 
O
(
n
)
O(n)
Space complexity: 
O
(
n
)
O(n) for recursion stack.*/