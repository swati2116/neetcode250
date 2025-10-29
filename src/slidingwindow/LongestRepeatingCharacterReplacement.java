package slidingwindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
	public int characterReplacement(String s, int k) {
		HashMap<Character, Integer> hm = new HashMap<>();
		int l = 0, windowsize = 0, res = 0, maxfreq = 0;
		for (int r = 0; r < s.length(); r++) {
			hm.put(s.charAt(r), hm.getOrDefault(s.charAt(r), 0) + 1);
			maxfreq = Math.max(maxfreq, hm.get(s.charAt(r)));
			windowsize = r - l + 1;
			while (windowsize - maxfreq > k) {
				hm.put(s.charAt(l), hm.get(s.charAt(l)) - 1);
				l++;
				windowsize = r - l + 1;
			}
			res = Math.max(res, r - l + 1);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestRepeatingCharacterReplacement lr = new LongestRepeatingCharacterReplacement();
		int max = lr.characterReplacement("AAABABB", 1);
		System.out.println(max);

	}

}

//****************************************************//

/*
 * Longest Repeating Character Replacement Solved You are given a string s
 * consisting of only uppercase english characters and an integer k. You can
 * choose up to k characters of the string and replace them with any other
 * uppercase English characters.
 * 
 * After performing at most k replacements, return the length of the longest
 * substring which contains only one distinct character.
 * 
 * Example 1:
 * 
 * Input: s = "XYYX", k = 2
 * 
 * Output: 4 Explanation: Either replace the 'X's with 'Y's, or replace the 'Y's
 * with 'X's.
 * 
 * Example 2:
 * 
 * Input: s = "AAABABB", k = 1
 
 * 
 * Output: 5
 */
//***************youtube link*********************//
//https://www.youtube.com/watch?v=ExY8svHF_Eo
