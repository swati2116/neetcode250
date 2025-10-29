package stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	Stack<Integer> stack = new Stack<>();

	public int evalRPN(String[] tokens) {
		for (String s : tokens) {
			if (s.equals("+")) {
				stack.push(stack.pop() + stack.pop());
			} else if (s.equals("-")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b - a);
			} else if (s.equals("*")) {
				stack.push(stack.pop() * stack.pop());
			} else if (s.equals("/"))

			{
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b / a);
			} else {
				stack.push(Integer.parseInt(s));
			}
		}

		return stack.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvaluateReversePolishNotation erpn = new EvaluateReversePolishNotation();
		int eval = erpn.evalRPN(new String[] { "1", "2", "+", "3", "*", "4", "-" });
		System.out.println(eval);
	}

}

//------------------------------------------------//
/*
 * You are given an array of strings tokens that represents a valid arithmetic
 * expression in Reverse Polish Notation.
 * 
 * Return the integer that represents the evaluation of the expression.
 * 
 * The operands may be integers or the results of other operations.The operators
 * include'+','-','*',and'/'. Assume that division between integers always
 * truncates toward zero.Example 1:
 * 
 * Input:tokens=["1","2","+","3","*","4","-"]
 * 
 * Output:5
 * 
 * Explanation:((1+2)*3)-4=5
 */

//---------------------------------------------------//