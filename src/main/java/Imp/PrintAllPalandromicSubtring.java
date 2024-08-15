package Imp;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPalandromicSubtring {
	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println("Number of palindromic substrings in s1: " + countAndPrintPalindromicSubstrings(s1));

		String s2 = "aaa";
		System.out.println("Number of palindromic substrings in s2: " + countAndPrintPalindromicSubstrings(s2));
		
		String s3 = "babad";
		System.out.println("Number of palindromic substrings in s2: " + countAndPrintPalindromicSubstrings(s3));
	}

	public static int countAndPrintPalindromicSubstrings(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}

		List<String> palindromes = new ArrayList<>();
		int n = s.length();

		for (int i = 0; i < n; i++) {
			expandAroundCenter(s, i, i, palindromes); // Odd length palindromes
		}
		for (int j = 0; j < n; j++) {
			expandAroundCenter(s, j, j + 1, palindromes); // Even length palindromes
		}

		System.out.println("Palindromic substrings: " + palindromes);

		return palindromes.size();
	}

	// Helper method to count palindromes expanding around the center and store them
	private static void expandAroundCenter(String s, int left, int right, List<String> palindromes) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			palindromes.add(s.substring(left, right + 1));
			left--;
			right++;
		}
	}

}
