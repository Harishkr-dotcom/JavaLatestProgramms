package IntervQS;

public class PrintOccurence {

	public static void main(String[] args) {
		String s = "aabbcc";
		String newstring = "";
		int count = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				newstring = newstring+ count + "" + s.charAt(i - 1);
				count = 1;
			}
		}
		newstring = newstring +count + "" + s.charAt(s.length() - 1);
		System.out.println(newstring);
	}
}
