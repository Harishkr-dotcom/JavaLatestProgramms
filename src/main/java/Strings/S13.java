package Strings;

public class S13 {
	// Function to check if one string is a rotation of another
	public static boolean isRotation(String s1, String s2) {
		// If lengths are different, return false
		if (s1.length() != s2.length()) {
			return false;
		}

		// Concatenate s1 with itself
		String concatenated = s1 + s1;

		// Check if s2 is a substring of concatenated s1
		return concatenated.contains(s2);
	}

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";

		System.out.println("Is \"" + s2 + "\" a rotation of \"" + s1 + "\"? " + isRotation(s1, s2)); // true

		String s3 = "hello";
		String s4 = "world";

		System.out.println("Is \"" + s4 + "\" a rotation of \"" + s3 + "\"? " + isRotation(s3, s4)); // false
	}
}
