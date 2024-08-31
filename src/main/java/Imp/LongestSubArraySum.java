package Imp;

import java.util.Arrays;

public class LongestSubArraySum {
	public static int[] findSubarrayWithGivenSum(int[] arr, int targetSum) {
		int start = 0;
		int currentSum = 0;

		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];
			while (currentSum > targetSum && start <= i) {
				currentSum -= arr[start];
				start++;
			}

			if (currentSum == targetSum) {
				return new int[] { start, i }; // Return starting and ending indexes
			}
		}

		return new int[] { -1, -1 }; // Return -1 if no subarray is found
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int targetSum = 9;
		int[] result = findSubarrayWithGivenSum(arr, targetSum);

		System.out.println("Subarray with sum " + targetSum + ": " + Arrays.toString(result));
	}

}
