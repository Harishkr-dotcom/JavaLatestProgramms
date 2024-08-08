package Imp;

public class LongestPalindromicSubstring {

	public static String longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
		String longest = "";
		for (int i = 0; i < s.length(); i++) {
			String oddPalindrome = expandAroundCenter(s, i, i);
			if (oddPalindrome.length() > longest.length()) {
				longest = oddPalindrome;
			}
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
		return s.substring(left + 1, right);
	}

	public static void main(String[] args) {
		String s1 = "babad";
		System.out.println("Longest Palindromic Substring of \"" + s1 + "\" is: " + longestPalindrome(s1));

		String s2 = "cbbd";
		System.out.println("Longest Palindromic Substring of \"" + s2 + "\" is: " + longestPalindrome(s2));
	}

}
