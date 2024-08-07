package Strings;

import java.util.HashSet;
import java.util.Set;

public class S7 {
	public static void main(String[] args) {
		String str = "ABC";
		Set<String> substrings = findAllSubstrings(str);
		System.out.println(substrings);
	}

	public static Set<String> findAllSubstrings(String str) {
		Set<String> substrings = new HashSet<>();

		if (str == null || str.isEmpty()) {
			return substrings;
		}

		int length = str.length();
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j <= length; j++) {
				substrings.add(str.substring(i, j));
			}
		}

		return substrings;
	}

}
