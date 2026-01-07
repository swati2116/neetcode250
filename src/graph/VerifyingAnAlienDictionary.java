package graph;

public class VerifyingAnAlienDictionary {
	public int[] alien;

	public boolean isAlienSorted(String[] words, String order) {
		alien = new int[26];
		// it will assign index value going to the index of letter after converting to integer
		// here for 'h' in english comes in 7th position , so in alien array index 7 it will assign 0.
		for (int i = 0; i < order.length(); i++) {
			alien[order.charAt(i) - 'a'] = i;
		}
		for (int i = 1; i < words.length; i++) {
			if (!compare(words[i - 1], words[i])) {
				return false;
			}
		}
		return true;
	}

	public boolean compare(String word1, String word2) {
		int i = 0;

		while (i < word1.length() && i < word2.length()) {
			if (word1.charAt(i) == word2.charAt(i)) {
				i++;
			}
			//  1st letter in the word1 should be less than word2
			else if (alien[word1.charAt(i) - 'a'] < alien[word2.charAt(i) - 'a']) {
				return true;

			} else {
				return false;
			}
		}
		if (word2.length() <= word1.length()) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VerifyingAnAlienDictionary vad= new VerifyingAnAlienDictionary();
		vad.isAlienSorted(new String[] {"dag","disk","dog"}, "hlabcdefgijkmnopqrstuvwxyz");
		

	}

}

//-----------------------//
/*
 * https://www.youtube.com/watch?v=ZUP_tIs4VaE
 * 
 * In a town, there are n people labeled from 1 to n. There is a rumor that one
 * of these people is secretly the town judge.
 * 
 * If the town judge exists, then:
 * 
 * The town judge trusts nobody. Everybody (except for the town judge) trusts
 * the town judge. There is exactly one person that satisfies properties 1 and
 * 2. You are given an array trust where trust[i] = [ai, bi] representing that
 * the person labeled ai trusts the person labeled bi.
 * 
 * Return the label of the town judge if the town judge exists and can be
 * identified, or return -1 otherwise.
 * 
 * Example 1:
 * 
 * Input: n = 4, trust = [[1,3],[4,3],[2,3]]
 * 
 * Output: 3
 * 
 * Time & Space Complexity Time complexity: O ( V + E ) O(V+E) Space complexity:
 * O ( V ) O(V)
 */
