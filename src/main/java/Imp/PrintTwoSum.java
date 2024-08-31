package Imp;

import java.util.HashMap;
import java.util.Map;

public class PrintTwoSum {
	public static Map<Integer, Integer> twoSum(int[] nums, int target) {
		Map<Integer, Integer> numToIndex = new HashMap<>();
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (numToIndex.containsKey(complement)) {
				result.put(numToIndex.get(complement), i);
				//break;
			} else {
				numToIndex.put(nums[i], i);
			}

		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15 };
		int target = 9;
		Map<Integer, Integer> result = twoSum(nums, target);
		for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
