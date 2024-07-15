package StringSpecial;
// **Longest Common Subsequence**: Write a function to find the longest common subsequence of two strings.
public class S1 {
	public static String longestCommonSubsequence(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();

		// Create a 2D array to store lengths of longest common subsequence.
		int[][] dp = new int[m + 1][n + 1];

		// Fill dp[][] in bottom up manner.
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		// Reconstruct the LCS from the dp table
		StringBuilder lcs = new StringBuilder();
		int i = m, j = n;
		while (i > 0 && j > 0) {
			if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
				lcs.append(s1.charAt(i - 1));
				i--;
				j--;
			} else if (dp[i - 1][j] > dp[i][j - 1]) {
				i--;
			} else {
				j--;
			}
		}

		// The LCS is built backwards, so reverse it
		return lcs.reverse().toString();
	}

	public static void main(String[] args) {
		String s1 = "ABCBDAB";
		String s2 = "BDCAB";
		String lcs = longestCommonSubsequence(s1, s2);
		System.out.println("Longest Common Subsequence: " + lcs); // Output: "BCAB"
	}

}
