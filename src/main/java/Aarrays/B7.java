package Aarrays;

public class B7 {
	public static void main(String[] args) {
		int[] sortedArray = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };
		int length = sortedArray.length;

		int newLength = removeduplicates(sortedArray);

		// Print the array without duplicates
		for (int i = 0; i < newLength; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}

	public static int removeduplicates(int[] a) {
		int unique = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[unique]) {
				unique++;
				a[unique] = a[i];
			}
		}
		return unique + 1;
	}

}
