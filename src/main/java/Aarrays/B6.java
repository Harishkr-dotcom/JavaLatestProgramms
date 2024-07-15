package Aarrays;

public class B6 {
	public static void main(String[] args) {
		int[] arr = { 12, 35, 1, 10, 34, 1 };
		int secondLargest = findSecondLargest(arr);

		if (secondLargest != Integer.MIN_VALUE) {
			System.out.println("The second largest element is: " + secondLargest);
		} else {
			System.out.println("There is no second largest element.");
		}
	}

	public static int findSecondLargest(int[] arr) {
		if (arr == null || arr.length < 2) {
			return Integer.MIN_VALUE; // Return a sentinel value to indicate no second largest element
		}

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			} else if (num > secondLargest && num != firstLargest) {
				secondLargest = num;
			}
		}

		return secondLargest;
	}
}
