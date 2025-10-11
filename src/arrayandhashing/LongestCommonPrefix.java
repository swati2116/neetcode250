package arrayandhashing;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String args[])
    {
    	LongestCommonPrefix lcp= new LongestCommonPrefix();
    	String prefix=lcp.longCommonPrefix(new String[] {"onlyone"});
    	System.out.println("The longest prefix is "+prefix);
    }
	public String longCommonPrefix(String[] strs) {
        String result="";
        if(strs.length==1)
        {
        	return result=strs[0];
        }
        Arrays.sort(strs);
      for(int i=1; i<strs.length; i++)
      {
    	  String prefix="";
        for(int j=0;j<strs[0].length(); j++)
        {
            if(strs[0].charAt(j)==strs[i].charAt(j))
            {
            	prefix=prefix+strs[i].charAt(j);
            }
            else
            {
                break;
            }
        }
        if(!result.isEmpty() || !result.contains(prefix))
        {  
        	if(!result.isEmpty() && prefix.length()>result.length())
        	{
        		result=result;
        	}
        	else if(!result.isEmpty() && prefix.length()<result.length())
        	{
        	result=prefix;
        	}
        	else
        	{
        		result=prefix;
        	}
        }
      }
      return result;
    }
}

//******************************************************//
//You are given an array of strings strs. Return the longest common prefix of all the strings.
//
//If there is no longest common prefix, return an empty string "".
//
//Example 1:
//
//Input: strs = ["bat","bag","bank","band"]
//
//Output: "ba"
//Example 2:
//
//Input: strs = ["dance","dag","danger","damage"]
//
//Output: "da"
//Example 3:
//
//Input: strs = ["neet","feet"]
//
//Output: ""
//Constraints:
//
//1 <= strs.length <= 200
//0 <= strs[i].length <= 200
//strs[i] is made up of lowercase English letters if it is non-empty.

//*************************************************//


