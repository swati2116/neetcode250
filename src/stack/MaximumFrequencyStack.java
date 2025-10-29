package stack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MaximumFrequencyStack {
	  HashMap<Integer,Integer> stackfreq;
	    Stack<Integer> stack;
	    ArrayList<Integer> al= new ArrayList<>();
	    public MaximumFrequencyStack() {
	        stackfreq= new HashMap<Integer,Integer>();
	        stack= new Stack<Integer>();
	    }
	    
	    public void push(int val) {
	        stackfreq.put(val, stackfreq.getOrDefault(val,0)+1); 
	        stack.push(val);
	    }
	    
	    public int pop() {
	    	int popped=0;
	      HashMap<Integer,Integer> hm=stackfreq.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
	      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)); 
	      int top= (int) hm.entrySet().stream().findFirst().get().getKey();

	      if(stack.peek()==top || hm.get(top)==hm.get(stack.peek()))
	      {
	    	   popped= stack.pop();
	    	   stackfreq.put(top, stackfreq.get(top)-1);
	      }
	      else
	      {
	    	  while(stack.peek()!=top)
	    	  {
	    	  if(hm.get(top)!=hm.get(stack.peek()))
	    	  {	   
	    	  popped= stack.pop();
	    	  al.add(popped);
	    	  }
	    	  else
	    	  {
	    		  break;
	    	  }
	    	  }
	    	  popped= stack.pop();
	    	  stackfreq.put(popped, stackfreq.get(popped)-1);
	    	  for(int i=al.size()-1; i>=0; i--)
	    	  { 
	    		  stack.push(al.get(i));  
	    	  }
	      }
	      
	      return popped;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumFrequencyStack freqStack = new MaximumFrequencyStack();
		freqStack.push(1); // The stack is [5]
		freqStack.push(2); // The stack is [5,7]
		freqStack.push(3); // The stack is [5,7,5]
		freqStack.push(2); // The stack is [5,7,5,7]
		//freqStack.push(4); // The stack is [5,7,5,7,4]
		//freqStack.push(5); // The stack is [5,7,5,7,4,5]
		freqStack.pop(); // return 5, as 5 is the most frequent. The stack becomes [5,7,5,7,4].
		freqStack.pop(); // return 7, as 5 and 7 is the most frequent, but 7 is closest to the top. The stack becomes [5,7,5,4].
		freqStack.pop(); // return 5, as 5 is the most frequent. The stack becomes [5,7,4].
		//freqStack.pop(); // return 4, as 4, 5 and 7 is the most frequent, but 4 is closest to the top. The stack becomes [5,7].
	}

}

//-----------------------------------------------------------------//

/*
 * Design a stack-like data structure to push elements to the stack and pop the
 * most frequent element from the stack.
 * 
 * Implement the FreqStack class:
 * 
 * FreqStack() constructs an empty frequency stack. void push(int val) pushes an
 * integer val onto the top of the stack. int pop() removes and returns the most
 * frequent element in the stack. If there is a tie for the most frequent
 * element, the element closest to the stack's top is removed and returned.
 * Example 1:
 * 
 * Input: ["FreqStack", "push", "push", "push", "push", "push", "push", "pop",
 * "pop", "pop", "pop"] [[], [5], [7], [5], [7], [4], [5], [], [], [], []]
 * 
 * Output: [null, null, null, null, null, null, null, 5, 7, 5, 4] Explanation:
 * FreqStack freqStack = new FreqStack(); freqStack.push(5); // The stack is [5]
 * freqStack.push(7); // The stack is [5,7] freqStack.push(5); // The stack is
 * [5,7,5] freqStack.push(7); // The stack is [5,7,5,7] freqStack.push(4); //
 * The stack is [5,7,5,7,4] freqStack.push(5); // The stack is [5,7,5,7,4,5]
 * freqStack.pop(); // return 5, as 5 is the most frequent. The stack becomes
 * [5,7,5,7,4]. freqStack.pop(); // return 7, as 5 and 7 is the most frequent,
 * but 7 is closest to the top. The stack becomes [5,7,5,4]. freqStack.pop(); //
 * return 5, as 5 is the most frequent. The stack becomes [5,7,4].
 * freqStack.pop(); // return 4, as 4, 5 and 7 is the most frequent, but 4 is
 * closest to the top. The stack becomes [5,7].
 */
//---------------------------------------------------------//
