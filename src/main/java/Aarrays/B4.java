package Aarrays;

//Write a function that reverses a given array.
public class B4 {
	// Function to reverse an array using for loop
	public static void reverseArray(int[] array) {
		int n = array.length;
		for (int i = 0; i < n / 2; i++) {
			// Swap the elements at i and n-1-i
			int temp = array[i];
			array[i] = array[n - 1 - i];
			array[n - 1 - i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6,9 };
		System.out.println("Original Array: ");
		printArray(array);

		reverseArray(array);

		System.out.println("Reversed Array: ");
		printArray(array);
	}

	// Utility function to print an array
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
