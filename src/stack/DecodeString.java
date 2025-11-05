package stack;

import java.util.Stack;

public class DecodeString {
	 public String decodeString(String s) {
	        Stack<Integer> numberstack= new Stack<>();
	        Stack<String> stringstack= new Stack<>();
	        String ans= new String();
	        String res="";
	        String decode="";
	        for(int i=0; i<s.length(); i++)
	        {
	            char ch= s.charAt(i);
	            
	            if(Character.isDigit(ch))
	            {
	                numberstack.push(Character.getNumericValue(ch));
	            }
	            else
	            {
	                if(ch==']')
	                {
	                    while(!stringstack.peek().equals("["))
	                    {
	                      String popped= stringstack.pop();
	                     ans=popped+ans;
	                    }
	                    stringstack.pop();
	                    int numberpopped= numberstack.pop();
	                    while(numberpopped>0)
	                    {
	                        res=res+ans;
	                        numberpopped--;
	                    }
	                    stringstack.push(String.valueOf(res));
	                    decode=res;
	                    ans="";res="";
	                }
	                else
	                {
	                    stringstack.push(String.valueOf(ch));
	                }
	            }
	        }
	        if(stringstack.isEmpty())
	        {
	        	return decode;
	        }
	        else
	        {
	        return String.join("", stringstack);
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecodeString ds= new DecodeString();
		//String ans=ds.decodeString("2[a3[b]]c");
		String ans=ds.decodeString("10[a]");
		System.out.print(ans);
	}

}

//-----------------------------------------------------------//

/*
 * You are given an encoded string s, return its decoded string.
 * 
 * The encoding rule is: k[encoded_string], where the encoded_string inside the
 * square brackets is being repeated exactly k times. Note that k is guaranteed
 * to be a positive integer.
 * 
 * You may assume that the input string is always valid; there are no extra
 * white spaces, square brackets are well-formed, etc. There will not be input
 * like 3a, 2[4], a[a] or a[2].
 * 
 * The test cases are generated so that the length of the output will never
 * exceed 100,000.
 * 
 * Example 1:
 * 
 * Input: s = "2[a3[b]]c"
 * 
 * Output: "abbbabbbc" Example 2:
 * 
 * Input: s = "axb3[z]4[c]"
 * 
 * Output: "axbzzzcccc" Example 3:
 * 
 * Input: s = "ab2[c]3[d]1[x]"
 * 
 * Output: "abccdddx"
 */
	
//////////////////////////////////////////////////////////////
