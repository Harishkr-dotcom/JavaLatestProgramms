package Imp;

public class LongestCommonSubsequence {
	public static int longestCommonSubsequence(String text1, String text2) {
		int m = text1.length();
		int n = text2.length();

		// Create a 2D DP array
		int[][] dp = new int[m + 1][n + 1];

		// Fill the DP table
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		// The length of the longest common subsequence
		return dp[m][n];
	}

	public static void main(String[] args) {
		String text1 = "abcde";
		String text2 = "ace";
		System.out.println("Length of Longest Common Subsequence: " + longestCommonSubsequence(text1, text2)); // Output:
																												// 3

		String text3 = "abc";
		String text4 = "abc";
		System.out.println("Length of Longest Common Subsequence: " + longestCommonSubsequence(text3, text4)); // Output:
																												// 3

		String text5 = "abc";
		String text6 = "def";
		System.out.println("Length of Longest Common Subsequence: " + longestCommonSubsequence(text5, text6)); // Output:
																												// 0
	}
}
