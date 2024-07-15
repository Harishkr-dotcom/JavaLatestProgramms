package Strings;

public class S1 {

	public static void main(String[] args) {
		String s = "harish";
		String s1 = "";
		for(int i=s.length()-1;i>=1;i--) {
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
	}

}
