package SlidingWindow;
//Longest sub-array having sum k
import java.util.HashMap;

public class LongestSubArray {
	public static void main(String[] args) {
		int[] arr = { 10, 5, 2, 7, 1, 9 };
		int k = 15;
		System.out.println("Length of the longest sub-array: " + longestSubArrayWithSumK(arr, k)); // Output: 4
	}

	public static int longestSubArrayWithSumK(int[] arr, int k) {
		// Create a map to store the cumulative sum and its index
		HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
		int maxLength = 0;
		int cumulativeSum = 0;

		for (int i = 0; i < arr.length; i++) {
			// Add the current element to the cumulative sum
			cumulativeSum += arr[i];

			// If cumulative sum is equal to k, update maxLength
			if (cumulativeSum == k) {
				maxLength = i + 1;
			}

			// If the cumulative sum minus k is present in the map, update maxLength
			if (sumIndexMap.containsKey(cumulativeSum - k)) {
				maxLength = Math.max(maxLength, i - sumIndexMap.get(cumulativeSum - k));
			}

			// Add the cumulative sum to the map if it's not already present
			sumIndexMap.putIfAbsent(cumulativeSum, i);
		}

		return maxLength;
	}
}
