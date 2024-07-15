package StringSpecial;

public class StringRotation {
	 public static boolean areRotations(String s1, String s2) {
	        // Check if lengths are the same
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        // Concatenate s1 with itself
	        String concatenated = s1 + s1;

	        // Check if s2 is a substring of the concatenated string
	        return concatenated.contains(s2);
	    }

	    public static void main(String[] args) {
	        String s1 = "waterbottle";
	        String s2 = "erbottlewat";
	        String s3 = "bottlewater";
	        String s4 = "waterbottler";

	        System.out.println("s2 is rotation of s1: " + areRotations(s1, s2));  // Output: true
	        System.out.println("s3 is rotation of s1: " + areRotations(s1, s3));  // Output: true
	        System.out.println("s4 is rotation of s1: " + areRotations(s1, s4));  // Output: false
	    }
}
