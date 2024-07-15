package IntervQS;

import java.util.HashSet;

public class FindMissingNumbers {

	public static HashSet<Integer> findMissingNumbers(int[] a) {
		HashSet<Integer> missingNumbers = new HashSet<>();

		// Create a HashSet to store numbers in the array
		HashSet<Integer> set = new HashSet<>();
		for (int num : a) {
			set.add(num);
		}

		// Find the range of numbers from the minimum to the maximum in the array
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int num : a) {
			min = Math.min(min, num);
			max = Math.max(max, num);
		}

		// Iterate over the range and check for missing numbers
		for (int i = min + 1; i < max; i++) {
			if (!set.contains(i)) {
				missingNumbers.add(i);
			}
		}

		return missingNumbers;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 7 };
		HashSet<Integer> missingNumbers = findMissingNumbers(a);
		System.out.println("Missing numbers are: " + missingNumbers);
	}

}
