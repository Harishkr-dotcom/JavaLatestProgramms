package StringSpecial;

import java.util.Stack;
//29. **Valid Parentheses**: Write a function to check if a string containing just the characters '(', ')', '{', '}', '[' and ']' is valid.

public class ValidParantheses {
	  public static boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        // Map to hold the pairs of opening and closing brackets
	        java.util.Map<Character, Character> map = new java.util.HashMap<>();
	        map.put('(', ')');
	        map.put('{', '}');
	        map.put('[', ']');

	        // Iterate through each character in the string
	        for (char c : s.toCharArray()) {
	            if (map.containsKey(c)) {
	                // If it's an opening bracket, push it onto the stack
	                stack.push(c);
	            } else if (map.containsValue(c)) {
	                // If it's a closing bracket
	                if (stack.isEmpty() || map.get(stack.pop()) != c) {
	                    return false;
	                }
	            }
			}

			// If the stack is empty, all opening brackets had matching closing brackets
			return stack.isEmpty();
		}

		public static void main(String[] args) {
			String s1 = "()";
			String s2 = "()[]{}";
			String s3 = "(]";
			String s4 = "([)]";
			String s5 = "{[]}";

			System.out.println("s1 is valid: " + isValid(s1)); // Output: true
			System.out.println("s2 is valid: " + isValid(s2)); // Output: true
			System.out.println("s3 is valid: " + isValid(s3)); // Output: false
			System.out.println("s4 is valid: " + isValid(s4)); // Output: false
			System.out.println("s5 is valid: " + isValid(s5)); // Output: true
		}
}
