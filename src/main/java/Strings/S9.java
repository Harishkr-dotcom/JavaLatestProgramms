package Strings;

import java.util.HashMap;
//13. **Longest Substring Without Repeating Characters**: Write a function to find the length of the longest substring without repeating characters.

public class S9 {

	/*
	 * public static void main(String[] args) {
	 * testLengthOfLongestSubstring("abcabcbb", 3);
	 * testLengthOfLongestSubstring("bbbbb", 1);
	 * testLengthOfLongestSubstring("pwwkew", 3);
	 * testLengthOfLongestSubstring("dvdf", 3); testLengthOfLongestSubstring("", 0);
	 * }
	 */

	 public static void main(String[] args) {
	        String str = "pwwkew";
	        int longestSubstring = longestSubstringWithoutRepeating(str);
	        System.out.println("Longest substring without repeating characters: " + longestSubstring);
	        //System.out.println("Length of the longest substring: " + longestSubstring.length());
	    }

	    public static int longestSubstringWithoutRepeating(String str) {
	    	int longestSubString=0;
			int left=0;
			int[] charArr = new int[128];
			int val=0;
			
			for(int right=0;right<str.length();right++)
			{
				val= str.charAt(right);
				left=Math.max(left,charArr[val]);
				longestSubString=Math.max(longestSubString, right-left+1);
				charArr[val]=right+1;
			}
			
			return longestSubString;
	    }
}
