package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {

		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> wrapList = new ArrayList<>();
		if (root == null) {
			return wrapList;
		}
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> sublist = new ArrayList<>();
			int queuesize = queue.size();
			for (int i = 0; i < queuesize; i++) {
				TreeNode node = queue.poll();

				if (node != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
				sublist.add(node.val);
			}
			wrapList.add(sublist);
		}
		return wrapList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
	        
	        // Create an instance of the Solution class
	        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
	        // Perform level-order traversal
	        List<List<Integer>> result = solution.levelOrder(root);
	        
	        // Printing the level-order traversal result
	        System.out.println("Level Order Traversal of Tree:");
	        for (List<Integer> level : result) {
	            System.out.println(level);
	        }

	}

}
