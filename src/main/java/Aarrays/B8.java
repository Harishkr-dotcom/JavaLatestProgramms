package Aarrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class B8 {
	public static void main(String[] args) {
		int[] arr = { 1,1,1,2,2};
		int[] result = removeDuplicates(arr);

		System.out.println("Array after removing duplicates: " + Arrays.toString(result));
	}

	public static int[] removeDuplicates(int[] arr) {
		if (arr == null || arr.length == 0) {
			return arr;
		}

		// Using LinkedHashSet to maintain insertion order
		Set<Integer> set = new LinkedHashSet<>();
		for (int num : arr) {
			set.add(num);
		}

		// Converting Set back to array
		int[] result = new int[set.size()];
		int index = 0;
		for (int num : set) {
			result[index++] = num;
		}

		return result;
	}

}
