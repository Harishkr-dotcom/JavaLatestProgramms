package SlidingWindow;

public class LongestPalindromicSubstring {
	public static String longestPalindrome(String s) {
		String longest = "";
		for (int i = 0; i < s.length(); i++) {
			// Check for odd-length palindromes (single character center)
			String oddPalindrome = expandAroundCenter(s, i, i);
			if (oddPalindrome.length() > longest.length()) {
				longest = oddPalindrome;
			}
			// Check for even-length palindromes (center between characters)
			String evenPalindrome = expandAroundCenter(s, i, i + 1);
			if (evenPalindrome.length() > longest.length()) {
				longest = evenPalindrome;
			}
		}
		return longest;
	}

	private static String expandAroundCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		// Subtract 1 from right and left because the last expansion went one step too
		// far
		return s.substring(left + 1, right);
	}

	public static void main(String[] args) {
		String s1 = "babad";
		System.out.println("Longest palindromic substring: " + longestPalindrome(s1)); // Output: "bab" or "aba"

		String s2 = "cbbd";
		System.out.println("Longest palindromic substring: " + longestPalindrome(s2)); // Output: "bb"
	}
}
