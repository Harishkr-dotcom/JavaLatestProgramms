package Strings;
// **String Permutations**: Write a function to generate all permutations of a given string.
import java.util.ArrayList;
import java.util.List;

public class S6 {
	public static void main(String[] args) {
		testGeneratePermutations("ABC");
		testGeneratePermutations("123");
		testGeneratePermutations("A");
		testGeneratePermutations("");
	}

	public static void testGeneratePermutations(String str) {
		List<String> permutations = generatePermutations(str);
		System.out.println("Permutations of \"" + str + "\": " + permutations);
	}

	public static List<String> generatePermutations(String str) {
		List<String> result = new ArrayList<>();
		permute(str, 0, str.length() - 1, result);
		return result;
	}

	private static void permute(String str, int l, int r, List<String> result) {
		if (l == r) {
			result.add(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r, result);
				str = swap(str, l, i); // backtrack
			}
		}
	}

	public static String swap(String a, int i, int j) {
		char[] charArray = a.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
