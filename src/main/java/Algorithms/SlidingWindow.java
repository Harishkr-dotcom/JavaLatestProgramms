package Algorithms;

public class SlidingWindow {
	public static int findMaxSumSubarray(int[] arr, int k) {
		if (arr == null || arr.length == 0 || k > arr.length) {
			throw new IllegalArgumentException("Invalid input");
		}

		// Calculate the sum of the first window
		int maxSum = 0;
		for (int i = 0; i < k; i++) {
			maxSum += arr[i];
		}

		int windowSum = maxSum;

		// Slide the window from the start of the array to the end
		for (int i = k; i < arr.length; i++) {
			windowSum += arr[i] - arr[i - k];
			maxSum = Math.max(maxSum, windowSum);
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 10, 23, 3, 1, 0, 8, 20 };
		int k = 4;
		int result = findMaxSumSubarray(arr, k);
		System.out.println("Maximum sum of subarray of length " + k + " is: " + result);
	}
}
