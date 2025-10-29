package stack;

import java.util.Stack;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
		Stack<Integer> stack = new Stack<>();
		int[] res = new int[temperatures.length];
		for (int i = temperatures.length - 1; i >= 0; i--) {
			while (!stack.isEmpty()) {
				if (temperatures[stack.peek()] <= temperatures[i]) {
					stack.pop();
				} else {
					int diff = stack.peek() - i;
					res[i] = diff;
					stack.push(i);
					break;
				}
			}
			stack.push(i);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyTemperatures dt = new DailyTemperatures();
		int[] res = dt.dailyTemperatures(new int[] { 89, 62, 70, 58, 47, 47, 46, 76, 100, 70 });
		for (int a : res) {
			System.out.print(a + ",");
		}
	}

}

//--------------------------------------------------------------//
/*
 * You are given an array of integers temperatures where temperatures[i]
 * represents the daily temperatures on the ith day.
 * 
 * Return an array result where result[i] is the number of days after the ith
 * day before a warmer temperature appears on a future day. If there is no day
 * in the future where a warmer temperature will appear for the ith day, set
 * result[i] to 0 instead.
 * 
 * Example 1:
 * 
 * Input: temperatures = [30,38,30,36,35,40,28]
 * 
 * Output: [1,4,1,2,1,0,0] Example 2:
 * 
 * Input: temperatures = [22,21,20]
 * 
 * Output: [0,0,0]
 */

//------------------youtube link--------------
// https://www.youtube.com/watch?v=ekFs9Nb2RNQ