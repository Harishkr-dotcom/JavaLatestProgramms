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
		int maxCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char endChar = s.charAt(i);
			count[endChar - 'A']++;
			maxCount = Math.max(maxCount, count[endChar - 'A']);
			if (i - start + 1 - maxCount > k) {
				char startChar = s.charAt(start);
				count[startChar - 'A']--;
				start++;
			}
			maxLength = Math.max(maxLength, i - start + 1);
		}
		return maxLength;
	}
}
