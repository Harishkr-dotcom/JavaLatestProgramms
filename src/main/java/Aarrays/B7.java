package Aarrays;

public class B7 {
	 public static void main(String[] args) {
	        int[] sortedArray = {1, 1, 2, 2, 3, 4, 4, 5,5};
	        int length = sortedArray.length;

	        int newLength = removeDuplicates(sortedArray, length);

	        // Print the array without duplicates
	        for (int i = 0; i < newLength; i++) {
	            System.out.print(sortedArray[i] + " ");
	        }
	    }

	    public static int removeDuplicates(int[] array, int length) {
	        if (length == 0 || length == 1) {
	            return length;
	        }

	        // Index of next unique element
	        int j = 0;

	        // Traverse the sorted array
	        for (int i = 0; i < length - 1; i++) {
	            // If the current element is not equal to the next element
	            if (array[i] != array[i + 1]) {
	                array[j++] = array[i];
	            }
	        }

	        // Store the last element as it's not checked in the loop
	        array[j++] = array[length - 1];

	        return j;
	    }

}
