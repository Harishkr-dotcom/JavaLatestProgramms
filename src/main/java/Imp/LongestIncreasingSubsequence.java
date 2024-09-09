package Imp;

public class LongestIncreasingSubsequence {
	public static int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int n = nums.length;
		int[] dp = new int[n];
		int maxLength = 1;

		// Initialize each dp[i] to 1, since the minimum subsequence for each element is
		// itself
		for (int i = 0; i < n; i++) {
			dp[i] = 1;
		}

		// Build the dp array
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			maxLength = Math.max(maxLength, dp[i]);
		}

		return maxLength;
	}

	public static void main(String[] args) {
		int[] nums1 = { 10, 9, 2, 5, 3, 7, 101, 18 };
		int[] nums2 = { 0, 1, 0, 3, 2, 3 };
		int[] nums3 = { 7, 7, 7, 7, 7 };

		System.out.println("Length of LIS (Example 1): " + lengthOfLIS(nums1)); // Output: 4
		System.out.println("Length of LIS (Example 2): " + lengthOfLIS(nums2)); // Output: 4
		System.out.println("Length of LIS (Example 3): " + lengthOfLIS(nums3)); // Output: 1
	}

}
