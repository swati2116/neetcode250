package stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaximumFrequencyStackOptimal {
	HashMap<Integer,Integer> frequencymap;
    HashMap<Integer,Stack<Integer>> frequencystack;
    ArrayList<Integer> al= new ArrayList<>();
    int maxfrequency;
    public MaximumFrequencyStackOptimal() {
    	frequencymap= new HashMap<>();
    	frequencystack= new HashMap<>();
    	maxfrequency=0; 	
    }
    
    public void push(int val) {
        int freq= frequencymap.getOrDefault(val, 0)+1;
        frequencymap.put(val, freq);
        if(freq>maxfrequency)
        {
        	maxfrequency=freq;
        	frequencystack.putIfAbsent(freq, new Stack());
        }
        
        frequencystack.get(freq).push(val);
    }
    
    public int pop() {
    	int popped=frequencystack.get(maxfrequency).pop();
    	frequencymap.put(popped,frequencymap.get(popped)-1 );
    	if(frequencystack.get(maxfrequency).isEmpty())
    	{
    		maxfrequency--;
    	}
      return popped;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumFrequencyStackOptimal freqStack = new MaximumFrequencyStackOptimal();
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

//-------------------------youtube hannel----------------
//https://www.youtube.com/watch?v=0fRmVjxopiE