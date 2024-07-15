package CrackingCoding;

public class RemoveSpace {

	public static String replacestring(String s) {
		StringBuilder result = new StringBuilder();
		boolean inWhitespace = false;

		for (char c : s.toCharArray()) {
			if (Character.isWhitespace(c)) {
				if (!inWhitespace) {
					result.append("%20");
					inWhitespace = true;
				}
			} else {
				result.append(c);
				inWhitespace = false;
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String s = "this  is my  laptop";
		System.out.println(replacestring(s));

	}

}
