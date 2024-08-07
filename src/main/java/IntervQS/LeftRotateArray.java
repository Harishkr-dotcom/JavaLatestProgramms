package IntervQS;

public class LeftRotateArray {
	 public static void leftRotate(int[] arr, int d) {
	        int n = arr.length;
	        System.out.println(n);
	        d = d % n; // Handle cases where d is greater than n
	        System.out.println(d);

	        // Create a temporary array to hold the first d elements
	        int[] temp = new int[d];
	        for (int i = 0; i < d; i++) {
	            temp[i] = arr[i];
	        }

	        // Shift the remaining elements to the left
	        for (int i = 0; i < n - d; i++) {
	            arr[i] = arr[i + d];
	        }

	        // Copy the temp array to the end of the original array
	        for (int i = 0; i < d; i++) {
	            arr[n - d + i] = temp[i];
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int d = 2;
	        leftRotate(arr, d);

	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

}
