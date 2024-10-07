package IntervQS;

public class AddInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc123zxs11";
        int sum = 0;
        StringBuilder number = new StringBuilder();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(c)) {
                number.append(c);  // Accumulate the digit
            } else {
                // If we hit a non-digit and number is not empty, convert and add to sum
                if (number.length() > 0) {
                    sum += Integer.parseInt(number.toString());
                    number.setLength(0);  // Reset for the next number
                }
            }
        }

        // Add the last number if the string ends with digits
        if (number.length() > 0) {
           sum += Integer.parseInt(number.toString());
        }

        System.out.println("Sum: " + sum);
    }


}
