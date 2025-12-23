package trees;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeandDeserializeBinaryTree {
	public String serialize(TreeNode root) {
		StringBuilder res = new StringBuilder();
		if (root == null) {
			return " ";
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node == null) {
				res.append("n ");
				continue;
			}
			res.append(node.val).append(" ");
			queue.add(node.left);
			queue.add(node.right);
		}
		return res.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		if (data == " ") {
			return null;
		}
		String[] values = data.split(" ");
		Queue<TreeNode> queue = new LinkedList<>();

		TreeNode root = new TreeNode(Integer.parseInt(values[0]));
		queue.add(root);
		for (int i = 1; i < values.length; i++) {
			TreeNode parent = queue.poll();
			if (!values[i].equals("n")) {
				TreeNode left = new TreeNode(Integer.parseInt(values[i]));
				parent.left = left;
				queue.add(left);
			}
			if (!values[++i].equals("n")) {
				TreeNode right = new TreeNode(Integer.parseInt(values[i]));
				parent.right = right;
				queue.add(right);
			}

		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		SerializeandDeserializeBinaryTree sdbt = new SerializeandDeserializeBinaryTree();
		String res = sdbt.serialize(root);
		sdbt.deserialize(res);

	}

}

//---------------------------------------------------------------------------------------------//

/*
 * Implement an algorithm to serialize and deserialize a binary tree.
 * 
 * Serialization is the process of converting an in-memory structure into a
 * sequence of bits so that it can be stored or sent across a network to be
 * reconstructed later in another computer environment.
 * 
 * You just need to ensure that a binary tree can be serialized to a string and
 * this string can be deserialized to the original tree structure. There is no
 * additional restriction on how your serialization/deserialization algorithm
 * should work.
 * 
 * Note: The input/output format in the examples is the same as how NeetCode
 * serializes a binary tree. You do not necessarily need to follow this format.
 */
//---------------------------------------------------------------------------------------------//

/*
 * Time & Space Complexity Time complexity: O ( n ) O(n) Space complexity: O ( n
 * ) O(n)
 */
