package StringSpecial;

import java.util.Stack;
//29. **Valid Parentheses**: Write a function to check if a string containing just the characters '(', ')', '{', '}', '[' and ']' is valid.

public class ValidParantheses {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (char ch : s.toCharArray()) {
			switch (ch) {
			case '(':
			case '[':
			case '{':
				stack.push(ch);
				break;
			case ')':
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
				break;
			case ']':
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
				break;
			case '}':
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
				break;
			default:
				// Invalid character (not a parenthesis)
				return false;
			}
		}
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
