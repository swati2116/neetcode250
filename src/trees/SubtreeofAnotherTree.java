package trees;

public class SubtreeofAnotherTree {
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
		String fulltree = preOrderTraversal(root);
		String subtree = preOrderTraversal(subRoot);
		return fulltree.contains(subtree);

	}

	public String preOrderTraversal(TreeNode node) {
		if (node == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(node.val);
		sb.append(preOrderTraversal(node.left));
		sb.append(preOrderTraversal(node.right));

		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: root = [1,2,3,4,5], subRoot = [2,4,5]

			//	Output: true
	}

}

//---------------------------------------------------------------------------------------//
/*
 * Given the roots of two binary trees root and subRoot, return true if there is
 * a subtree of root with the same structure and node values of subRoot and
 * false otherwise.
 * 
 * A subtree of a binary tree tree is a tree that consists of a node in tree and
 * all of this node's descendants. The tree tree could also be considered as a
 * subtree of itself.
 */
//-----------------------------------------------------------------------------//
