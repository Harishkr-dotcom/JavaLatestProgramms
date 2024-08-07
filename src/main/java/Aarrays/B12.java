package Aarrays;

import java.util.HashSet;
import java.util.Set;

public class B12 {
	public static void findPairsWithSum(int[] array, int target) {
		Set<Integer> seen = new HashSet<>();
		Set<String> uniquePairs = new HashSet<>();
		for (int num : array) {
			int complement = target - num;
			if (seen.contains(complement)) {
				uniquePairs.add("(" + complement + ", " + num + ")");
			}
			seen.add(num);
		}
		for (String pair : uniquePairs) {
			System.out.println(pair);
		}
	}

	public static void main(String[] args) {
		int[] array = { 2, 4, 3, 6, 5, 1, 7 };
		int target = 8;

		// Find and print pairs that sum up to the target
		findPairsWithSum(array, target);
	}
}
