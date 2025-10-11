package arrayandhashing;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidAnagram va= new ValidAnagram();
		//boolean result= va.isAnagram("swati", "itaws");
		boolean result= va.isAnagram("swati", "ravie");

		System.out.println("Does the string is anagram "+result);
	}
	 public boolean isAnagram(String s, String t) {
		    char [] schar= s.toLowerCase().toCharArray();
		    char [] tchar= t.toLowerCase().toCharArray();
		    Arrays.sort(schar);
		    Arrays.sort(tchar);
		    if(schar.length!=tchar.length)
		    {
		        return false;
		    }
		    else if(Arrays.equals(schar,tchar))
		    {
		        return true;
		    }
		    else
		    {
		        return false;
		    }
		    }

}

//***************************************//
//Valid Anagram
//Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
//
//Example 1:
//
//Input: s = "racecar", t = "carrace"
//
//Output: true
//Example 2:
//
//Input: s = "jar", t = "jam"
//
//Output: false
//Constraints:
//
//s and t consist of lowercase English letters.
//********************************************//

