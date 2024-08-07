package IntervQS;

public class Swapwithouththird {
	 public static void main(String[] args) {
	        String a = "Hello";
	        String b = "World";
	
	        // Print original values
	        System.out.println("Before swap: a = " + a + ", b = " + b);
	
	        // Swapping strings without using a third variable
	        a = a + b;  // Step 1: Concatenate both strings and assign to 'a'
	        b = a.substring(0, a.length() - b.length());  // Step 2: Extract the original 'a' from the concatenated string and assign to 'b'
	        a = a.substring(b.length());  // Step 3: Extract the original 'b' from the concatenated string and assign to 'a'
	
	        // Print swapped values
	        System.out.println("After swap: a = " + a + ", b = " + b);
	    }
}

