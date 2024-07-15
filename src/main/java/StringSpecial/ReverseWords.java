package StringSpecial;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
	  public static String reverseWords(String s) {
	        // Trim the string to remove leading and trailing spaces
	        s = s.trim();
	        
	        // Split the string into words by spaces
	        String[] words = s.split("\\s+");

	        // Convert the array to a list for easier manipulation
	        List<String> wordList = Arrays.asList(words);

	        // Reverse the list of words
	        Collections.reverse(wordList);

	        // Join the reversed list into a single string with a single space separator
	        return String.join(" ", wordList);
	    }

	    public static void main(String[] args) {
	        String s1 = "The quick brown fox jumps over the lazy dog";
	        String s2 = "Hello World";
	        String s3 = "Java is fun";
	        String s4 = "   Leading and trailing spaces   ";

	        System.out.println("Reversed words in s1: " + reverseWords(s1));  // Output: "dog lazy the over jumps fox brown quick The"
	        System.out.println("Reversed words in s2: " + reverseWords(s2));  // Output: "World Hello"
	        System.out.println("Reversed words in s3: " + reverseWords(s3));  // Output: "fun is Java"
	        System.out.println("Reversed words in s4: " + reverseWords(s4));  // Output: "spaces trailing and Leading"
	    }
}
