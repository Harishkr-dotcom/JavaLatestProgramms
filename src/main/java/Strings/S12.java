package Strings;

import java.util.Stack;

public class S12 {
	 // Function to check if parentheses are balanced
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening parenthesis
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; // Mismatched parentheses
                }
            }
        }

        return stack.isEmpty(); // Stack should be empty for balanced parentheses
    }

    public static void main(String[] args) {
        String str = "((()))";
        System.out.println("Are parentheses balanced? " + isBalanced(str)); // true

        String str2 = "{[()]()}";
        System.out.println("Are parentheses balanced? " + isBalanced(str2)); // true

        String str3 = "{[(])}";
        System.out.println("Are parentheses balanced? " + isBalanced(str3)); // false
    }
}
