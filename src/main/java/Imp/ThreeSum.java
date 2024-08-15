package Imp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum == target) {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));
					while (left < right && nums[left] == nums[left + 1]) {
						left++;
					}
					while (left < right && nums[right] == nums[right - 1]) {
						right--;
					}
					left++;
					right--;
				} else if (sum < target) {
					left++; 
				} else {
					right--; 
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = { -1, 0, 1, 2, -1, -4 };
		int target1 = 2;
		System.out.println("Triplets that sum to " + target1 + ": " + threeSum(nums1, target1)); // Output: [[-1, -1,
																									// 2]]

		int[] nums2 = { 0, 1, 1, 2, 3, 4 };
		int target2 = 6;
		System.out.println("Triplets that sum to " + target2 + ": " + threeSum(nums2, target2)); // Output: [[1, 2, 3]]

		int[] nums3 = { 0, 0, 0, 0 };
		int target3 = 0;
		System.out.println("Triplets that sum to " + target3 + ": " + threeSum(nums3, target3)); // Output: [[0, 0, 0]]
	}

}
