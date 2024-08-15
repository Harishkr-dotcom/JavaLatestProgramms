package Imp;

public class LongestSubstringRepeating {
	public static void main(String[] args) {
		String s1 = "ABAB";
		int k1 = 2;
		System.out.println("Longest substring length for s1: " + longestSubstringWithKChanges(s1, k1));
	}

	public static int longestSubstringWithKChanges(String s, int k) {
		int[] count = new int[26]; // Frequency count for letters A-Z
		int start = 0;
		int maxLength = 0;
		int maxCount = 0; // Maximum frequency of a single character in the current window

		for (int end = 0; end < s.length(); end++) {
			char endChar = s.charAt(end);
			count[endChar - 'A']++;

			// Update the maximum frequency of a single character in the current window
			maxCount = Math.max(maxCount, count[endChar - 'A']);

			// Current window size is end - start + 1
			// If the window size minus the count of the most frequent character is greater
			// than k, the window is invalid
			if (end - start + 1 - maxCount > k) {
				char startChar = s.charAt(start);
				count[startChar - 'A']--;
				start++;
			}

			// Calculate the maximum length of the valid window
			maxLength = Math.max(maxLength, end - start + 1);
		}

		return maxLength;
	}
}
