package Strings;

public class S2 {
	
	public static boolean checkpalindrome(String s) {
		String s2 = "";
		for(int i=s.length()-1;i>=0;i--) {
			s2+=s.charAt(i);
		}
		if(s2.equalsIgnoreCase(s)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Malayalam";
		System.out.println(checkpalindrome(s));
	}

}
