package Imp;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> charSet = new HashSet<>();
		int maxLength = 0; // To store the length of the longest substring
		int start = 0; // Starting index of the current window

		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			while(charSet.contains(currentChar)) {
				charSet.remove(s.charAt(start));
				start++;
			}
			charSet.add(currentChar);
			maxLength = Math.max(maxLength, i - start + 1);
		}

		return maxLength;
	}

	public static void main(String[] args) {
		String s = "abcabcbb";
		String s1 = "Selenium";
		int result = lengthOfLongestSubstring(s1);
		System.out.println("Output: " + result); // Should print 3
	}
}
