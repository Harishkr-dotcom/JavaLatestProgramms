package CrackingCoding;

public class Compressthestring {
	public static void main(String[] args) {
		String s = "aabbbbccooooo";
		String compressedString = compressString(s);
		System.out.println(compressedString); 
	}

	public static String compressString(String s) {
		StringBuilder compressed = new StringBuilder();
		int count = 1;

		for (int i = 1; i <= s.length(); i++) {
			if (i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
				compressed.append(s.charAt(i - 1));
				compressed.append(count);
				count = 1;
			} else {
				count++;
			}
		}

		return compressed.toString();
	}

}
