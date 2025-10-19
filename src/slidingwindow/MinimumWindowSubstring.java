package slidingwindow;

import java.util.HashMap;

public class MinimumWindowSubstring {
	public String minWindow(String s, String t) {
		HashMap<Character, Integer> tcount = new HashMap<>();
		HashMap<Character, Integer> scount = new HashMap<>();
		int have = 0, l = Integer.MAX_VALUE, len = Integer.MAX_VALUE;
		String res = "";
		for (int i = 0; i < t.length(); i++) {
			tcount.put(t.charAt(i), tcount.getOrDefault(t.charAt(i), 0) + 1);
		}
		int need = tcount.size();
		for (int r = 0; r < s.length(); r++) {
			if (tcount.containsKey(s.charAt(r))) {
				l = Math.min(l, r);

				scount.put(s.charAt(r), scount.getOrDefault(s.charAt(r), 0) + 1);
				if (scount.get(s.charAt(r)) == tcount.get(s.charAt(r))) {
					have++;
				}

			}
			if (have == need) {

				String substring = s.substring(l, r + 1);
				len = Math.min(len, substring.length());
				if (len == substring.length()) {
					res = substring;
				}
				have = 0;
				scount.clear();
				l++;
				r = l - 1;
				l = Integer.MAX_VALUE;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumWindowSubstring mws = new MinimumWindowSubstring();
		String output = mws.minWindow("cabwefgewcwaefgcf", "cae");
		System.out.println(output);
	}

}

//--------------------------------------------------------------//
/*
 * Minimum Window Substring Solved Given two strings s and t, return the
 * shortest substring of s such that every character in t, including duplicates,
 * is present in the substring. If such a substring does not exist, return an
 * empty string "".
 * 
 * You may assume that the correct output is always unique.
 * 
 * Example 1:
 * 
 * Input: s = "OUZODYXAZV", t = "XYZ"
 * 
 * Output: "YXAZ" Explanation: "YXAZ" is the shortest substring that includes
 * "X", "Y", and "Z" from string t.
 * 
 * Example 2:
 * 
 * Input: s = "xyz", t = "xyz"
 * 
 * Output: "xyz" Example 3:
 * 
 * Input: s = "x", t = "xy"
 * 
 * Output: ""
 */
//------------------------------------------------------------//
// Put the 
