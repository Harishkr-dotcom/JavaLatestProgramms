package Strings;

public class S14 {
	// Function to find and replace patterns in a string
	public static String findReplaceString(String str, String pattern, String replacement) {
		StringBuilder sb = new StringBuilder();
		int index = 0;
		int patternLength = pattern.length();

		while (index < str.length()) {
			// Check if the substring from index matches the pattern
			if (index <= str.length() - patternLength && str.substring(index, index + patternLength).equals(pattern)) {
				// If pattern found, append replacement and move index past the pattern
				sb.append(replacement);
				index += patternLength;
			} else {
				// Otherwise, append the original character and move index forward by one
				sb.append(str.charAt(index));
				index++;
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String originalString = "Hello world! This is a test string.";
		String pattern = "world";
		String replacement = "Java";

		System.out.println("Original String: " + originalString);
		String replacedString = findReplaceString(originalString, pattern, replacement);
		System.out.println("Replaced String: " + replacedString);
	}
}
