package StringSpecial;

import java.util.Stack;
//33. **Balanced Parentheses**: Write a function to check if the parentheses in a string are balanced.

public class BalaceParethis {
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				if (stack.isEmpty()) {
					return false; // Unmatched closing parenthesis
				}
				stack.pop();
			}
		}
		// If stack is empty, all opening parentheses had matching closing parentheses
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s1 = "()";
		String s2 = "(()())";
		// String s3 = "(()";
		String s3 = ")";
		String s4 = "(()";
		String s5 = "(a(b)c)d"; // Non-parenthesis characters should be ignored

		System.out.println("s1 is balanced: " + isBalanced(s1)); // Output: true
		System.out.println("s2 is balanced: " + isBalanced(s2)); // Output: true
		System.out.println("s3 is balanced: " + isBalanced(s3)); // Output: false
		System.out.println("s4 is balanced: " + isBalanced(s4)); // Output: false
		System.out.println("s5 is balanced: " + isBalanced(s5)); // Output: true
	}
}
