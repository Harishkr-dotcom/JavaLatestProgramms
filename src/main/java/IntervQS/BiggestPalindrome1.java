package IntervQS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BiggestPalindrome1 {
	 // Function to check if a number can be rearranged into a palindrome
    public static boolean canFormPalindrome(int num) {
        String numStr = Integer.toString(num);
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the frequency of each digit
        for (char c : numStr.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Check the number of digits with odd counts
        int oddCount = 0;
        for (int count : charCountMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // A palindrome can have at most one digit with an odd count
        return oddCount <= 1;
    }

    // Function to find the largest palindromic number
    public static int largestPalindromicNumber(int[] arr) {
        // Sort the array in descending order
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (canFormPalindrome(arr[i])) {
                return arr[i];
            }
        }
        // Return -1 if no palindromic number can be formed
        return -1;
    }

    public static void main(String[] args) {
        //int[] arr1 = {1, 112, 11};
       // int[] arr2 = {1, 232, 5455455, 909090, 161};
        //int[] arr3 = {14, 2342, 55454545, 9090940, 1641};
    	int[] arr4 = {9090940};

       // System.out.println("Largest palindromic number in arr1: " + largestPalindromicNumber(arr1)); // 112
        //System.out.println("Largest palindromic number in arr2: " + largestPalindromicNumber(arr2)); // 5545455
        System.out.println("Largest palindromic number in arr3: " + largestPalindromicNumber(arr4)); // -1
    }

}
