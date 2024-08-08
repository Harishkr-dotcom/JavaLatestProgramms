package Imp;

public class PalindromeSubrings {
	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println("Number of palindromic substrings in s1: " + countPalindromicSubstrings(s1));

		String s2 = "aaa";
		System.out.println("Number of palindromic substrings in s2: " + countPalindromicSubstrings(s2));
	}

	public static int countPalindromicSubstrings(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}

		int n = s.length();
		int count = 0;

		// Expand around each character for odd-length palindromes
		for (int center = 0; center < n; center++) {
			count += expandAroundCenter(s, center, center); // Odd length palindromes
		}

		// Expand around each pair of consecutive characters for even-length palindromes
		for (int center = 0; center < n - 1; center++) {
			count += expandAroundCenter(s, center, center + 1); // Even length palindromes
		}

		return count;
	}

	// Helper method to count palindromes expanding around the center
	private static int expandAroundCenter(String s, int left, int right) {
		int count = 0;
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			count++;
			left--;
			right++;
		}
		return count;
	}
}
