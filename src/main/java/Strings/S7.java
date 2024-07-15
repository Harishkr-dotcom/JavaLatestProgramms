package Strings;

import java.util.ArrayList;
import java.util.List;

public class S7 {
	 public static void main(String[] args) {
	        testFindAllSubstrings("abc");
	        testFindAllSubstrings("abcd");
	        testFindAllSubstrings("a");
	        testFindAllSubstrings("");
	    }

	    public static void testFindAllSubstrings(String str) {
	        List<String> substrings = findAllSubstrings(str);
	        System.out.println("All Substrings of \"" + str + "\": " + substrings);
	    }

	    public static List<String> findAllSubstrings(String str) {
	        List<String> result = new ArrayList<>();

	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j <= str.length(); j++) {
	                result.add(str.substring(i, j));
	            }
	        }

	        return result;
	    }
}
