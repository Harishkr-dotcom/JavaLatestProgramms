package IntervQS;

public class Pattern {
	public static void main(String[] args) {
        int rows = 6;  // Number of rows

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Print spaces for pyramid structure
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in each row
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }

}
