package Aarrays;

public class B13 {
	// Function to rotate the array to the right by k steps
	private static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	// Function to print the array
	public static void printArray(int[] nums) {
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n; // Handle cases where k is greater than the length of the array
		reverse(nums, 0, n - 1); // Reverse the entire array
		reverse(nums, 0, k - 1); // Reverse the first k elements
		reverse(nums, k, n - 1); // Reverse the rest of the array
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;

		System.out.println("Original array:");
		printArray(nums);

		rotate(nums, k);

		System.out.println("Array after rotation:");
		printArray(nums);
	}
}
