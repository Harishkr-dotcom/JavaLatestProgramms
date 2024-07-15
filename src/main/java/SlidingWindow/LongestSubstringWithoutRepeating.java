package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
	public static void main(String[] args) {
		String s1 = "abcabcbb";
		System.out.println("Length of the longest substring: " + lengthOfLongestSubstring(s1)); // Output: 3

		//String s2 = "bbbbb";
		//System.out.println("Length of the longest substring: " + lengthOfLongestSubstring(s2)); // Output: 1

		//String s3 = "pwwkew";
		//System.out.println("Length of the longest substring: " + lengthOfLongestSubstring(s3)); // Output: 3

		//String s4 = "";
		//System.out.println("Length of the longest substring: " + lengthOfLongestSubstring(s4)); // Output: 0
	}

	public static int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		Map<Character, Integer> charIndexMap = new HashMap<>();
		int maxLength = 0;
		int start = 0;

		for (int end = 0; end < s.length(); end++) {
			char currentChar = s.charAt(end);

			// If the character is already in the map and its index is within the current
			// window
			if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
				System.out.println(charIndexMap.containsKey(currentChar));
				System.out.println(charIndexMap.get(currentChar));
				// Move the start to the right of the last occurrence of the current character
				start = charIndexMap.get(currentChar) + 1;
			}

			// Update the latest index of the current character
			charIndexMap.put(currentChar, end);

			// Calculate the current length of the substring
			int currentLength = end - start + 1;
			maxLength = Math.max(maxLength, currentLength);
		}

		return maxLength;
	}
}
