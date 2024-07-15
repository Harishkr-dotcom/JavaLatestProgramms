package Aarrays;
//Maximum Product Subarray**:
//- Write a function that finds the contiguous subarray within a given array that has the largest 

public class B18 {

	public static int maxProduct(int[] nums) {
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException("Array should not be null or empty");
		}

		int maxProduct = nums[0];
		int minProduct = nums[0];
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {
			// Store the current values of maxProduct and minProduct
			int tempMax = maxProduct;
			int tempMin = minProduct;

			// Update maxProduct and minProduct for the current index
			maxProduct = Math.max(nums[i], Math.max(tempMax * nums[i], tempMin * nums[i]));
			minProduct = Math.min(nums[i], Math.min(tempMax * nums[i], tempMin * nums[i]));

			// Update result with the maximum product found so far
			result = Math.max(result, maxProduct);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = { 2, 3, -2, 4 };
		int[] nums2 = { -2, 0, -1 };
		int[] nums3 = { -1, -3, -10, 0, 60 };
		int[] nums4 = { 2, -5, -2, -4, 3 };

		System.out.println("Max product of nums1: " + maxProduct(nums1)); // Output: 6
		System.out.println("Max product of nums2: " + maxProduct(nums2)); // Output: 0
		System.out.println("Max product of nums3: " + maxProduct(nums3)); // Output: 60
		System.out.println("Max product of nums4: " + maxProduct(nums4)); // Output: 240
	}

}
