package Aarrays;

public class B11 {
	 public static void main(String[] args) {
	        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

	        int maxSum = maxSubArray(arr);

	        System.out.println("Maximum Subarray Sum: " + maxSum);
	    }

	 public static int maxSubArray(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            throw new IllegalArgumentException("Array should not be null or empty");
	        }
	        
	        int maxCurrent = nums[0];
	        int maxGlobal = nums[0];
	        
	        for (int i = 1; i < nums.length; i++) {
	            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
	            if (maxCurrent > maxGlobal) {
	                maxGlobal = maxCurrent;
	            }
	        }
	        
	        return maxGlobal;
	    }

}


/*
 * Certainly! Let's trace through each iteration of Kadane's Algorithm with the
 * example array `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`.
 * 
 * ### Initial Setup: - `maxSoFar = -2` - `maxEndingHere = -2`
 * 
 * ### Iterations:
 * 
 * 1. **Iteration 1 (i = 1, arr[i] = 1):** - `maxEndingHere = Math.max(1, -2 +
 * 1) = Math.max(1, -1) = 1` - `maxSoFar = Math.max(-2, 1) = 1` - **State:**
 * `maxEndingHere = 1`, `maxSoFar = 1`
 * 
 * 2. **Iteration 2 (i = 2, arr[i] = -3):** - `maxEndingHere = Math.max(-3, 1 -
 * 3) = Math.max(-3, -2) = -2` - `maxSoFar = Math.max(1, -2) = 1` - **State:**
 * `maxEndingHere = -2`, `maxSoFar = 1`
 * 
 * 3. **Iteration 3 (i = 3, arr[i] = 4):** - `maxEndingHere = Math.max(4, -2 +
 * 4) = Math.max(4, 2) = 4` - `maxSoFar = Math.max(1, 4) = 4` - **State:**
 * `maxEndingHere = 4`, `maxSoFar = 4`
 * 
 * 4. **Iteration 4 (i = 4, arr[i] = -1):** - `maxEndingHere = Math.max(-1, 4 -
 * 1) = Math.max(-1, 3) = 3` - `maxSoFar = Math.max(4, 3) = 4` - **State:**
 * `maxEndingHere = 3`, `maxSoFar = 4`
 * 
 * 5. **Iteration 5 (i = 5, arr[i] = 2):** - `maxEndingHere = Math.max(2, 3 + 2)
 * = Math.max(2, 5) = 5` - `maxSoFar = Math.max(4, 5) = 5` - **State:**
 * `maxEndingHere = 5`, `maxSoFar = 5`
 * 
 * 6. **Iteration 6 (i = 6, arr[i] = 1):** - `maxEndingHere = Math.max(1, 5 + 1)
 * = Math.max(1, 6) = 6` - `maxSoFar = Math.max(5, 6) = 6` - **State:**
 * `maxEndingHere = 6`, `maxSoFar = 6`
 * 
 * 7. **Iteration 7 (i = 7, arr[i] = -5):** - `maxEndingHere = Math.max(-5, 6 -
 * 5) = Math.max(-5, 1) = 1` - `maxSoFar = Math.max(6, 1) = 6` - **State:**
 * `maxEndingHere = 1`, `maxSoFar = 6`
 * 
 * 8. **Iteration 8 (i = 8, arr[i] = 4):** - `maxEndingHere = Math.max(4, 1 + 4)
 * = Math.max(4, 5) = 5` - `maxSoFar = Math.max(6, 5) = 6` - **State:**
 * `maxEndingHere = 5`, `maxSoFar = 6`
 * 
 * ### Final Result: - The maximum sum subarray has a sum of `6`.
 * 
 * ### Detailed Trace: 1. Start with the first element: `maxSoFar = -2`,
 * `maxEndingHere = -2` 2. Move to the second element (1): - `maxEndingHere =
 * max(1, -1) = 1` - `maxSoFar = max(-2, 1) = 1` 3. Move to the third element
 * (-3): - `maxEndingHere = max(-3, -2) = -2` - `maxSoFar remains 1` 4. Move to
 * the fourth element (4): - `maxEndingHere = max(4, 2) = 4` - `maxSoFar =
 * max(1, 4) = 4` 5. Move to the fifth element (-1): - `maxEndingHere = max(-1,
 * 3) = 3` - `maxSoFar remains 4` 6. Move to the sixth element (2): -
 * `maxEndingHere = max(2, 5) = 5` - `maxSoFar = max(4, 5) = 5` 7. Move to the
 * seventh element (1): - `maxEndingHere = max(1, 6) = 6` - `maxSoFar = max(5,
 * 6) = 6` 8. Move to the eighth element (-5): - `maxEndingHere = max(-5, 1) =
 * 1` - `maxSoFar remains 6` 9. Move to the ninth element (4): - `maxEndingHere
 * = max(4, 5) = 5` - `maxSoFar remains 6`
 * 
 * This completes the trace of Kadane’s Algorithm on the provided array, showing
 * how the maximum sum subarray sum is determined step-by-step.
 */