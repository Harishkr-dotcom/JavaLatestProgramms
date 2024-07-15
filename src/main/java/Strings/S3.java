package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

//**Remove Duplicates**: Write a function to remove duplicate characters from a string.
public class S3 {
	
	public static String removeduplicates(String s) {
		String s2="";
		Set<Character> hs = new LinkedHashSet<>();
		for(char c: s.toCharArray()) {
			hs.add(c);
		}
		for(char c: hs) {
			s2+=c;
		}
		return s2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "harish";
		System.out.println(removeduplicates(s));
	}

}
