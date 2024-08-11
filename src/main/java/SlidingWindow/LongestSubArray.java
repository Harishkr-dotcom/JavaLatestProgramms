package SlidingWindow;

//Longest sub-array having sum k
import java.util.HashMap;

public class LongestSubArray {
	public static int characterReplacement(String s, int k) {
		int[] count = new int[26]; // Frequency array for 'A' to 'Z'
		int left = 0; // Left pointer for sliding window
		int maxCount = 0; // Count of the most frequently occurring character in the current window
		int maxLength = 0; // Result to store the length of the longest substring

		for (int right = 0; right < s.length(); right++) {
			// Update the count of the current character
			count[s.charAt(right) - 'A']++;

			// Update the max count of any character in the current window
			maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

			// Current window size is right - left + 1
			// Number of characters to be replaced is (current window size - maxCount)
			if (right - left + 1 - maxCount > k) {
				// Shrink the window from the left
				count[s.charAt(left) - 'A']--;
				left++;
			}

			// Update the maximum length found
			maxLength = Math.max(maxLength, right - left + 1);
		}

		return maxLength;
	}

	public static void main(String[] args) {
		String s1 = "ABAB";
		int k1 = 2;
		System.out.println("Length of longest substring: " + characterReplacement(s1, k1)); // Output: 4

		String s2 = "AABABBA";
		int k2 = 1;
		System.out.println("Length of longest substring: " + characterReplacement(s2, k2)); // Output: 4
	}
}
