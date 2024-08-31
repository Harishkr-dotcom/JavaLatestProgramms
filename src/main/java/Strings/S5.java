package Strings;

public class S5 {
	public static void main(String[] args) {
		String mainString = "Hello World!";
		String subString = "World";

		boolean result = isSubstring(mainString, subString);
		System.out.println("Is the substring present? " + result);
	}

	public static boolean isSubstring(String mainString, String subString) {
		int mainLength = mainString.length();
		int subLength = subString.length();

		// If the substring is longer than the main string, it can't be a substring
		if (subLength > mainLength) {
			return false;
		}

		// Loop through the main string
		for (int i = 0; i <= mainLength - subLength; i++) {
			if (mainString.startsWith(subString, i)) {
				return true;
			}
		}

		return false;
	}

}
