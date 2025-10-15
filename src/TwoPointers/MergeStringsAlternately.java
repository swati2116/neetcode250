package TwoPointers;

public class MergeStringsAlternately {

	public String mergeAlternately(String word1, String word2) {
		int l = 0, r = 0;
		String merge = "";
		while (l < word1.length() || r < word2.length()) {
			if (l < word1.length())
				merge = merge + word1.charAt(l);

			if (r < word2.length())
				merge = merge + word2.charAt(r);

			l++;
			r++;
		}
		return merge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeStringsAlternately msa = new MergeStringsAlternately();
		String merged = msa.mergeAlternately("abc", "xyz");
		System.out.println(merged);

	}

}
