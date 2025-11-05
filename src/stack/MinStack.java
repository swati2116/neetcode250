package stack;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stack;
	Stack<Integer> minstack;

	public MinStack() {
		stack = new Stack<>();
		minstack = new Stack<>();

	}

	public void push(int val) {
		stack.push(val);
		if (minstack.isEmpty() || val <= minstack.peek()) {
			minstack.push(val);
		}
	}

	public void pop() {
		int poppedVal = stack.pop();
		if (poppedVal == minstack.peek()) {
			minstack.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minstack.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
		minStack.push(1);
		minStack.push(2);
		minStack.push(0);
		minStack.getMin(); // return 0
		minStack.pop();
		minStack.top(); // return 2
		minStack.getMin(); // return 1
	}

}
//-----------------------------------------------//

/*
 * Minimum Stack Solved Design a stack class that supports the push, pop, top,
 * and getMin operations.
 * 
 * MinStack() initializes the stack object. void push(int val) pushes the
 * element val onto the stack. void pop() removes the element on the top of the
 * stack. int top() gets the top element of the stack. int getMin() retrieves
 * the minimum element in the stack. Each function should run in O ( 1 ) O(1)
 * time.
 * 
 * Example 1:
 * 
 * Input: ["MinStack", "push", 1, "push", 2, "push", 0, "getMin", "pop", "top",
 * "getMin"]
 * 
 * Output: [null,null,null,null,0,null,2,1]
 * 
 * Explanation: MinStack minStack = new MinStack(); minStack.push(1);
 * minStack.push(2); minStack.push(0); minStack.getMin(); // return 0
 * minStack.pop(); minStack.top(); // return 2 minStack.getMin(); // return 1
 */
//--------------------youtube link---------------------//
// https://www.youtube.com/watch?v=lkYzexIVlOY
