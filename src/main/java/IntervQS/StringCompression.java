package IntervQS;

public class StringCompression {
	
	public static void main(String[] args) {
		String s1 = "aabbbccccddddeffgghhheekklllleeemm";
		System.out.println(stringcompress(s1));
	}
	
	public static String stringcompress(String s) {
		StringBuilder s1 = new StringBuilder();
		int count=0;
		for(int i=0;i<s.length();i++) {
			count++;
			if(i+1>=s.length() || s.charAt(i)!= s.charAt(i+1)) {
				s1.append(s.charAt(i));
				s1.append(count);
				count=0;
			}
		}
		return s1.toString();
	}

}
