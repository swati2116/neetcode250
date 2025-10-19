package TwoPointers;

public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		int j = s.length();
		for (int i = 0; i < s.length() / 2; i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				if (Character.isLetterOrDigit(s.charAt(j - 1))) {				
					if (s.toLowerCase().charAt(i) != s.toLowerCase().charAt(j - 1)) {
						return false;
					}
					j--;
				}
				else {
				i--;
				j--;
				}
			}
			
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindrome vp = new ValidPalindrome();
		boolean palindrome = vp.isPalindrome("Was it a car or a cat I saw?");
		//boolean palindrome = vp.isPalindrome( "tab a cat");

		if (palindrome) {
			System.out.println("Valid Palindrome");
		} else {
			System.out.println("InValid Palindrome");

		}
	}

}

//*************************************************//
/*
 * Valid Palindrome Solved Given a string s, return true if it is a palindrome,
 * otherwise return false.
 * 
 * A palindrome is a string that reads the same forward and backward. It is also
 * case-insensitive and ignores all non-alphanumeric characters.
 * 
 * Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers
 * (0-9).
 * 
 * Example 1:
 * 
 * Input: s = "Was it a car or a cat I saw?"
 * 
 * Output: true Explanation: After considering only alphanumerical characters we
 * have "wasitacaroracatisaw", which is a palindrome.
 * 
 * Example 2:
 * 
 * Input: s = "tab a cat"
 * 
 * Output: false Explanation: "tabacat" is not a palindrome.
 */
//**************************************************************//