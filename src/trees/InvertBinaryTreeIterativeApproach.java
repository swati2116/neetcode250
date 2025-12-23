package trees;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTreeIterativeApproach {
	 public TreeNode invertTree(TreeNode root) {
	        
	        if(root == null)
	        {
	            return null;
	        }

	        final Queue<TreeNode> queue= new LinkedList();
	        queue.add(root);
	        while(!queue.isEmpty())
	        {
	            TreeNode node= queue.poll();
	            TreeNode temp= new TreeNode();
	            temp= node.left;
	            node.left=node.right;
	            node.right=temp;

	            if(node.left!=null)
	            {
	                queue.add(node.left);
	            }
	            if(node.right!=null)
	            {
	                queue.add(node.right);
	            }

	        }
	        return root;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: root = [1,2,3,4,5,6,7]

			//	Output: [1,3,2,7,6,5,4]
	}

}

//---------------------------------------------------//
/*
 * You are given the root of a binary tree root. Invert the binary tree and
 * return its root.
 * 
 * Time complexity: O ( n ) O(n) Space complexity: O ( n ) O(n)
 */
