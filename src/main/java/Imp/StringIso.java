package Imp;

import java.util.HashMap;

public class StringIso {
	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false; // Strings must be of the same length
		}

		// Maps to store character mappings from s to t and t to s
		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char char1 = s.charAt(i);
			char char2 = t.charAt(i);

			// Check if charS has already been mapped to a different charT
			if (map1.containsKey(char1)) {
				if (map1.get(char1) != char2) {
					return false; // Mismatch in mapping
				}
			} else {
				map1.put(char1, char2); // Map charS to charT
			}

			// Check if charT has already been mapped to a different charS
			if (map2.containsKey(char2)) {
				if (map2.get(char2) != char1) {
					return false; // Mismatch in reverse mapping
				}
			} else {
				map2.put(char2, char1); // Map charT to charS
			}
		}

		return true; // Strings are isomorphic
	}

	public static void main(String[] args) {
		String s1 = "egg";
		String s2 = "add";

		String s3 = "foo";
		String s4 = "bar";

		String s5 = "aab";
		String s6 = "xxy";
		System.out.println(isIsomorphic(s1, s2)); // Output: true
		System.out.println(isIsomorphic(s3, s4)); // Output: false
		System.out.println(isIsomorphic(s5, s6));
	}
}
