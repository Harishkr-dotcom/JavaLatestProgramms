package SlidingWindow;
//Find Subarray with given sum | Set 1 (Non-negative Numbers)
public class FindIndex {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 20, 3, 10, 5 };
		int sum = 33;
		findSubarrayWithSum(arr, sum);
	}

	public static void findSubarrayWithSum(int[] arr, int targetSum) {
		int n = arr.length;
		int currentSum = 0;
		int start = 0;

		for (int end = 0; end < n; end++) {
			currentSum += arr[end];

			while (currentSum > targetSum && start <= end) {
				currentSum -= arr[start];
				start++;
			}

			if (currentSum == targetSum) {
				System.out.println("Sum found between indexes " + start + " and " + end);
				return;
			}
		}

		System.out.println("No subarray found with given sum");
	}

}
