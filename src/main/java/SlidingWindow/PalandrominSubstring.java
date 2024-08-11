package SlidingWindow;

public class PalandrominSubstring {
	public static int countSubstrings(String s) {
		int n = s.length();
		int count = 0;

		for (int i = 0; i < n; i++) {
			// Count odd length palindromes centered at i
			count += expandAroundCenter(s, i, i);
			// Count even length palindromes centered at i and i+1
			count += expandAroundCenter(s, i, i + 1);
		}

		return count;
	}

	private static int expandAroundCenter(String s, int left, int right) {
		int count = 0;
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			count++;
			left--;
			right++;
		}
		return count;
	}

	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println("Number of palindromic substrings: " + countSubstrings(s1)); // Output: 3

		String s2 = "aaa";
		System.out.println("Number of palindromic substrings: " + countSubstrings(s2)); // Output: 6
	}

}
