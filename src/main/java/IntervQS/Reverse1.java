package IntervQS;

public class Reverse1 {
	public static void main(String[] args) {
		String s = "I Love Java Coding";
		char[] arr = s.toCharArray();
		StringBuffer br = new StringBuffer();

		
		int j = 0; // A separate index to handle spaces correctly
		for (int i = arr.length - 1; i >= 0; i--) {
			if (Character.isAlphabetic(arr[i])) {
				br.append(arr[i]);
			} else if (Character.isWhitespace(arr[i])) {
				br.insert(j, " "); // Insert space at the appropriate index
				j++; // Increment j to adjust for the space
			}
		}

		System.out.println(br.toString());
	}

}
