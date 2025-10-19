package slidingwindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {

        int maxlength=0;
        int l=0, r=0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while(r<s.length())
        {
           if(!hm.containsKey(s.charAt(r)))
           {
              hm.put(s.charAt(r),r);
              maxlength=Math.max(maxlength, r-l+1);
           }
           else
           {
              l= hm.get(s.charAt(r))+1;
              hm.put(s.charAt(r), r);
             // r= r+1;
              maxlength=Math.max(maxlength, r-l+1);
           }
           r++;
        }
         return maxlength;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubstringWithoutRepeatingCharacters ls= new LongestSubstringWithoutRepeatingCharacters();
		//int max=ls.lengthOfLongestSubstring("zxyzxyz");
		int max=ls.lengthOfLongestSubstring("thequickbrownfoxjumpsoverthelazydogthequickbrownfoxjumpsovert");
		System.out.println(max);
		
	}

}

//************************************************************//
/*
 * Longest Substring Without Repeating Characters Solved Given a string s, find
 * the length of the longest substring without duplicate characters.
 * 
 * A substring is a contiguous sequence of characters within a string.
 * 
 * Example 1:
 * 
 * Input: s = "zxyzxyz"
 * 
 * Output: 3 Explanation: The string "xyz" is the longest without duplicate
 * characters.
 * 
 * Example 2:
 * 
 * Input: s = "xxxx"
 * 
 * Output: 1
 */

//*************************youtube link*********************************//
// https://www.youtube.com/watch?v=-zSxTJkcdAo //