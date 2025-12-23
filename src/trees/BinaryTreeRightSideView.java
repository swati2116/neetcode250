package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
	List<Integer> res;

	public List<Integer> rightSideView(TreeNode root) {
		res = new ArrayList<>();
		rightnode(root, 0);
		return res;
	}

	public void rightnode(TreeNode node, int treeDepth) {
		if (node == null) {
			return;
		}
		if (treeDepth == res.size()) {
			res.add(node.val);
		}

		rightnode(node.right, treeDepth + 1);
		rightnode(node.left, treeDepth + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//----------------------------------------------------------------------------------//

/*
 * You are given the root of a binary tree. Return only the values of the nodes
 * that are visible from the right side of the tree, ordered from top to bottom.
 *///----------------------------------------------------------------------------------//