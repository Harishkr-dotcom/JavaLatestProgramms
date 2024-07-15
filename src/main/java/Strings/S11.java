package Strings;

import java.util.Arrays;

public class S11 {
	public static void main(String[] args) {
		String str1 = "banana";
		System.out.println("Longest Repeated Substring: " + longestRepeatedSubstring(str1)); // Output: "ana"

		String str2 = "abcdef";
		System.out.println("Longest Repeated Substring: " + longestRepeatedSubstring(str2)); // Output: ""

		String str3 = "aabcaabcdaabc";
		System.out.println("Longest Repeated Substring: " + longestRepeatedSubstring(str3)); // Output: "aabc"
	}

	public static String longestRepeatedSubstring(String str) {
		int n = str.length();

		// Generate all suffixes
		String[] suffixes = new String[n];
		for (int i = 0; i < n; i++) {
			suffixes[i] = str.substring(i, n);
		}

		// Sort the suffixes
		Arrays.sort(suffixes);

		// Find the longest common prefix between consecutive suffixes
		String lrs = "";
		for (int i = 0; i < n - 1; i++) {
			String lcp = longestCommonPrefix(suffixes[i], suffixes[i + 1]);
			if (lcp.length() > lrs.length()) {
				lrs = lcp;
			}
		}

		return lrs;
	}

	// Helper function to find the longest common prefix between two strings
	private static String longestCommonPrefix(String s1, String s2) {
		int n = Math.min(s1.length(), s2.length());
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.substring(0, i);
			}
		}
		return s1.substring(0, n);
	}
}
