package Strings;

import java.util.Arrays;

//**Anagram Check**: Write a function to check if two strings are anagrams of each other.
public class S8 {
	public static void main(String[] args) {
		// Check the characters are two strings are same or not
		String s = "Brag";
		String a = "Grab";
		char[] sarray = s.toLowerCase().toCharArray();
		char[] aarray = a.toLowerCase().toCharArray();
		if (sarray.length == aarray.length) {
			Arrays.sort(sarray);
			Arrays.sort(aarray);
			if (Arrays.equals(sarray, aarray)) {
				System.out.println("Both strings characters are same");
			} else {
				System.out.println("Both string characters are not same");
			}
		} else {
			System.out.println("Please provide the both string with same length");
		}

	}
}
