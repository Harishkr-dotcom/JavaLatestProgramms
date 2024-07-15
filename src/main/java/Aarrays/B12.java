package Aarrays;

import java.util.HashSet;
import java.util.Set;

public class B12 {
	public static void findPairs(int[] arr, int sum) {
		Set<Integer> set = new HashSet<>();
		Set<String> uniquePairs = new HashSet<>();

		for (int num : arr) {
			int target = sum - num;
			if (set.contains(target)) {
				int first = Math.min(num, target);
				int second = Math.max(num, target);
				uniquePairs.add("(" + first + ", " + second + ")");
			}
			set.add(num);
		}

		for (String pair : uniquePairs) {
			System.out.println(pair);
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 7, -1, 5 };
		int sum1 = 6;
		System.out.println("Input: arr[] = {1, 5, 7, -1, 5}, sum = 6");
		System.out.println("Output:");
		findPairs(arr1, sum1);

		int[] arr2 = { 2, 5, 17, -1 };
		int sum2 = 7;
		System.out.println("\nInput: arr[] = {2, 5, 17, -1}, sum = 7");
		System.out.println("Output:");
		findPairs(arr2, sum2);
	}
	
	/*
	 * Certainly! Let's go through the first example with detailed iterations.
	 * 
	 * ### Example 1: arr[] = {1, 5, 7, -1, 5}, sum = 6
	 ** 
	 * Initialization:** - `set = {}` (initially empty) - `uniquePairs = {}`
	 * (initially empty)
	 ** 
	 * Iteration 1:** - `num = 1` - `target = sum - num = 6 - 1 = 5` - `set` does
	 * not contain `5` - Add `1` to `set` - `set = {1}`
	 ** 
	 * Iteration 2:** - `num = 5` - `target = sum - num = 6 - 5 = 1` - `set`
	 * contains `1` - Found a pair `(1, 5)` - Ensure the pair is stored in a
	 * consistent format: `(1, 5)` - Add `(1, 5)` to `uniquePairs` - Add `5` to
	 * `set` - `set = {1, 5}` - `uniquePairs = {"(1, 5)"}`
	 ** 
	 * Iteration 3:** - `num = 7` - `target = sum - num = 6 - 7 = -1` - `set` does
	 * not contain `-1` - Add `7` to `set` - `set = {1, 5, 7}`
	 ** 
	 * Iteration 4:** - `num = -1` - `target = sum - num = 6 - (-1) = 7` - `set`
	 * contains `7` - Found a pair `(-1, 7)` - Ensure the pair is stored in a
	 * consistent format: `(-1, 7)` - Add `(-1, 7)` to `uniquePairs` - Add `-1` to
	 * `set` - `set = {1, 5, 7, -1}` - `uniquePairs = {"(1, 5)", "(-1, 7)"}`
	 ** 
	 * Iteration 5:** - `num = 5` - `target = sum - num = 6 - 5 = 1` - `set`
	 * contains `1` - Found a pair `(1, 5)` - Ensure the pair is stored in a
	 * consistent format: `(1, 5)` - The pair `(1, 5)` is already in `uniquePairs`,
	 * so we do not add it again - Add `5` to `set` (though it's already there, this
	 * step is redundant) - `set = {1, 5, 7, -1}` - `uniquePairs = {"(1, 5)",
	 * "(-1, 7)"}`
	 ** 
	 * Final Output:** - `uniquePairs = {"(1, 5)", "(-1, 7)"}` - Print each unique
	 * pair: - `(1, 5)` - `(-1, 7)`
	 * 
	 * ### Example 2: arr[] = {2, 5, 17, -1}, sum = 7
	 ** 
	 * Initialization:** - `set = {}` (initially empty) - `uniquePairs = {}`
	 * (initially empty)
	 ** 
	 * Iteration 1:** - `num = 2` - `target = sum - num = 7 - 2 = 5` - `set` does
	 * not contain `5` - Add `2` to `set` - `set = {2}`
	 ** 
	 * Iteration 2:** - `num = 5` - `target = sum - num = 7 - 5 = 2` - `set`
	 * contains `2` - Found a pair `(2, 5)` - Ensure the pair is stored in a
	 * consistent format: `(2, 5)` - Add `(2, 5)` to `uniquePairs` - Add `5` to
	 * `set` - `set = {2, 5}` - `uniquePairs = {"(2, 5)"}`
	 ** 
	 * Iteration 3:** - `num = 17` - `target = sum - num = 7 - 17 = -10` - `set`
	 * does not contain `-10` - Add `17` to `set` - `set = {2, 5, 17}`
	 ** 
	 * Iteration 4:** - `num = -1` - `target = sum - num = 7 - (-1) = 8` - `set`
	 * does not contain `8` - Add `-1` to `set` - `set = {2, 5, 17, -1}`
	 ** 
	 * Final Output:** - `uniquePairs = {"(2, 5)"}` - Print each unique pair: - `(2,
	 * 5)`
	 * 
	 * In both examples, the algorithm efficiently finds all unique pairs whose sum
	 * equals the given value using a hash set for O(1) average-time lookups and
	 * insertions.
	 */
}
