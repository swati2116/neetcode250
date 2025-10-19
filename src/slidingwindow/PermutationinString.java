package slidingwindow;

import java.util.Arrays;

public class PermutationinString {
    public boolean checkInclusion(String s1, String s2) {
        char[] scharArray= s1.toCharArray();
        Arrays.sort(scharArray);
        String sorteds= new String(scharArray);
        for(int l=0; l<=s2.length()-s1.length(); l++)
        { 
        if(l<=s2.length()-s1.length()){ 
          String substring = s2.substring(l, l+s1.length());
          char[] sortedsub= substring.toCharArray();
          Arrays.sort(sortedsub);
          String sortedsubstring= new String(sortedsub);
          if(sortedsubstring.equals(sorteds))
          {
             return true;
          }
        }
        }
        return false;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationinString ps= new PermutationinString();
		boolean permute=ps.checkInclusion("adc", "dcda");
		System.out.println(permute);
	}

}

//******************************************************//
/*
 * Permutation in String Solved You are given two strings s1 and s2.
 * 
 * Return true if s2 contains a permutation of s1, or false otherwise. That
 * means if a permutation of s1 exists as a substring of s2, then return true.
 * 
 * Both strings only contain lowercase letters.
 * 
 * Example 1:
 * 
 * Input: s1 = "abc", s2 = "lecabee"
 * 
 * Output: true Explanation: The substring "cab" is a permutation of "abc" and
 * is present in "lecabee".
 * 
 * Example 2:
 * 
 * Input: s1 = "abc", s2 = "lecaabee"
 * 
 * Output: false
 */

//*********************************************************//