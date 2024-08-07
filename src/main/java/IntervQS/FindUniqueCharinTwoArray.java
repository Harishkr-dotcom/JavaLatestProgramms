package IntervQS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FindUniqueCharinTwoArray {
	public static String findUncommonCharacters(String str1, String str2) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count character frequencies in both strings
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find characters with frequency 1
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                result.append(entry.getKey());
            }
        }

        // Sort the result string
        char[] charArray = result.toString().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str1 = "characters";
        String str2 = "alphabets";
        String uncommonChars = findUncommonCharacters(str1, str2);
        System.out.println(uncommonChars); // Output: abors
    }
}
