package IntervQS;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingNumbers {
	public static void main(String[] args) {
		int[] numbers = { 3, 1, 2, 8, 4, 5 }; // Example array
		findMissingNumbers(numbers);
	}

	public static void findMissingNumbers(int[] numbers) {
		int max = Integer.MIN_VALUE;
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		boolean[] present = new boolean[max + 1];
		for (int num : numbers) {
			if (num >= 1 && num <= max) {
				present[num] = true;
			}
		}
		System.out.println("Missing numbers:");
		for (int i = 1; i <= max; i++) {
			if (!present[i]) {
				System.out.println(i);
			}
		}
	}

}
