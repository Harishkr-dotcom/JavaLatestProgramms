package Strings;
// **String Permutations**: Write a function to generate all permutations of a given string.
import java.util.ArrayList;
import java.util.List;

public class S6 {
	public static void main(String[] args) {
		String s1 = "KAR";
		System.out.println(generateallpermutation(s1));
	}

	public static void swap(char[] c, int i, int j) {
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}

	public static void generatepermutation(char[] c, int index, List<String> list) {
		if (index == c.length - 1) {
			list.add(new String(c));
		} else {
			for (int i = index; i < c.length; i++) {
				swap(c, index, i);
				generatepermutation(c, index+1, list);
				swap(c, index, i);
			}
		}
	}

	public static List<String> generateallpermutation(String s) {
		List<String> result = new ArrayList<String>();
		generatepermutation(s.toCharArray(), 0, result);
		return result;
	}
}
