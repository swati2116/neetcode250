package stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	private void backtrack(int openN, int closedN, int n, List<String> res, StringBuilder stack) {
		if (openN == closedN && openN == n) {
			res.add(stack.toString());
			return;
		}

		if (openN < n) {
			stack.append('(');
			backtrack(openN + 1, closedN, n, res, stack);
			stack.deleteCharAt(stack.length() - 1);
		}
		if (closedN < openN) {
			stack.append(')');
			backtrack(openN, closedN + 1, n, res, stack);
			stack.deleteCharAt(stack.length() - 1);
		}
	}

	public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<>();
		StringBuilder stack = new StringBuilder();
		backtrack(0, 0, n, res, stack);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateParentheses gp = new GenerateParentheses();
		List<String> parenthesis = gp.generateParenthesis(2);
		for (String s : parenthesis) {
			System.out.println(s);
		}

	}

}

//---------------------------------------------------//
/*
 * You are given an integer n. Return all well-formed parentheses strings that
 * you can generate with n pairs of parentheses.
 * 
 * Example 1:
 * 
 * Input: n = 1
 * 
 * Output: ["()"] Example 2:
 * 
 * Input: n = 3
 * 
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 */

//----------------------------------------------------------//