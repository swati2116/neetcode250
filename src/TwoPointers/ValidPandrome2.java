package TwoPointers;

public class ValidPandrome2 {


	public boolean isPalindrome(String s) {
		int count=0;
		int j = s.length();
		if(j/2>1)
		{
		for (int i = 0; i <= s.length() / 2; i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				if (Character.isLetterOrDigit(s.charAt(j - 1))) {
					
					if (s.toLowerCase().charAt(i) != s.toLowerCase().charAt(j - 1) && count>1) {
						return false;
					}
                    else
                    {
                        count++;
                    }
					j--;
				}
				else {
				i--;
				j--;
				}
			}
			
		}
		
		}
		else
		{
			String s1= s.substring(0, 1);
			String s2= s.substring(1);
			if(!s2.contains(s1))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPandrome2 vp = new ValidPandrome2();
		boolean palindrome = vp.isPalindrome("abc");
		//boolean palindrome = vp.isPalindrome( "tab a cat");

		if (palindrome) {
			System.out.println("Valid Palindrome");
		} else {
			System.out.println("InValid Palindrome");

		}
	}
}

//***************************************************//
/*Valid Palindrome II
Solved 
You are given a string s, return true if the s can be a palindrome after deleting at most one character from it.

A palindrome is a string that reads the same forward and backward.

Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

Example 1:

Input: s = "aca"

Output: true
Explanation: "aca" is already a palindrome.

Example 2:

Input: s = "abbadc"

Output: false
Explanation: "abbadc" is not a palindrome and can't be made a palindrome after deleting at most one character.

Example 3:

Input: s = "abbda"

Output: true
Explanation: "We can delete the character 'd'."*/

//********************************************//