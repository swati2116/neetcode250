package TwoPointers;

public class ReverseString {
     
    public char[] reverseString(char[] s) {
        for(int i=0 ; i<s.length/2; i++)
        {
           char temp = s[s.length-1-i];
           s[s.length-1-i]= s[i];
           s[i]= temp;
        }
        
        return s;
        
   }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs= new ReverseString();
		char[] reverse=rs.reverseString(new char[] {'n','e','e','t'});
		for(char c: reverse)
		{
			System.out.println(c);
		}
	}

}

//********************************************//
//Reverse String
//Solved 
//You are given an array of characters which represents a string s. Write a function which reverses a string.
//
//You must do this by modifying the input array in-place with O(1) extra memory.
//
//Example 1:
//
//Input: s = ["n","e","e","t"]
//
//Output: ["t","e","e","n"]
//Example 2:
//
//Input: s = ["r","a","c","e","c","a","r"]
//
//Output: ["r","a","c","e","c","a","r"]
//-------------------------can be solved using stack-----------------
//public class Solution {
//    public void reverseString(char[] s) {
//        Stack<Character> stack = new Stack<>();
//        for (char c : s) {
//            stack.push(c);
//        }
//        int i = 0;
//        while (!stack.isEmpty()) {
//            s[i++] = stack.pop();
//        }
//    }
//}
