package trees;

public class ValidBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        
    }
    public boolean isValidBST(TreeNode root,int min, int max) {
        if(root == null)
        {
            return true;
        }
        if(root.val<=min || root.val>=max)
        {
            return false;
        }
        return isValidBST(root.left,min,root.val) && isValidBST(root.right,root.val,max);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Input: root = [2,1,3]

		//		Output: true

	}

}

//-----------------------------------------------------------------------------//

/*
 * Given the root of a binary tree, return true if it is a valid binary search
 * tree, otherwise return false.
 * 
 * A valid binary search tree satisfies the following constraints:
 * 
 * The left subtree of every node contains only nodes with keys less than the
 * node's key. The right subtree of every node contains only nodes with keys
 * greater than the node's key. Both the left and right subtrees are also binary
 * search trees.
 */

//--------------------------------------------------------------------------------//

/*
 * Time & Space Complexity 
 * Time complexity: O ( n )  Space complexity: O(n)
 */
