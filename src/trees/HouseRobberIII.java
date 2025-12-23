package trees;

public class HouseRobberIII {
	public int rob(TreeNode root) {
		int[] options = travel(root);
		return Math.max(options[0], options[1]);

	}

	public int[] travel(TreeNode root) {
		// if root is null then return value as 0
		if (root == null) {
			return new int[2];
		}
           // travel through left and insert value of choosed max
		int[] leftchoices = travel(root.left);
		// travel through left and insert value of choosed max
		int[] rightchoices = travel(root.right);
		int[] options = new int[2];
		// store value at index 0 if looted
		options[0] = root.val + leftchoices[1] + rightchoices[1];
		// store value at index 1 if not looted
		options[1] = Math.max(leftchoices[0], leftchoices[1]) + Math.max(rightchoices[0], rightchoices[1]);

		return options;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: root = [1,null,2,3,5,4,2]

			//	Output: 12
	}
	
	//The thief has found himself a new place for his thievery again. There is only one entrance to this area, called root.

	/*
	 * In this new place, there are houses and each house has its only one parent
	 * house. All houses in this place form a binary tree. It will automatically
	 * contact the police if two directly-linked houses were broken.
	 * 
	 * You are given the root of the binary tree, return the maximum amount of money
	 * the thief can rob without alerting the police.
	 * 
	 */
	
	

}

/*
 * Time & Space Complexity Time complexity: O ( n ) O(n) Space complexity: O ( n
 * ) O(n) for recursion stack.
 */
