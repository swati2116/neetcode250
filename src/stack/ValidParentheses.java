package stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		HashMap<Character, Character> closeToOpen = new HashMap<>();
		Stack<Character> stack = new Stack<>();
		closeToOpen.put(')', '(');
		closeToOpen.put(']', '[');
		closeToOpen.put('}', '{');
		for (int i = 0; i < s.length(); i++) {
			if (closeToOpen.containsKey(s.charAt(i))) {
				if (!stack.isEmpty() && stack.peek() == closeToOpen.get(s.charAt(i))) {
					stack.pop();
				} else {
					return false;
				}
			} else {
				stack.push(s.charAt(i));
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses vp = new ValidParentheses();
		boolean valid = vp.isValid("([{}])");
		System.out.println(valid);
	}

}

//--------------------------------------------------------//
/*
 * You are given a string s consisting of the following characters: '(', ')',
 * '{', '}', '[' and ']'.
 * 
 * The input string s is valid if and only if:
 * 
 * Every open bracket is closed by the same type of close bracket. Open brackets
 * are closed in the correct order. Every close bracket has a corresponding open
 * bracket of the same type. Return true if s is a valid string, and false
 * otherwise.
 * 
 * Example 1:
 * 
 * Input: s = "[]"
 * 
 * Output: true Example 2:
 * 
 * Input: s = "([{}])"
 * 
 * Output: true Example 3:
 * 
 * Input: s = "[(])"
 * 
 * Output: false Explanation: The brackets are not closed in the correct order.
 */
//--------------------Explanation------------------------
//The hashmap contains closing bracket with value as opening bracket.
//stack contains all opening bracket
