package Imp;

import java.util.HashSet;
import java.util.Set;

public class PrintAllPalandromicSubtring {
	public static Set<String> findAllPalindromicSubstrings(String s) {
        Set<String> palindromes = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            // Find odd-length palindromes (single character center)
            expandAroundCenter(s, i, i, palindromes);
            // Find even-length palindromes (center between characters)
            expandAroundCenter(s, i, i + 1, palindromes);
        }
        
        return palindromes;
    }

    private static void expandAroundCenter(String s, int left, int right, Set<String> palindromes) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            palindromes.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        String s = "abacabad";
        Set<String> palindromicSubstrings = findAllPalindromicSubstrings(s);
        System.out.println("Palindromic substrings: " + palindromicSubstrings);
    }

}
