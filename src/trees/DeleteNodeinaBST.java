package trees;

public class DeleteNodeinaBST {
	public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) {
			return null;
		}
		if (root.val == key) {
			return joining(root);
		}
		TreeNode curr = root;
		while (curr != null) {
			if (curr.val > key) {
				if (curr.left.val == key) {
					curr.left = joining(curr.left);
					break;
				} else {
					curr = curr.left;
				}
			} else {
				if (curr.right.val == key) {
					curr.right = joining(curr.right);
					break;
				} else {
					curr = curr.right;
				}
			}

		}
		return root;

	}

	public TreeNode joining(TreeNode curr) {
		if (curr.left == null) {
			return curr.right;
		} else if (curr.right == null) {
			return curr.left;
		}
		TreeNode rightNode = curr.right;
		TreeNode lastRightNode = findLastRight(curr.left);
		lastRightNode.right = rightNode;
		return curr.left;
	}

	public TreeNode findLastRight(TreeNode curr) {
		if (curr == null) {
			return null;
		}
		return findLastRight(curr.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//---------------------------------------------------------------------------//
/*
 * You are given a root node reference of a BST and a key, delete the node with
 * the given key in the BST, if present. Return the root node reference
 * (possibly updated) of the BST.
 * 
 * Basically, the deletion can be divided into two stages:
 * 
 * Search for a node to remove. If the node is found, delete the node. Note:
 * There can be multiple results after deleting the node, return any one of
 * them.
 */