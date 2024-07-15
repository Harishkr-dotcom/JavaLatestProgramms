package Strings;
//17. **Longest Palindromic Substring**: Write a function to find the longest palindromic substring in a given string.

import java.util.Arrays;

public class S10 {
	 // Function to find the longest repeated substring using suffix array
    public static String longestRepeatedSubstring(String str) {
        int n = str.length();
        // Create an array of suffixes
        String[] suffixes = new String[n];
        for (int i = 0; i < n; i++) {
            suffixes[i] = str.substring(i);
            System.out.println(suffixes[i]);
        }

        // Sort the suffixes lexicographically
        Arrays.sort(suffixes);

        // Find the longest repeated substring by comparing adjacent sorted suffixes
        String lrs = "";
        for (int i = 0; i < n - 1; i++) {
            String lcp = longestCommonPrefix(suffixes[i], suffixes[i + 1]);
            if (lcp.length() > lrs.length()) {
                lrs = lcp;
            }
        }

        return lrs;
    }

    // Function to find the longest common prefix between two strings
    private static String longestCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        System.out.println(minLength);
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }
        return str1.substring(0, minLength);
    }

    public static void main(String[] args) {
       String str = "banana";
        System.out.println("Longest repeated substring: " + longestRepeatedSubstring(str));
    }
}
