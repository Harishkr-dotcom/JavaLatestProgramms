package Aarrays;

public class B13 {

	private static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		reverse(nums, 0, n - 1); //5 4 3 2 1 
		reverse(nums, 0, k - 1); //4 5 3 2 1 
		reverse(nums, k, n - 1); //4 5 1 2 3 
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5};
		int k = 4;
		rotate(nums, k);
		// Output the rotated array
		System.out.println("Rotated Array: ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}
