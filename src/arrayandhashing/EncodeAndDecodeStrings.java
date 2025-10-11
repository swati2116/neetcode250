package arrayandhashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncodeAndDecodeStrings eds= new EncodeAndDecodeStrings();
		List<String> strs= new ArrayList();
	//	strs.add("neet");
	//	strs.add("code");
	//	strs.add("love");
	//	strs.add("you");
		strs.add("The quick brown fox");
		strs.add("jumps over the");
		strs.add("lazy dog");
		strs.add("1234567890");
		strs.add("abcdefghijklmnopqrstuvwxyz");
		String encodedString=eds.encode(strs);
		System.out.println(encodedString); //4#neet4#code4#love3#you
		List<String> decodeString= eds.decode(encodedString);
		for(String decode :decodeString )
		System.out.println(decode);
	}
    public String encode(List<String> strs) {
    	StringBuilder strb= new StringBuilder();
    	for(String str: strs)
    	{
    	strb.append(str.length()).append('#').append(str);
    	}
       return strb.toString();
    }
   public List<String> decode(String str) {
       List<String> result= new ArrayList<String>();
       int i=0,j=0,chlength=0;
       while(i<str.length())
       {
    	   i=j;
    	   while(str.charAt(j)!='#')
    	   {

    		   j++;
    	   }
           int length = Integer.parseInt(str.substring(i, j));
           i=j+1;
           j=i+length;
           String substring= str.substring(i, j);
            i=j;
    	   result.add(substring);
       }
       return result;
       
	   
    }

}

//****************************************************//

/*
 * Design an algorithm to encode a list of strings to a single string. The
 * encoded string is then decoded back to the original list of strings.
 * 
 * Please implement encode and decode
 * 
 * Example 1:
 * 
 * Input: ["neet","code","love","you"]
 * 
 * Output:["neet","code","love","you"] Example 2:
 * 
 * Input: ["we","say",":","yes"]
 * 
 * Output: ["we","say",":","yes"]
 */
//*******************************************************************//
