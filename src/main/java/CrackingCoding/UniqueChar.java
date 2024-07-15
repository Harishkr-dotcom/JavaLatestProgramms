package CrackingCoding;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueChar {
	
	private static boolean hasUniqueCharacters(String testString) {
		HashSet<Character> hs = new HashSet<Character>();
		for(char c: testString.toCharArray()) {
			if(hs.contains(c)) {
				return false;
			}else {
				hs.add(c);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String testString = "Harish";
		if (hasUniqueCharacters(testString)) {
			System.out.println("The string has all unique characters.");
		} else {
			System.out.println("The string does not have all unique characters.");
		}

	}

}
