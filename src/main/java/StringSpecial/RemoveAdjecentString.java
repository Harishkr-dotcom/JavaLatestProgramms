package StringSpecial;

import java.util.Stack;

public class RemoveAdjecentString {
	 public static String removeAdjacentDuplicates(String s) {
	        // Create a stack to keep track of characters
	        Stack<Character> stack = new Stack<>();

	        // Traverse each character in the string
	        for (char c : s.toCharArray()) {
	            // If stack is not empty and top of the stack is the same as the current character
	            if (!stack.isEmpty() && stack.peek() == c) {
	                // Pop the stack as it's an adjacent duplicate
	                stack.pop();
	            } else {
	                // Push the current character onto the stack
	                stack.push(c);
	            }
	        }

	        // Construct the result string from the stack
	        StringBuilder result = new StringBuilder();
	        while (!stack.isEmpty()) {
	            result.append(stack.pop());
	        }

	        // The result is in reverse order, so reverse it
	        return result.reverse().toString();
	    }

	    public static void main(String[] args) {
	        String s1 = "abbaca";
	        String s2 = "aabbcc";
	        String s3 = "abcd";
	        String s4 = "aaabbaa";

	        System.out.println("s1 after removing adjacent duplicates: " + removeAdjacentDuplicates(s1));  // Output: "ca"
	        System.out.println("s2 after removing adjacent duplicates: " + removeAdjacentDuplicates(s2));  // Output: ""
	        System.out.println("s3 after removing adjacent duplicates: " + removeAdjacentDuplicates(s3));  // Output: "abcd"
	        System.out.println("s4 after removing adjacent duplicates: " + removeAdjacentDuplicates(s4));  // Output: ""
	    }
}
