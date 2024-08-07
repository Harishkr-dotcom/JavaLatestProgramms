package IntervQS;

import java.util.ArrayList;
import java.util.List;

public class PrintUniqueCharectors {
	 public static void main(String[] args) {
	        String s = "Harishhraii";
	        System.out.println(printUniqueCharacters(s));
	    }

	    public static StringBuilder printUniqueCharacters(String s) {
	        boolean[] seen = new boolean[256]; // Assuming ASCII characters
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (!seen[c]) {
	                sb.append(c);
	                seen[c] = true;
	            }
	        }
	        return sb;
	    }
}
