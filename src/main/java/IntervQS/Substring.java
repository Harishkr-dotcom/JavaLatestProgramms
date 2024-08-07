package IntervQS;

public class Substring {
	
	public static boolean issubtring(String s, String sub) {
		int count =0;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)==sub.charAt(count)) {
				count++;
			}else {
				i=count;
				count =0;
			}
			if(count == sub.length()) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		String sub = "cd";
		System.out.println(Substring.issubtring(s, sub));
	}

}
