package IntervQS;

public class StringCompressionandRename {
	public static void main(String[] args) {
		String s1 = "aabbbccccddddeffgghhheekklllleeemm";
		String s2 = "3";
		System.out.println(s1.length());
		System.out.println(compressString(s1,s2));
	}

	public static String compressString(String s, String s1) {
		StringBuilder compressed = new StringBuilder();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			count++;
			if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
				if (count != Integer.parseInt(s1)) {
					for (int j = 1; j <=count; j++) {
						compressed.append(s.charAt(i));
					}
					count = 0;
				}
				if(count==Integer.parseInt(s1)) {
					count=0;
				}

			}
		}
		return compressed.toString();
	}
}
