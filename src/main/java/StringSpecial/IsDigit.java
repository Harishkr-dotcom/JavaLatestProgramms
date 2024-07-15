package StringSpecial;

public class IsDigit {
	public static boolean isDigitsOnly(String s) {
		if (s == null || s.isEmpty()) {
			return false; // Return false if the string is null or empty
		}

		// Check each character
		for (char c : s.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false; // Return false if any character is not a digit
			}
		}
		return true; // All characters are digits
	}

	public static void main(String[] args) {
		String s1 = "123456";
		String s2 = "123a56";
		String s3 = "";
		String s4 = null;

		System.out.println("s1 contains only digits: " + isDigitsOnly(s1)); // Output: true
		System.out.println("s2 contains only digits: " + isDigitsOnly(s2)); // Output: false
		System.out.println("s3 contains only digits: " + isDigitsOnly(s3)); // Output: false
		System.out.println("s4 contains only digits: " + isDigitsOnly(s4)); // Output: false
	}
}
