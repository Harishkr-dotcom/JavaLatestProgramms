package Imp;

import java.util.Arrays;

public class LongestCommonPrifix {
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		String prefix = strs[0]; // Start with the first string as the initial prefix
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) { // Check if the current prefix is a prefix of strs[i]
				prefix = prefix.substring(0, prefix.length() - 1); // Shorten the prefix
				if (prefix.isEmpty()) { // If prefix becomes empty, there's no common prefix
					return "";
				}
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		String[] strs1 = { "flower", "flow", "flight" };
		System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs1)); // Output: "fl"

		String[] strs2 = { "dog", "racecar", "car" };
		System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs2)); // Output: ""
	}

}
