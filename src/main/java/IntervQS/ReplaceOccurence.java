package IntervQS;

public class ReplaceOccurence {
	public static String removeCharOccurrences(String inputString, char charToRemove) {
		String modifiedString = inputString.replaceAll(String.valueOf(charToRemove), "");
		return modifiedString;
	}

	public static void main(String[] args) {
		String inputString = "hello world";
		char charToRemove = 'o';
		String result = removeCharOccurrences(inputString, charToRemove);
		System.out.println("Modified String: " + result);
	}

}
