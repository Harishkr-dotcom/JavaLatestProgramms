package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
	public static void main(String[] args) {
		String s1 = "abcabcbb";
		System.out.println("Length of the longest substring: " + lengthOfLongestSubstring(s1)); // Output: 3

		// String s2 = "bbbbb";
		// System.out.println("Length of the longest substring: " +
		// lengthOfLongestSubstring(s2)); // Output: 1

		// String s3 = "pwwkew";
		// System.out.println("Length of the longest substring: " +
		// lengthOfLongestSubstring(s3)); // Output: 3

		// String s4 = "";
		// System.out.println("Length of the longest substring: " +
		// lengthOfLongestSubstring(s4)); // Output: 0
	}

	public static int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> charIndexMap = new HashMap<>();
		int left = 0; // Left pointer for the sliding window
		int maxLength = 0; // Maximum length of substring without repeating characters

		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);

			if (charIndexMap.containsKey(currentChar)) {
				// Move the left pointer to the right of the last occurrence of currentChar
				left = Math.max(left, charIndexMap.get(currentChar) + 1);
			}

			// Update the last index of the current character
			charIndexMap.put(currentChar, i);

			// Update the maximum length
			maxLength = Math.max(maxLength, i - left + 1);
		}

		return maxLength;
	}

}
