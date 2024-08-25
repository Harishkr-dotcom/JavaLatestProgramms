package IntervQS;

import java.util.HashMap;

public class Vowels {
	// Method to replace consonants with the next consonant in the alphabet
	public static String replaceConsonants(String s) {
		// List of consonants
		String consonants = "bcdfghjklmnpqrstvwxyz";

		// Create a HashMap to map each consonant to its next consonant
		HashMap<Character, Character> nextConsonantMap = new HashMap<>();
		nextConsonantMap.put('b', 'c');
		nextConsonantMap.put('c', 'd');
		nextConsonantMap.put('d', 'f');
		nextConsonantMap.put('f', 'g');
		nextConsonantMap.put('g', 'h');
		nextConsonantMap.put('h', 'j');
		nextConsonantMap.put('j', 'k');
		nextConsonantMap.put('k', 'l');
		nextConsonantMap.put('l', 'm');
		nextConsonantMap.put('m', 'n');
		nextConsonantMap.put('n', 'p');
		nextConsonantMap.put('p', 'q');
		nextConsonantMap.put('q', 'r');
		nextConsonantMap.put('r', 's');
		nextConsonantMap.put('s', 't');
		nextConsonantMap.put('t', 'v');
		nextConsonantMap.put('v', 'w');
		nextConsonantMap.put('w', 'x');
		nextConsonantMap.put('x', 'y');
		nextConsonantMap.put('y', 'z');
		nextConsonantMap.put('z', 'b');
		
		StringBuilder result = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (nextConsonantMap.containsKey(ch)) {
				result.append(nextConsonantMap.get(ch));
			} else {
				result.append(ch);
			}
		}

		return result.toString();
	}

	// Main method to test the solution
	public static void main(String[] args) {
		System.out.println(replaceConsonants("hello world")); // Output: jemmo xosmf
		System.out.println(replaceConsonants("quality")); // Output: ruamivz
		System.out.println(replaceConsonants("golden")); // Output: homfep
		System.out.println(replaceConsonants("zigzag")); // Output: bihbah
	}
}
