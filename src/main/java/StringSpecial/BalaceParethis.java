package StringSpecial;

import java.util.Stack;
//33. **Balanced Parentheses**: Write a function to check if the parentheses in a string are balanced.

public class BalaceParethis {
	 public static boolean isBalanced(String s) {
	        Stack<Character> stack = new Stack<>();

	        // Traverse each character in the string
	        for (char c : s.toCharArray()) {
	            switch (c) {
	                case '(':
	                    // Push opening parenthesis onto the stack
	                    stack.push(c);
	                    break;
	                case ')':
	                    // For closing parenthesis, check if stack is empty or top does not match
	                    if (stack.isEmpty() || stack.pop() != '(') {
	                        return false;
	                    }
	                    break;
	                // Ignore any non-parenthesis characters
	                default:
	                    break;
	            }
	        }

	        // If the stack is empty, all opening parentheses were matched
	        return stack.isEmpty();
	    }

	    public static void main(String[] args) {
	        String s1 = "()";
	        String s2 = "(()())";
	        String s3 = "(()";
	        String s4 = "())";
	        String s5 = "(a(b)c)d"; // Non-parenthesis characters should be ignored

	        System.out.println("s1 is balanced: " + isBalanced(s1));  // Output: true
	        System.out.println("s2 is balanced: " + isBalanced(s2));  // Output: true
	        System.out.println("s3 is balanced: " + isBalanced(s3));  // Output: false
	        System.out.println("s4 is balanced: " + isBalanced(s4));  // Output: false
	        System.out.println("s5 is balanced: " + isBalanced(s5));  // Output: true
	    }
}
