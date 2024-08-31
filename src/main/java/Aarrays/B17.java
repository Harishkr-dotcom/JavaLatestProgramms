package Aarrays;
// **Find All Subarrays with a Given Sum**:
//Two sum
//- Write a function that finds all subarrays in a given array that sum up to a given value.

import java.util.ArrayList;
import java.util.List;

public class B17 {
	public static List<int[]> findAllSubarraysWithSum(int[] arr, int targetSum) {
        List<int[]> result = new ArrayList<>();
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            // Add the current element to the current sum
            currentSum += arr[end];
            
            // Shrink the window from the start if the current sum exceeds the target
            while (currentSum > targetSum && start <= end) {
                currentSum -= arr[start++];
            }

            // Check if we have found a subarray with the target sum
            if (currentSum == targetSum) {
                result.add(new int[]{start, end});
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int targetSum1 = 9;
        int[] arr4 = {1, 2, 3, 4, 5, 6};
        int targetSum4 = 10;
        int[] arr2 = {1, 2, 3, 7, 5};
        int targetSum2 = 12;
        int[] arr3 = {2, 2, 2, 2, 2};
        int targetSum3 = 6;

        List<int[]> subarrays1 = findAllSubarraysWithSum(arr1, targetSum1);
        List<int[]> subarrays2 = findAllSubarraysWithSum(arr2, targetSum2);
        List<int[]> subarrays3 = findAllSubarraysWithSum(arr3, targetSum3);
        List<int[]> subarrays4 = findAllSubarraysWithSum(arr4, targetSum4);
        
        System.out.println("Subarrays with sum " + targetSum1 + ":");
        for (int[] subarray : subarrays1) {
            System.out.println("Start index: " + subarray[0] + ", End index: " + subarray[1]);
        }

        System.out.println("\nSubarrays with sum " + targetSum2 + ":");
        for (int[] subarray : subarrays2) {
            System.out.println("Start index: " + subarray[0] + ", End index: " + subarray[1]);
        }

        System.out.println("\nSubarrays with sum " + targetSum3 + ":");
        for (int[] subarray : subarrays3) {
            System.out.println("Start index: " + subarray[0] + ", End index: " + subarray[1]);
        }
        
        System.out.println("\nSubarrays with sum " + targetSum4 + ":");
        for (int[] subarray : subarrays4) {
            System.out.println("Start index: " + subarray[0] + ", End index: " + subarray[1]);
        }
    }

}
